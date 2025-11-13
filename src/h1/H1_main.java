package h1;

public class H1_main {
    public static void main(String[] args) {
        int zone = 4;
        double price = 3.2;

        switch (zone) {
            case 1:
                price = 2.00;
                break;
            case 2:
                price = 2.00 + 0.35;
                break;
            case 3, 4:
                price = 2.35 + 0.5;
                break;
            case 5:
                price = 2.85 + 0.7;
                break;
            case 6:
                price = 4.00;
            default:
                System.out.println("Invalid zone");
                return;
        }

           System.out.println("The price for zone " + zone + " is: " + price + " EUR");
       }

}
