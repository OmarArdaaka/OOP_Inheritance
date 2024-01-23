/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_bangundatar;

class tabung extends bangunRuang {
    double r,t;
    
    @Override
    float volume(){
        double volume = 22/7*r*r*t;
        System.out.println(super.volume()+", Volume tabung = " + volume);
        return (float) volume;
      
    }
    @Override
    float luasPermukaan (){
        double luasPermukaan = ((2*22/7*r*t) + (2*22/7*r*r));
        System.out.println(super.luasPermukaan()+", Luas permukaan tabung = " + luasPermukaan);
        return (float) luasPermukaan;
    }
}