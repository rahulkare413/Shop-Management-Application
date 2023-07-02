package project2;



import java.util.Random;

public class Shop {
    private int shopId ;
    private String shopName ;
    private String shopType ;
    private Products[] productList = new Products[4];
    private int password ;

    public Shop( String shopName, String shopType) {
        this.shopId = new Random().nextInt(100000);
        this.shopName = shopName;
        this.shopType = shopType;
        this.password = password;
    }

    public int getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public int getPassword() {
        return password;
    }

    public void getProductList() {
        for (Products p : productList) {
            if (p != null) {
                System.out.println("PRODUCT ID " + p.getProdId());
                System.out.println("PRODUCT NAME " + p.getpName());
                System.out.println("PRODUCT PRICE " + p.getpPrice());
            }
        }
    }

    public void setProductList(Products p) {
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] == null) {
                productList[i] = p;
                break;
            }
        }
    }

    public int productListSize()
    {
        return productList.length;
    }

    public Products[] getList()
    {
        return productList;
    }

}
