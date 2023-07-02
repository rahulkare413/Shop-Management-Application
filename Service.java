package project2;

public class Service {
    private Shop[] shopList = new Shop[5];
    //private Products[] productList = new Products[5];
    //private int productCount = 0;

    public void addShop(Shop shop) {
        for (int i = 0; i < shopList.length; i++) {
            if (shopList[i] == null) {
                shopList[i] = shop;
                break;
            }
        }
    }

        public void displayShop()
        {


            for (Shop p : shopList) {
                if (p != null) {
                    System.out.println("SHOP ID " + p.getShopId());
                    System.out.println("SHOP NAME " + p.getShopName());
                    System.out.println("SHOP TYPE " + p.getShopType());
                    p.getProductList();
                }
            }
        }
        public void searchShop(String name )
        {
            for (int i = 0 ; i < shopList.length ; i++)
            {
                if (shopList[i]!= null){
              if (shopList[i].getShopName().equals(name))
              {
                  System.out.println("SHOP ID " + shopList[i].getShopId());
                  System.out.println("SHOP NAME " + shopList[i].getShopName());
                  System.out.println("SHOP TYPE " + shopList[i].getShopType());
              }}

            }
        }
        public void searchProduct(String productName)
        {
           for (Shop s : shopList)
           {
               if (s!= null)
               {
                   for (Products p : s.getList())
                   {
                       if (p!=null && p.getpName().equals(productName))
                       {
                           System.out.println("SHOP ID " + s.getShopId());
                           System.out.println("SHOP NAME " +s.getShopName());
                           System.out.println("SHOP TYPE " + s.getShopType());
                           System.out.println("____________________________");
                       }
                   }
               }
           }
        }





}


