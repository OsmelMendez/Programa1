package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button boton;
private Button boton2;
private Button boton3;
private Button boton4;
private TextView etiqueta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=(Button) findViewById(R.id.botoncito);
        boton2=(Button) findViewById(R.id.boton2);
        boton3=(Button) findViewById(R.id.boton3);
        boton4=(Button) findViewById(R.id.boton4);
        etiqueta=(TextView) findViewById(R.id.etiquetahola);
    }
    public void accionboton(View elemento) {
        etiqueta.setText("MUNDO");
    }
    public void accionboton2(View elemento) {
        etiqueta.setText("BIENVENIDO A");
    }
    public void accionboton3(View elemento) {
        etiqueta.setText("ANDROID XD");
    }
    public void accionboton4(View elemento) {
        etiqueta.setText("HOLA!!");
    }
}
