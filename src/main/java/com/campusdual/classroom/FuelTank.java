package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void setActualFuel(int actualFuel) {
    if (actualFuel >= 0) {
      this.actualFuel = actualFuel;
    } else {
      System.out.println("A capacidade non poder ser negativa.");
    }
  }

}
