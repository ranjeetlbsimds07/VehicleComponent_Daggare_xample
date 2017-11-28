package example.db.room.com.myapplication.component;

import javax.inject.Singleton;

import dagger.Component;
import example.db.room.com.myapplication.model.Motor;
import example.db.room.com.myapplication.model.Vehicle;
import example.db.room.com.myapplication.module.VehicleModule;

/**
 * Created by Guest User on 11/27/2017.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
