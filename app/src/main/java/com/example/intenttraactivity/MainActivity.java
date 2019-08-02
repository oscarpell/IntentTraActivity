package com.example.intenttraactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Dichiaro il bottone1
    Button bottone1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bottone1
        bottone1 = findViewById(R.id.bottone1);

        //Imposto il Listener (ascoltatore) sul clik del bottone
        bottone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Azione che verrà eseguita quando si clicca su bottone1

                //Creo un intent in cui specifico il contesto di partenza e quello di arrivo
                Intent apriMain2Activity = new Intent(MainActivity.this, Main2Activity.class);
                //avvio l'activity
                startActivity(apriMain2Activity);
            }
        });

    }
}
