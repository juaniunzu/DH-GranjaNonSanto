package com.company.animal;

import com.company.Pastoreable;
import com.company.animal.Animal;

import java.util.Date;

public class Vaca extends Animal implements Pastoreable {

  private Integer lechePorDia;
  private Boolean estaLoca;

  public Vaca(Integer fechaNacimiento, String patente, Integer lechePorDia, Boolean estaLoca) {
    super(fechaNacimiento, patente);
    this.lechePorDia = lechePorDia;
    this.estaLoca = estaLoca;
  }

  @Override
  public void pastorear() {
    System.out.println("MUUUUU. Estoy siendo pastoreada.");
  }
}
