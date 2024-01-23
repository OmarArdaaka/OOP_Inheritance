/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_bangundatar;

class balok extends bangunRuang {
    double p,l,t;
    
    @Override
    float volume(){
        double volume = p*l*t;
        System.out.println(super.volume()+", Volume balok  = " + volume);
        return (float) volume;
      
    }
    @Override
    float luasPermukaan (){
        double luasPermukaan = 2*((p*l)+(p*t)+(l*t));
        System.out.println(super.luasPermukaan()+", Luas permukaan balok = " + luasPermukaan);
        return (float) luasPermukaan;
    }
}
