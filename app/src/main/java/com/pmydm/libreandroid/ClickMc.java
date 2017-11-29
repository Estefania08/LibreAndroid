package com.pmydm.libreandroid;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class ClickMc extends AppCompatActivity {
    private final static String APP = "Restaurantes";
    private final static String LISTA_RESTAURANTES = "com.estefaniapg.coches.lista_restaurantes";
    private final static String TAG = "Ciclo de Vida";
    ArrayList<Restaurante
            > restaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_mc);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Button botonAtras = (Button) findViewById(R.id.btnAtras);
        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickMc mc= new ClickMc();
                Intent intent = new Intent(ClickMc.this, MainActivity.class);

                intent.putExtra(LISTA_RESTAURANTES, restaurantes);//coge el array de coches y lo mete en el intent, también se pueden meter cadenas fijas

                startActivity(intent);
            }
        });
    }

    public void caseButton(View view) {
        ImageButton boton1 = (ImageButton) findViewById(R.id.btnmenumc);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.mcdonalds.es/productos");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton boton2 = (ImageButton) findViewById(R.id.btnprincipalmc);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.mcdonalds.es/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton boton3 = (ImageButton) findViewById(R.id.btnempleo);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://empleo.mcdonalds.es/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"Comienzo de la aplicación");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"Para la aplicación");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"Pausa la aplicación");
    }
    @Override
    public void onDestroy(){//termina la ejecución de la aplicación, el valor del contador/juego vale 0
        super.onDestroy();
        Log.d(TAG,"Destroza la aplicación");
    }
}