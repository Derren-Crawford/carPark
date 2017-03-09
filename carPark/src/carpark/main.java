package carpark;

//imports the scanner class
import java.util.Scanner;

public class main {

     public static void main(String[] args) {
        
        MainScreen gui = new MainScreen();
        gui.pack();
        gui.setVisible(true);
        
         
         
        /*
        //creates a new scanner object
        Scanner scanIn = new Scanner(System.in);
        
        //creates a new car park object
        carPark park = new carPark();
        
        //system will loop to menu unless quit is chosen
        while(true)
        {
            System.out.println("**********************************");
            System.out.println("\nCar Park Menu");
            System.out.println("\n\nPlease choose from one of the following");
            System.out.println("\n1. Add a car");
            System.out.println("2. Remove a car");
            System.out.println("3. View number of free spaces / number of cars in the car park");
            System.out.println("4. Quit");
            
            //scans for input
            int input = Integer.parseInt(scanIn.nextLine());
            
            if(input == 1)
            {
                //checks to see if the car park is full
                if(park.parkFull())
                {
                    System.out.println("\nSorry, the car park is full.");
                }
                else
                {
                    System.out.println("\nPlease input the registration of the car");
                    //reads in reg number, creates a new car object and adds to car park
                    String regNo = scanIn.nextLine();
                    park.addCar(regNo);
                }
            }
            else if(input == 2)
            {
                //checks to see if the car park is empty, if it is prints an error message
                if(park.getSize() == 0)
                {
                    System.out.println("\nThere are no cars to remove.");
                }
                else
                {
                    //loop that only loops if an invalid reg number is input
                    boolean loop = true;
                    while(loop)
                    {
                        System.out.println("\nPlease enter the reg of the car to be removed:");
                        //reads in reg number and checks if the car is in the car park
                        String regNo = scanIn.nextLine();
                        if(park.isInPark(regNo))
                        {
                            //removes the car and breaks the loop
                            park.removeCar(regNo);
                            System.out.println("Car reg: " + regNo + " has left the car park.");
                            loop = false;
                        }
                        else
                        {
                            System.out.println("That reg number does not correspond to a car in the car park.");
                        }

                    }
                }
            }
            else if(input == 3)
            {
                System.out.println("\nThere are currently " + park.getSize() + " car(s) in the car park and " + park.spacesRemaining() + " spaces remaining.");
            }
            else if(input == 4)
            {
                System.out.println("\nThank you, goodbye.");
                break;
            }
            else
            {
                System.out.println("\nInvalid selection, please try again.");
            }
        }
        
        scanIn.close();
        */
         
    }
    
}
