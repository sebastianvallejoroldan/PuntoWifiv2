package com.example.sebas.puntowifiv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UsuarioAlcaldiaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_alcaldia);
    }

    public void usuarioAlcaldiaActivity()
    {

    }

    void consultarComparar (View v) {

        Intent intencion = new Intent(this , ConsultarCompararActivity.class);

        startActivity(intencion);
    }

    void consultarEstimar(View v) {

        Intent intencion = new Intent(this , ConsultarEstimarActivity.class);

        startActivity(intencion);
    }
}
