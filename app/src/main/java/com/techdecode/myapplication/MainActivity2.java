package com.techdecode.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText cin;
    TextView nom;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nom=findViewById(R.id.nom);
        cin=findViewById(R.id.cin);
        add=findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CandidatActivity3.class);
                i.putExtra("nom",nom.getText().toString());
                i.putExtra("cin",cin.getText().toString());
                startActivity(i);

            }
        });



    }
}