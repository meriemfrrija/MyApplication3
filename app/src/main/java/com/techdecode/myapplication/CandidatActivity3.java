package com.techdecode.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;

public class CandidatActivity3 extends AppCompatActivity {

    ListView mrm;
    String nom;
    String cin;
    HashMap<String,String>mac;
    params p=new params();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidat2);

        mrm=findViewById(R.id.Liste);

        Bundle extras=getIntent().getExtras();
        if(extras != null)
        {


            nom=extras.getString("nom");
            cin=extras.getString("cin");
            mac=new HashMap<String,String>();
            mac.put("nom",nom);
            mac.put("cin",cin);
            p.values.add(mac);



        }

        SimpleAdapter adapter=new SimpleAdapter(CandidatActivity3.this,p.values,R.layout.image,

                new String[]{"nom","cin"},
                new int[]{R.id.nom,R.id.cin}

        );
        mrm.setAdapter(adapter);



    }
}