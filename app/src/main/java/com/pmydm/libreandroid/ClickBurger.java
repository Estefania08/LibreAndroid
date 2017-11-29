package com.pmydm.libreandroid;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alumno on 21/11/2017.
 */

public class ClickBurger extends AppCompatActivity {

    private final static String APP = "Restaurantes";
    private final static String LISTA_RESTAURANTES = "com.estefaniapg.coches.lista_restaurantes";
    private final static String TAG = "Ciclo de Vida";
    ArrayList<Restaurante
            > restaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clickburgerint);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        restaurantes = new ArrayList<>();
        restaurantes = (ArrayList<Restaurante>) getIntent().getSerializableExtra(LISTA_RESTAURANTES);

        Button botonAtras = (Button) findViewById(R.id.btnAtras);
        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickBurger burger = new ClickBurger();
                Intent intent = new Intent(ClickBurger.this, MainActivity.class);

                intent.putExtra(LISTA_RESTAURANTES, restaurantes);//coge el array de coches y lo mete en el intent, también se pueden meter cadenas fijas

                startActivity(intent);
            }
        });
    }

    public void caseButton(View view) {
        ImageButton boton1 = (ImageButton) findViewById(R.id.btncarneburger1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/carne");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        ImageButton boton2 = (ImageButton) findViewById(R.id.btnpolloburger2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/pollo-y-m%C3%A1s");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        ImageButton boton3 = (ImageButton) findViewById(R.id.btnensaladaburger3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/ensaladas");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        ImageButton boton4 = (ImageButton) findViewById(R.id.btnrefrescosburger4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/bebidas-y-caf%C3%A9s");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        ImageButton boton5 = (ImageButton) findViewById(R.id.btnentranteburger5);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/entrantes-y-snacks");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        ImageButton boton6 = (ImageButton) findViewById(R.id.btnheladoburger6);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/postres");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        ImageButton boton7 = (ImageButton) findViewById(R.id.btndesayunoburger7);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/desayuno");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        ImageButton boton8 = (ImageButton) findViewById(R.id.btnkingburger8);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri= Uri.parse("http://www.burgerking.es/menu/king-jr-meal");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
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



//}
