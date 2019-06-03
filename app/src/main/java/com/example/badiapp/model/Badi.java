package com.example.badiapp.model;

import java.util.ArrayList;
import java.util.List;

public class Badi {
    private int id;
    private String name;
    private List<Becken> becken = new ArrayList<Becken>();
    private String kanton;
    private String ort;

    public Badi(String name, List<Becken> becken, String kanton, String ort) {
        this.name = name;
        this.becken = becken;
        this.kanton = kanton;
        this.ort = ort;
    }

    public String getNameById() {
        return name;
    }

    public String getKantonById() {
        return kanton;
    }

    public String getOrtById() {
        return ort;
    }

    public List<Becken> getBeckenById() {
        return becken;
    }

    public void addBecken(Becken becken) {
       this.becken.add(becken);
    }

    public String toString() {
        String beckenString = "";
        for (Becken b : becken) {
            beckenString += b.getName();
        }

        return name + " " + beckenString + " " + kanton + " " + ort;
    }
}
