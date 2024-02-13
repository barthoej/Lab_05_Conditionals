import java.util.Scanner;
public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;
        final double SHIP_RATE = 0.02;
        final double FREE_SHIP = 100;

        System.out.println("Enter the item price: ");

        itemPrice = in.nextDouble();
        in.nextLine();
        if(itemPrice >= FREE_SHIP){
            shippingCost = 0;
        } else {
            shippingCost = itemPrice * SHIP_RATE;
        }

        totalCost = itemPrice + shippingCost;
            System.out.println("The shipping cost is: " + shippingCost);
            System.out.println("The total cost is: " + totalCost);
        }
    }