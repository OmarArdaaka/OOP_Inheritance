/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_bangundatar;

class limasSegitiga extends bangunRuang {
    double a,tseg,tlim;
    
    @Override
    float volume(){
        double volume = 1/3 * (1/2 * a * tseg) * tlim;
        System.out.println(super.volume()+", Volume Limas Segitiga = " + volume);
        return (float) volume;
      
    }
    @Override
    float luasPermukaan (){
        double luasPermukaan = 1/3 * (1/2 * (1/2 * a * tseg) * tseg) * tlim;
        System.out.println(super.luasPermukaan()+", Luas permukaan Limas Segitiga = " + luasPermukaan);
        return (float) luasPermukaan;
    }
}