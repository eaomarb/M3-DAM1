package Rellotge;

public class Rellotge {
    /*Class parameters*/
    private int hours;
    private int minutes;
    private int seconds;

    /*Getters & Setters*/
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (validateHours(hours)) {
            this.hours = hours;
        }
    }


    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (validateMinutes(minutes))
            this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (validateSeconds(seconds)) {
            this.seconds = seconds;
        }
    }

    /*Constructors*/
    public Rellotge() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Rellotge(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }


    /*Private methods*/
    private boolean validateHours(int hours) {
        return hours <= 23 && hours >= 0;
    }

    private boolean validateMinutes(int minutes) {
        return minutes <= 59 && minutes >= 0;
    }

    private boolean validateSeconds(int seconds) {
        return seconds <= 59 && seconds >= 0;
    }

    public void addOneSecond() {
        seconds = (seconds + 1) % 60;
        if (seconds == 0) {
            minutes = (minutes + 1) % 60;
            if (minutes == 0) {
                hours = (hours + 1) % 24;
            }
        }
    }

    public void addSeconds(int seconds) {
        int sumaSegons = this.hours * 3600 + this.minutes * 60 + this.seconds + seconds;
        this.hours = sumaSegons / 3600 % 24;
        this.minutes = sumaSegons % 3600 / 60;
        this.seconds = sumaSegons % 3600 % 60;
    }

    public boolean modificarHora(int hours, int minutes, int seconds) {
        int correctTime = 0;
        if (validateHours(hours)) {
            setHours(hours);
            correctTime++;
        }

        if (validateMinutes(minutes)) {
            setMinutes(minutes);
            correctTime++;
        }

        if (validateSeconds(seconds)) {
            setSeconds(seconds);
            correctTime++;
        }

        return correctTime == 3;
    }

    public String toString() {
        String time;
        if (this.hours < 10 && this.minutes < 10 && this.seconds < 10) {
            time = "0" + this.hours + ":0" + this.minutes + ":0" + this.seconds;
        } else if (this.hours < 10 && this.minutes < 10) {
            time = "0" + this.hours + ":0" + this.minutes + ":" + this.seconds;
        } else if (this.hours < 10 && this.seconds < 10) {
            time = "0" + this.hours + ":" + this.minutes + ":0" + this.seconds;
        } else if (this.hours < 10) {
            time = "0" + this.hours + ":" + this.minutes + ":" + this.seconds;
        } else if (this.minutes < 10) {
            time = this.hours + ":0" + this.minutes + ":" + this.seconds;
        } else if (this.seconds < 10) {
            time = this.hours + ":" + this.minutes + ":0" + this.seconds;
        } else {
            time = this.hours + ":" + this.minutes + ":" + this.seconds;
        }

        return time;
    }
}
