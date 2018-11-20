package com.example.sebas.puntowifiv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConsultarEstimarActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_estimar);
    }

    void consultar (View v) {

        Intent intencion = new Intent(this , EstimarActivity.class);

        startActivity(intencion);
    }
}
