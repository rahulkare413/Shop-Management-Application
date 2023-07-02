package project2;

import java.util.Scanner;

public class MainApp {
    static Service service = new Service();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean status = true;
        while (status) {
            System.out.println("1.ADD SHOPS ");
            System.out.println("2.DISPLAY SHOP ");
            System.out.println("3.SEARCH SHOP BY NAME ");
            System.out.println("4. ALL PRODUCTS DISPLAY ");
            System.out.println("5.EXIT ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    addShop();
                    break;

                case 2:
                   displayShop();
                    service.displayShop();

                    break;


                case 3 :
                   searchShop();
                   break;

                case 4 :
                    allProduct();
                    break;


                case 5:
                    status = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE !!");


            }


        }


    }

    public static void addShop() {
        System.out.println("ENTER SHOP NAME ");
        String name = sc.next();
        System.out.println("ENTER SHOP TYPE ");
        String type = sc.next();

        Shop s1 = new Shop(name, type);
        int productCount = 0;
        while (productCount < s1.productListSize()) {
            System.out.println("1.ADD PRODUCT ");
            System.out.println("2.SAVE ");
            int ch = sc.nextInt();

            if (ch == 1) {
                Products product = addProduct();
                s1.setProductList(product);
                productCount++;
            } else {
                break;
            }
        }
        service.addShop(s1);


    }

    public static Products addProduct() {

        System.out.println("ENTER PRODUCT NAME ");
        String pName = sc.next();
        System.out.println("ENTER PRODUCT PRICE ");
        double pPrice = sc.nextDouble();

        Products p1 = new Products(pName, pPrice);
        return p1;

    }
    public static void displayShop() {
        int maxAttempts = 3;
        boolean isPasswordCorrect = false;

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("ENTER THE PASSWORD TO DISPLAY THE SHOP DETAILS (Attempts left: " + (maxAttempts - attempt + 1) + "):");
            int password = sc.nextInt();
            isPasswordCorrect = (password == 1234);

            if (isPasswordCorrect) {
                service.displayShop();
                break;
            } else {
                System.out.println("WRONG PASSWORD!!");

                if (attempt < maxAttempts) {
                    System.out.println("PLEASE TRY AGAIN    ");
                } else {
                    System.out.println("ACCESS DENIED ");
                }
            }
        }
    }
    public static void searchShop()
    {
        System.out.println("BY NAME ");
        String name = sc.next();
        service.searchShop(name);
    }
    public static void allProduct()
    {
        System.out.println("ENTER NAME ");
        String productName = sc.next();

        service.searchProduct(productName);
    }



}








