package example.db.room.com.myapplication.model;

/**
 * Created by Guest User on 11/27/2017.
 */

public class Motor {
    private int rpm;

/*    public Motor() {
        this.rpm = 10;
    }

    public int getRpm() {
        return rpm;
    }*/

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        rpm = 0;
    }

}