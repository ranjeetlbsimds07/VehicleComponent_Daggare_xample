package example.db.room.com.myapplication.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import example.db.room.com.myapplication.model.Motor;
import example.db.room.com.myapplication.model.Vehicle;

/**
 * Created by Guest User on 11/27/2017.
 */
@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
