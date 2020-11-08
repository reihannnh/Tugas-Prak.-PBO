/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    protected double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }   
    
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume(){
        return super.Luas()*tinggi;
    }
    
    @Override
    public double LuasPermukaan(){
        return 2*((super.panjang*super.lebar) + (super.panjang*tinggi) + (super.lebar*tinggi));
    }
    
    
}
