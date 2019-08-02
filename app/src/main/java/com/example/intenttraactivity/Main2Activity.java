package com.example.intenttraactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    //Dichiaro il bottone2 e un intero per contenere un numero casuale
    Button bottone2;
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //BOTTONE <- HOME (per tornare all'activity MainActivity)
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        //Modificare nel manifest il campo:
        // <activity android:name=".Main2Activity"/>
        //In:
        // <activity android:name=".Main2Activity" android:parentActivityName=".MainActivity" />


        //Bottone2
        bottone2 = findViewById(R.id.bottone2);

        //Richiamo il metetodo per creare un numero casuale
        numero = creaNumeroCasuale();

        //Imposto il Listener (ascoltatore) sul clik del bottone
        bottone2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Azione che verrà eseguita quando si clicca su bottone1

                //Creo un intent in cui specifico il contesto di partenza e quello di arrivo
                Intent apriMain3Activity = new Intent(Main2Activity.this, Main3Activity.class);
                //Inserisco il numero nell'intent
                apriMain3Activity.putExtra("chiaveNumero", numero); //chiaveNumero è la chiave associata al dato
                //avvio l'activity tramite l'intent
                startActivity(apriMain3Activity);

            }
        });

    }

    //METODO PER CREARE UN NUMERO CASUALE DA 0 a 10
    int creaNumeroCasuale (){
        Random random = new Random();
        return random.nextInt(11);// crea numeri da 0 a 10
    }
}
