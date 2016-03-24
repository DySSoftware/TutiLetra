package com.dyssoft.tutiletra;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.lang.Thread;

import java.util.ArrayList;

public class letra extends AppCompatActivity implements View.OnClickListener {
    /*Variables para el juego*/
    /*Objetos del activity*/
    private Button botonLetra;
    private ArrayList<String> lista;
    private int numeroFin = 27;
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra);
        /*inicializar objetos */
        botonLetra = (Button) findViewById(R.id.button_comenzar);
        /*Set on clic buttons*/
        botonLetra.setOnClickListener(this);
        llenarLista();
        /*----------------------*/
        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);



    }

    @Override
    public void onClick(View v) throws Error{
        mp = MediaPlayer.create(letra.this,R.raw.sonido_boton);
        if (v.getId() == R.id.button_comenzar) {

            if (botonLetra.getText() == "Volver a Jugar") {
                mp.start();
                botonLetra.setText("Letra al Azar!");
                this.llenarLista();
            }
            if (botonLetra.getText() =="FIN!"){
                mp.start();
                botonLetra.setText("Volver a Jugar");
            }else {
                mp.start();
                botonLetra.setText(letraAlAzar());
            }
        }
    }

    private String letraAlAzar() {
        int numeroAleatorio = Utils.numero(numeroFin);
        if (lista.isEmpty()) {
            botonLetra.setText("Volver a Jugar");
            return "FIN!";
        }

        numeroFin--;
        return lista.remove(numeroAleatorio);
    }
    private void llenarLista() {
        lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        lista.add("H");
        lista.add("I");
        lista.add("J");
        lista.add("K");
        lista.add("L");
        lista.add("M");
        lista.add("N");
        lista.add("O");
        lista.add("P");
        lista.add("Q");
        lista.add("R");
        lista.add("S");
        lista.add("T");
        lista.add("U");
        lista.add("V");
        lista.add("W");
        lista.add("X");
        lista.add("Y");
        lista.add("Z");
        numeroFin = lista.size();
    }

    /*public void reproducirSonido (View v){
        switch (v.getId()){
            case R.id.button_comenzar:
                sound.play(sonido);
                break;
        }
    }*/
}

