/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance_bangundatar;

/**
 *
 * @author SMK TELKOM 023
 */
public class Inheritance_Pson_BRuang {

    public static void main(String[] args) {
        
                
        
        bola bola = new bola();
        bola.r = 3;
       
        balok balok = new balok();
        balok.l = 3;
        balok.p = 2;
        balok.t = 5;
        
        limasSegitiga limas = new limasSegitiga();
        limas.a = 5;
        limas.tlim = 3;
        limas.tseg = 5;
        
        tabung tabung = new tabung();
        tabung.r = 3;
        tabung.t = 5;
        
        
        bola.luasPermukaan();
        bola.volume();
        
        balok.luasPermukaan();
        balok.volume();
        
        limas.luasPermukaan();
        limas.volume();
        
        tabung.luasPermukaan();
        tabung.volume();
                
        
        
        
   
    }
}
