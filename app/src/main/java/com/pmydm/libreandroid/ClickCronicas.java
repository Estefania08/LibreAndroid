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

public class ClickCronicas extends AppCompatActivity {

    private final static String APP = "Restaurantes";
    private final static String TAG = "Ciclo de Vida";
    private final static String LISTA_RESTAURANTES = "com.estefaniapg.coches.lista_restaurantes";
    ArrayList<Restaurante
            > restaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_cronicas);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        restaurantes = new ArrayList<>();
        restaurantes = (ArrayList<Restaurante>) getIntent().getSerializableExtra(LISTA_RESTAURANTES);

        Button botonAtras = (Button) findViewById(R.id.btnAtras);
        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickCronicas cronicas = new ClickCronicas();
                Intent intent = new Intent(ClickCronicas.this, MainActivity.class);

                intent.putExtra(LISTA_RESTAURANTES, restaurantes);//coge el array de coches y lo mete en el intent, también se pueden meter cadenas fijas

                startActivity(intent);
            }
        });
    }
    public void caseButton(View view) {
        ImageButton boton1 = (ImageButton) findViewById(R.id.btnTapaCronicas);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.cronicasscarnivoras.com/project/tapas-y-raciones/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton boton2 = (ImageButton) findViewById(R.id.btnHamburguesaCronicas);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.cronicasscarnivoras.com/project/hamburguesas/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageButton boton3 = (ImageButton) findViewById(R.id.btnBocadillosCronicas);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.cronicasscarnivoras.com/project/bocadillos/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageButton boton4 = (ImageButton) findViewById(R.id.btnBurritoCronicas);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.cronicasscarnivoras.com/project/burritos/");
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
