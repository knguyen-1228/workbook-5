package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot,int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double basedValue = 0;
        switch(condition){
            case 1:
                basedValue = 180;
                break;
            case 2:
                basedValue = 130;
                break;
            case 3:
                basedValue = 90;
                break;
            case 4:
                basedValue = 80;
                break;
        };
        /*if(condition == 1){
            basedValue = 180;
        }else if(condition == 2){
            basedValue = 130;
        }else if (condition == 3){
            basedValue = 90;
        }else if(condition == 4){
            basedValue = 180;
        }else {
            System.out.println("Invalid condition for property");
            return 0;
        }*/

        return (basedValue * squareFoot) + (0.25*lotSize);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
