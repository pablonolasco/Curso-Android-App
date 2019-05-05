package com.apptwo.yanadigital.enviodatosactivity.Model;

import java.io.Serializable;

public class Suma implements Serializable{
    private int mNumero1;
    private int mNumero2;

    public Suma() {
    }

    public Suma(int mNumero1, int mNumero2) {
        this.mNumero1 = mNumero1;
        this.mNumero2 = mNumero2;
    }

    public int getmNumero1() {
        return mNumero1;
    }

    public void setmNumero1(int mNumero1) {
        this.mNumero1 = mNumero1;
    }

    public int getmNumero2() {
        return mNumero2;
    }

    public void setmNumero2(int mNumero2) {
        this.mNumero2 = mNumero2;
    }

    public int sumar(){
        return this.mNumero1+this.mNumero2;
    }

    @Override
    public String toString() {
        return ""+sumar();
    }
}
