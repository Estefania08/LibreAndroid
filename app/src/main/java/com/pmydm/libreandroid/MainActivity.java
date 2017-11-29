package com.pmydm.libreandroid;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Ciclo de Vida";
        private final static String LISTA_RESTAURANTES="com.estefaniapg.coches.lista_restaurantes";
    ArrayList<Restaurante> restaurantes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        restaurantes = new ArrayList<>();
        restaurantes = (ArrayList<Restaurante>) getIntent().getSerializableExtra(LISTA_RESTAURANTES);


        ImageButton botonBurger = (ImageButton) findViewById(R.id.btnBurger);
        botonBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickBurger burger = new ClickBurger();
                Intent intent = new Intent(MainActivity.this, ClickBurger.class);

                //intent.putExtra(LISTA_RESTAURANTES,restaurantes);//coge el array de coches y lo mete en el intent, también se pueden meter cadenas fijas
                intent.putExtra(LISTA_RESTAURANTES,restaurantes);
                startActivity(intent);
            }
        });

        ImageButton botonMc = (ImageButton) findViewById(R.id.btnmc);
        botonMc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickMc mc = new ClickMc();
                Intent intent = new Intent(MainActivity.this, ClickMc.class);

                intent.putExtra(LISTA_RESTAURANTES, restaurantes);//coge el array de coches y lo mete en el intent, también se pueden meter cadenas fijas

                startActivity(intent);
            }
        });

        ImageButton botonPomodoro = (ImageButton) findViewById(R.id.btnPomodoro);
        botonPomodoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickPomodoro pomodoro = new ClickPomodoro();
                Intent intent = new Intent(MainActivity.this,ClickPomodoro.class);

                 intent.putExtra(LISTA_RESTAURANTES,restaurantes);//coge el array de coches y lo mete en el intent, también se pueden meter cadenas fijas

                startActivity(intent);
            }
        });
        ImageButton botonCronicas = (ImageButton) findViewById(R.id.btnCronicas);
        botonCronicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickCronicas cronicas = new ClickCronicas();
                Intent intent = new Intent(MainActivity.this , ClickCronicas.class);

                intent.putExtra(LISTA_RESTAURANTES,restaurantes);//coge el array de coches y lo mete en el intent, también se pueden meter cadenas fijas

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

