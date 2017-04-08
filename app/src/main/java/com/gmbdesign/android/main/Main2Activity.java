package com.gmbdesign.android.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Persona persona = (Persona) getIntent().getSerializableExtra("persona");
        PersonaParcel persona = (PersonaParcel) getIntent().getParcelableExtra("personaParcel");

        Log.d("TAG", "Persona: " + persona.toString());

    }
}
