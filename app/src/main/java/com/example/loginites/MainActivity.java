package com.example.loginites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario, clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(EditText) findViewById(R.id.txtNombre);
        clave=(EditText) findViewById(R.id.txtPsw);
    }

    public void eventoIngresar(View view) {
        String usu="admin";
        String cla="1234";
        //String usu=usuario.getText().toString();
        //String cla=clave.getText().toString();
        if(usu.equals(usuario.getText().toString())&&cla.equals(clave.getText().toString())){
            Toast.makeText(getApplicationContext(), "Acceso valido", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(), "Acceso invalido", Toast.LENGTH_LONG).show();
        }
    }
}