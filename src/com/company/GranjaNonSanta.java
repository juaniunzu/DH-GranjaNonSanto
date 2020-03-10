package com.company;

import com.company.animal.Animal;

import java.util.ArrayList;

public class GranjaNonSanta {

  private ArrayList<Animal> animales;
  private ArrayList otrosBienes;
  private Pastor pastor;

  public GranjaNonSanta(Pastor pastor) {
    this.pastor = pastor;
    this.animales = new ArrayList<Animal>();
    this.otrosBienes = new ArrayList();
  }

  public void enviarAPastorear(){
    System.out.println("Se envia al pastor a pastorear.");
    pastor.pastorearAnimales();
  }

}
