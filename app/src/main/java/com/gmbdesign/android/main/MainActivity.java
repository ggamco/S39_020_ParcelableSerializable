package com.gmbdesign.android.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Persona p = new Persona("Gustavo", 33);

        Intent intent = new Intent(this, Main2Activity.class);

        //esto no funciona porque el modelo no es serializable/parcelable
        //Serializable pertenece a java y consume más recursos
        //Parcelable pertenece a Android y consume menos recursos

        //intent.putExtra("persona", p);
        //startActivity(intent);

        PersonaParcel personaParcel = new PersonaParcel("Martin", "Gamboa", 2);

        intent.putExtra("personaParcel", personaParcel);
        startActivity(intent);
    }
}
