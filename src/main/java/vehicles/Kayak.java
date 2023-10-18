package vehicles;

import products.IProduct;

public class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, String hullType){
            super(weight, maxSpeed, baseProduct);
            this.hullType = hullType;
    }


    public String getHullType() {
        return hullType;
    }

    public void setHullType(String hullType) {
        this.hullType = hullType;
    }
    
}
