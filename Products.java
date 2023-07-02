package project2;

import java.util.Random;

public class Products {
    private int prodId ;
    private String pName ;
    private double pPrice ;

    public Products( String pName, double pPrice) {
        this.prodId = new Random().nextInt(10000);
        this.pName = pName;
        this.pPrice = pPrice;
    }

    public int getProdId() {
        return prodId;
    }

    public String getpName() {
        return pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }
}
