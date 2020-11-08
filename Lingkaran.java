/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Lingkaran implements MenghitungBidang{
    protected double radial;

    public Lingkaran(double radial) {
        this.radial = radial;
    }

    public double getRadial() {
        return radial;
    }

    public void setRadial(double radial) {
        this.radial = radial;
    }
    
    @Override
    public double Luas(){
        return Math.PI*radial*radial;
    }
    
    @Override
    public double Keliling(){
        return 2*Math.PI*radial;
    }
}
