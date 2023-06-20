import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double GallonsinTank = 0.0;
        double FuelEfficiency = 0.0;
        double GasPrice = 0.0;
        double Costper100Mile;
        double distance;
        String Trash = "";
        boolean done = false;
        boolean done1 = false;
        boolean done2 = false;
        do
            {
                System.out.print("Enter gallons of gas in the tank : ");
                if (in.hasNextDouble())
                {
                    GallonsinTank = in.nextDouble();
                    in.nextLine();
                    done = true;
                } else
                {
                    Trash = in.nextLine();
                    System.out.println("\nYou said gallons in the tank was : " + Trash);
                    System.out.println("Enter a valid number");
                }

            } while (!done) ;
            do {
                System.out.print("Enter the Miles per Gallon : ");
                if (in.hasNextDouble())
                {
                    FuelEfficiency = in.nextDouble();
                    in.nextLine();
                    done1 = true;
                } else
                {
                    Trash = in.nextLine();
                    System.out.println("\nYou said Miles per gallon was : " + Trash);
                    System.out.println("Enter a valid number");
                }
            } while (!done1);
            do
            {
                System.out.print("Enter the gas Price : ");
                if (in.hasNextDouble())
                {
                    GasPrice = in.nextDouble();
                    in.nextLine();
                    done2 = true;
                }
                else
                {
                    Trash = in.nextLine();
                    System.out.println("\nYou said price of gas was : " + Trash);
                    System.out.println("Enter a valid number");
                }
            } while (!done2);
        Costper100Mile = (100 / FuelEfficiency) * GasPrice;
        distance = GallonsinTank * FuelEfficiency;
        System.out.println("The cost per 100 miles " + Costper100Mile);
        System.out.println("The distance covered in full tank " + distance);
    }
}