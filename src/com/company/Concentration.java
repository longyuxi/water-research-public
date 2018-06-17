package com.company;

public class Concentration {
    private String name;
    private double[] conc = new double[30];

    public Concentration(String nm)
    {
        name = nm;
    }

    public void setConc(double[] conc) {
        this.conc = conc;
    }


}
