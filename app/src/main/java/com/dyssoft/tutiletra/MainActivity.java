package com.dyssoft.tutiletra;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    /*objetos*/

    private Button botonEmpezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*inicializar objetos */
        botonEmpezar = (Button) findViewById(R.id.button_comenzar);

        /*Set on clic buttons*/
        botonEmpezar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intento;

        switch (v.getId()){
            case R.id.button_comenzar:
                intento = new Intent(this, letra.class);
                startActivity(intento);
                break;
        }
    }
}
