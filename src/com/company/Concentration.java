package com.company;

public class Concentration {
    private String name;
    private float[] conc = new float[30];

    public Concentration(String nm)
    {
        name = nm;
    }

    public Concentration() { }

    public void setConc(float[] conc) {
        this.conc = conc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getConc() {
        return conc;
    }
}
