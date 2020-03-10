package com.company;

import java.util.ArrayList;

public class Pastor {

  private String nombre;
  private ArrayList<Pastoreable> animalesAPastorear;

  public Pastor(String nombre) {
    this.nombre = nombre;
    this.animalesAPastorear = new ArrayList<Pastoreable>();
  }

  public void agregarAnimalesAPastorear(Pastoreable unPastoreable){
    this.animalesAPastorear.add(unPastoreable);
  }

  public void quitarAnimalesAPastorear(Pastoreable unPastoreable){
    this.animalesAPastorear.remove(unPastoreable);
  }

  public void pastorearAnimales(){
    System.out.println("Sale el pastor a pastorear.");
    for (Pastoreable pastoreable : animalesAPastorear) {
      pastoreable.pastorear();
    }
  }

  public String getNombre() {
    return nombre;
  }

  public ArrayList<Pastoreable> getAnimalesAPastorear() {
    return animalesAPastorear;
  }
}
