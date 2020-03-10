package com.company.animal;

import java.util.Date;

public abstract class Animal {

  private Integer fechaNacimiento;
  private String patente;

  public Animal(Integer fechaNacimiento, String patente) {
    this.fechaNacimiento = fechaNacimiento;
    this.patente = patente;
  }

  public Integer getFechaNacimiento() {
    return fechaNacimiento;
  }

  public String getPatente() {
    return patente;
  }
}
