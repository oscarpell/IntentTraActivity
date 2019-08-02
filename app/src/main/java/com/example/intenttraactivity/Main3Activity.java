package com.example.intenttraactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Objects;

public class Main3Activity extends AppCompatActivity {

    //Dichiaro la TextView e un intero per recuperare il parametro
    TextView textView;
    int numeroRecuperato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //BOTTONE <- HOME (per tornare all'activity MainActivity)
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //Modificare nel manifest il campo:
        // <activity android:name=".Main3Activity"/>
        //In:
        // <activity android:name=".Main3Activity" android:parentActivityName=".MainActivity" />


        //TextView
        textView = findViewById(R.id.textView);

        //Recupero il parametro dall'intent tramite un Bundle
        //Esempio metodo alternativo senza Bundle: numeroRecuperato = getIntent().getExtras().getInt("chiaveNumero");
        Bundle recuperoDati = getIntent().getExtras();
        assert recuperoDati != null; //controlla se il Bundle non è vuoto
        numeroRecuperato = recuperoDati.getInt("chiaveNumero"); //uso la chiave impostata prima nell'intent

        //Converto il l'intero in stringa
        String testo = String.valueOf(numeroRecuperato);

        //Modifico il testo della TextView con il numero casuale per mostrarlo nell'activity_main3
        textView.setText(testo);

    }
}
