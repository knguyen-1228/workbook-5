package com.pluralsight;

import java.util.ArrayList;

public class AssetManagerApp {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("Current home","04/10/2018",300000, "123 Broadway blvd", 2, 3000, 5000));
        assets.add(new House("Vacation Home", "12/28/2020",800000,"456 Hollywood rd", 1,5000,8000));
        assets.add(new Vehicle("Daily car", "12/28/2022", 25000,"Honda Civic", 2022, 110000));
        assets.add(new Vehicle("Vacation car","12/28/2024", 200000, "Audi R8", 2024,300));

        for(Asset asset :assets){
            System.out.println("Asset Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Value: " + asset.getValue());

            if(asset instanceof House){
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());

            }else if(asset instanceof Vehicle){
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make & Model: " + vehicle.getMakeModel());
            }
            System.out.println("----------------------------------------------------");
        }

    }
}
