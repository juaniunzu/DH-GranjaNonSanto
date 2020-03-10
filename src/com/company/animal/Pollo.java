package com.company.animal;

import com.company.Pastoreable;
import com.company.animal.Animal;

import java.util.Date;

public class Pollo extends Animal implements Pastoreable {

  private Integer huevosPorSemana;

  public Pollo(Integer fechaNacimiento, String patente, Integer huevosPorSemana) {
    super(fechaNacimiento, patente);
    this.huevosPorSemana = huevosPorSemana;
  }

  @Override
  public void pastorear() {
    System.out.println("COCOCOOROCO. Estoy siendo pastoreado.");
  }

}
