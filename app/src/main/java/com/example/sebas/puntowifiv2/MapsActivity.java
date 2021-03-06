package com.example.sebas.puntowifiv2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Laureles and move the camera
        LatLng laureles = new LatLng(6.2479761, -75.5907031);
        mMap.addMarker(new MarkerOptions().position(laureles).title("Punto en Laureles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(laureles));

        // Add a marker in Robledo and move the camera
        LatLng robledo = new LatLng(6.273204, -75.585410);
        mMap.addMarker(new MarkerOptions().position(robledo).title("Punto en Robledo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(robledo));

        // Add a marker in Santa Elena and move the camera
        LatLng santaElena = new LatLng(6.209958, -75.498065);
        mMap.addMarker(new MarkerOptions().position(santaElena).title("Punto en Santa Elena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(santaElena));
    }
}
