package com.example.locationbutton

import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.library.LocationButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , LocationButton.LocationButtonListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        locationButton2.initLocationItems(this)
        locationButton2.setLocationButtonListener(this)

    }

    override fun onLocationFetched(location: Location?, address: String?) {

    }
}
