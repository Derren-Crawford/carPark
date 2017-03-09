package carpark;
import java.util.ArrayList;
import java.util.Iterator;

public class carPark {
    
    private ArrayList<Car> car;
    private int maxSize = 15;
    
    //constructor, creates a new array list with the name car
    public carPark()
    {
        this.car = new ArrayList<>();
    }
    
    //returns true if the number of cars in the car park is equal to or more than maxSize
    public boolean parkFull()
    {
        return car.size() >= maxSize;
    }
    
    //adds a car to the car park
    public void addCar(String regNo, String colour, String make, String model)
    {
        car.add(new Car(regNo, colour, make, model));
    }
        
    //checks if the given car reg is in the car park
    public boolean isInPark(String regNo)
    {
        for (Car cars : this.car) 
        {
            if(cars.getRegNo().equals(regNo))
            {
                return true;
            }
        }
        return false;
    }
    
    //removes a car from the car park
    public void removeCar(String regNo)
    {
        //loops through all cars in the car park
        for(Car cars: this.car)
        {
            //when car reg matching input is found, car is removed
            if(cars.getRegNo().equals(regNo))
            {
                this.car.remove(cars);
                break;
            }
        }
    }
    
    //returns the current number of cars in the car park
    public int getSize()
    {
        return car.size();
    }
    
    public int spacesRemaining()
    {
        return maxSize - car.size();
    }

}
