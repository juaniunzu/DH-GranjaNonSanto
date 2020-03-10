package com.company.animal;

import java.util.Date;

public class Cocodrilo extends Animal {

  private Integer kgCueroPorExtraer;

  public Cocodrilo(Integer fechaNacimiento, String patente, Integer kgCueroPorExtraer) {
    super(fechaNacimiento, patente);
    this.kgCueroPorExtraer = kgCueroPorExtraer;
  }

}
