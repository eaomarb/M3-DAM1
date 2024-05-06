package Clock;

public class Clock {
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
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /*Constructors*/
    public Clock() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }


    /*Funcions privades*/
    private boolean validateHours(int hours) {
        return hours <= 23 && hours >= 0;
    }

    public void sumarSegon() {
        seconds = (seconds + 1) % 60;
        if (seconds == 0) {
            minutes = (minutes + 1) % 60;
            if (minutes == 0) {
                hours = (hours + 1) % 24;
            }
        }
    }

    // Versió no eficiente
    public void sumarSegonsV1(int seconds) {
        for (int i = 0; i < seconds; i++) {
            sumarSegon();
        }
    }

    public void sumarSegonsV2(int seconds) {
        int sumaSegons = this.hours * 3600 + this.minutes * 60 + this.seconds + seconds;
        this.hours = sumaSegons / 3600 % 24;
        this.minutes = sumaSegons % 3600 / 60;
        this.seconds = sumaSegons % 3600 % 60;
    }

    public String toString() {
        return "";
    }
}
