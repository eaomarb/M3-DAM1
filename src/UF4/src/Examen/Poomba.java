package Examen;

public class Poomba {
    // Variables clase
    private Habitacio habitacio;
    private int x;
    private int y;
    private String direccio;

    // constructor
    public Poomba(Habitacio habitacio, String direccio, int x, int y) {
        setHabitacio(habitacio);
        setDireccio(direccio);
        setX(x);
        setY(y);
    }

    public Habitacio getHabitacio() {
        return habitacio;
    }

    public void setHabitacio(Habitacio habitacio) {
        this.habitacio = habitacio;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
