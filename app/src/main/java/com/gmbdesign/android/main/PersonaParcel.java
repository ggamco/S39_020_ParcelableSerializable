package com.gmbdesign.android.main;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ggamboa on 8/4/17.
 */

public class PersonaParcel implements Parcelable {

    private String nombre;
    private String apellido;
    private int edad;


    public PersonaParcel(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    protected PersonaParcel(Parcel in) {
        this.nombre = in.readString();
        this.apellido = in.readString();
        this.edad = in.readInt();
    }

    public static final Creator<PersonaParcel> CREATOR = new Creator<PersonaParcel>() {
        @Override
        public PersonaParcel createFromParcel(Parcel in) {
            return new PersonaParcel(in);
        }

        @Override
        public PersonaParcel[] newArray(int size) {
            return new PersonaParcel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(apellido);
        dest.writeInt(edad);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " " + edad;
    }
}
