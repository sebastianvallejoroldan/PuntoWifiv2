package com.example.sebas.puntowifiv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


    Button zonasWifi, usrAlcardia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zonasWifi = (Button) findViewById(R.id.zonaswifi);
        usrAlcardia = (Button)findViewById(R.id.usralcaldia);
    }

   void visualizarZonas (View v) {

       Intent intencion = new Intent(this , MapsActivity.class);

       startActivity(intencion);
   }

    void usrAlcaldia (View v) {

        Intent intencion = new Intent(this , UsuarioAlcaldiaActivity.class);

        startActivity(intencion);
    }

}
