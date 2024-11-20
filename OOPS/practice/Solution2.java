
// Create a class Resort with the below attributes:

// resortId - int
// resortName - String
// Category - String 
// resortPrice - double
// resortRating - double

// Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required.

// Create class Solution with the main method.

// Implement two static methods - findAvgPrice in Solution class.

// findAvgPrice method:
// ----------------------------------
// This method will take two input parameters - array of Resort objects and a string parameter.
// The method will return the average of the prices from resort objects whose Category matched with passed as parameter and rating
// will greater than 4.
// If no resort present found, then the method should return 0.

// Note : All the searches should be case insensitive.

// These above mentioned static methods should be called from the main method.

// For findAvgPrice method - The main method should print the average price as it is if the returned value is 
// greater than 0, or it should print "No such Resort found".

// Before calling these static methods in main, use Scanner object to read the values of four resort objects referring attributes 
// in the above mentioned attribute sequence. Next, read the value for category.

// Input
// ----------
// 1004
// ABC
// 3 star
// 5400.00
// 4.5
// 1001
// DEF
// 5 star
// 4781.45
// 4.0
// 1002
// GHI
// 3 star
// 6235.72
// 4.2
// 1008
// JKL
// 2 star
// 7454.00
// 4.2
// 3 star

// Output
// ----------
// The average price of 3 star:5817




package practice;
import java.util.*;

class Resort{
    private int resortId;
    private String resortName,Category;
    private double resortPrice,resortRating;

    public Resort(int resortId, String resortName,String Category,double resortPrice,double rating){
        this.resortId=resortId;
        this.resortName=resortName;
        this.Category=Category;
        this.resortPrice=resortPrice;
        this.resortRating=rating;
    }

    public String getCategory(){return Category;}
    public double getRating(){
        return resortRating;
    }
    public double getPrice(){
        return resortPrice;
    }
}
public class Solution2 {
    public static double findAvgPrice(List<Resort> resorts, String parameter){
        double sum =0;
        int match =0;
        
        for(Resort resort:resorts){
            if(resort.getCategory().equalsIgnoreCase(parameter) && resort.getRating()>4){
                sum+=resort.getPrice();
                match+=1;
                
            }
        }

        if (match==0) {
            System.out.println("No such Resort found");
            return 0;
        }

        return sum/match;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Resort> resorts = new ArrayList<>();
        for(int i =0;i<4;i++){
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String cat = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            double rating = sc.nextDouble();sc.nextLine();
            Resort resort = new Resort(id, name, cat, price, rating);
            resorts.add(resort);

        }
        String parameter = sc.nextLine();
        double avgPrice=findAvgPrice(resorts,parameter);
        if(avgPrice>0){
            System.out.println("The average price of "+parameter+":"+(int)avgPrice);
        }
    }
}
