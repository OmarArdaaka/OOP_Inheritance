/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_bangundatar;

class bola extends bangunRuang {
    double r;
    
    @Override
    float volume(){
        double volume = 4/3 * 22/7 * r*r*r;
        System.out.println(super.volume()+ ", Volume bola = " + volume);
        return (float) volume;
      
    }
    @Override
    float luasPermukaan (){
        double luasPermukaan = 4*22/7*r*r;
        System.out.println(super.luasPermukaan()+", Luas permukaan bola = " + luasPermukaan);
        return (float) luasPermukaan;
    }
}
