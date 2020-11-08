/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{
    protected double garisSelimut = menghitungGarisSelimut();
    protected double tinggi;

    public Kerucut(double garisSelimut, double tinggi, double radial) {
        super(radial);
        this.garisSelimut = garisSelimut;
        this.tinggi = tinggi;
    }

    public double getGarisSelimut() {
        return garisSelimut;
    }

    public void setGarisSelimut(double garisSelimut) {
        this.garisSelimut = garisSelimut;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume(){
        return super.Luas()*(0.33333333333)*tinggi;
    }
    
    double menghitungGarisSelimut(){
        return Math.sqrt(tinggi);
    }
           
    @Override
    public double LuasPermukaan(){
        return (super.Luas()) + (Math.PI*super.radial*garisSelimut);
    }
    
}
