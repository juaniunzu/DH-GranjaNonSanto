package com.company.animal;

import com.company.Pastoreable;
import com.company.animal.Animal;

import java.util.Date;

public class Oveja extends Animal implements Pastoreable {

  private Integer cantLanaEnKg;

  public Oveja(Integer fechaNacimiento, String patente, Integer cantLanaEnKg) {
    super(fechaNacimiento, patente);
    this.cantLanaEnKg = cantLanaEnKg;
  }

  @Override
  public void pastorear() {
    System.out.println("BEEEE. Estoy siendo pastoreada");
  }

}
