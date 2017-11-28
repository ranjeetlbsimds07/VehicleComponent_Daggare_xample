package example.db.room.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import example.db.room.com.myapplication.component.DaggerVehicleComponent;
import example.db.room.com.myapplication.component.VehicleComponent;
import example.db.room.com.myapplication.model.Motor;
import example.db.room.com.myapplication.model.Vehicle;
import example.db.room.com.myapplication.module.VehicleModule;

public class MainActivity extends AppCompatActivity {
    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        component.provideVehicle().setRpm(20);
        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
