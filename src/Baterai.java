/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * NAMA  :Alvin Lukman Nulhakim
 * NIM   :10117095    
 * KELAS :IF-3
 */
class Baterai {
    private double kuatArus = 3.0, hambatan = 12.0;
    
    
    public Baterai(){
        
    }
    public double getKuatArus() {
        System.out.println("kuat Arus : "+kuatArus+" Ampere ");
        return kuatArus;
    }

    public double getHambatan() {
        System.out.println("Hambatan : "+hambatan+" ohm ");
        return hambatan;
    }
    
    public double hitungTegangan(){
        return kuatArus*hambatan;
    }
}
