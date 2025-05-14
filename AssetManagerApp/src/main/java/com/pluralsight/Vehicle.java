package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year,int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        LocalDateTime currentTime = LocalDateTime.now();
        int yearsOld = currentTime.getYear() - year;
        double value = 0;
        double finalValue = 0;

        if(yearsOld >= 0 && yearsOld <= 3){
            value = originalCost * (1 - .03 * yearsOld);
        }else if(yearsOld >= 4 && yearsOld <= 6){
            value = originalCost * (1 - .06 * yearsOld);
        }else if(yearsOld >= 7 && yearsOld <= 10){
            value = originalCost * (1 - .08 * yearsOld);

        }else if(yearsOld > 10){
            value = 1000;
        }else{
            System.out.println("Invalid input for years");
        }

        finalValue = value;

        if(odometer>100000){
            if(makeModel.equalsIgnoreCase("honda") || makeModel.equalsIgnoreCase("toyota")){
                finalValue = value;
            }
            else{
                finalValue = value * .75;
            }
        }

        return finalValue;
    }


    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
