package edu.lernia.labb3;

public class Patient {
  private String name;
  private String sickness = "";
  private boolean isSick = true;

  
  Patient(String name) {
    this.name = name;
    this.isSick = false;
  }

  Patient(String name, String sickness) {
    this.name = name;
    if (sickness == null) {
      isSick = false;
    } else {
       this.sickness = sickness;
    }
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getSickness() {
    return this.sickness;
  }
  
  public boolean isSick() {
    return isSick;
  }
  
  public void takeMedication(Medicine medicine) {
    if (sickness.equals(medicine.getTreatmentName())) {
      isSick = !isSick;
        }  
     }
  }
