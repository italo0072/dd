package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

EditText correo,tema,contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = findViewById(R.id.correo);
        tema = findViewById(R.id.tema);
        contenido=findViewById(R.id.cotenido);
    }

    public  void  enviar(View v)
    {
        Intent intent=new Intent(Intent.ACTION_SENDTO);

        intent.setData(Uri.parse("mailto: "));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{correo.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT,tema.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,contenido.getText().toString());
        startActivity(intent);
    }
}