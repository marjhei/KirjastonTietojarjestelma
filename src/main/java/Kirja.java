/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marjaana
 */
public class Kirja {

    private String nimeke;

    private String julkaisija;

    private int julkaisuvuosi;

    

    public Kirja(String nimeke, String julkaisija, int julkaisuvuosi) {

        this.nimeke = nimeke;

        this.julkaisuvuosi = julkaisuvuosi;

        this.julkaisija = julkaisija;

    }

    

    public String nimeke() {

        return this.nimeke;

    }

    public String julkaisija() {

        return this.julkaisija;

    }

    public int julkaisuvuosi() {

        return this.julkaisuvuosi;

    }

    public String toString() {

        return this.nimeke + ", " + this.julkaisija + ", " + this.julkaisuvuosi;

    }

}
