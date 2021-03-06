package example.db.room.com.myapplication.model;

import javax.inject.Inject;

/**
 * Created by Guest User on 11/27/2017.
 */

public class Vehicle {
    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
    public void setRpm(int rpm){
        motor.setRpm(rpm);
    }
}
