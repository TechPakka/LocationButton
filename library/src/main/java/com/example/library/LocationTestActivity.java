package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;

public class LocationTestActivity extends AppCompatActivity implements LocationButton.LocationButtonListener {

    LocationButton locationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_test);
        locationButton = findViewById(R.id.locationButton);
        locationButton.initLocationItems(this);
        locationButton.setLocationButtonListener(this);
    }

    @Override
    public void onLocationFetched(Location location, String address) {
        String street_address = address;
    }
}
