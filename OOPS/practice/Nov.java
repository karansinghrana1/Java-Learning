package practice;
import java.util.*;

import AccessControl.SubClass;







// The above mentioned static methods should be called from the main method.


// For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
// For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
// object.The AgencyName and price should be concatinated with : while printing.
// ---------
// Input
// ---------
// 123
// A2Z Agency
// Platinum
// 50000
// true
// 345
// SSS Agency
// Gold
// 30000
// false
// 987
// Cox and Kings
// Diamond
// 40000
// true
// 888
// Global Tours
// Silver
// 20000
// false
// 987
// Diamond
// -------------------------------
// Output
// -------------------------------
// 50000
// Cox and Kings:40000

// Create a class TravelAgencies with below attributes:

// regNo – int
// agencyName – String
// pakageType – String
// price – int
// flightFacility – boolean

// Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

// Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
// agencyDetailsforGivenIdAndType in Solution class.

// findAgencyWithHighestPackagePrice method:

// This method will take array of TravelAgencies objects as an input parameter and return the highest package 
// price from the given array of objects.
class TravelAgencies{
    private int regNo,price;
    private String agencyName,pakageType;
    private boolean flightFacility;
    public TravelAgencies(int regNo,String agencyName,String pakageType,int price,boolean flightFacility){
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.pakageType=pakageType;
        this.price=price;
        this.flightFacility=flightFacility;
    }
    public int getPrice(){
        return price;
    }
    public int getRegNo() {
        return regNo;
    }
    public String getPakageType(){
        return pakageType;
    }
    public String getAgencyName(){
        return agencyName;
    }

}
public class Nov {
    public static void main(String[] args) {
        TravelAgencies[] ta = new TravelAgencies[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int regNo = sc.nextInt();
            sc.nextLine();
            String name =sc.nextLine();
            String type=sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            boolean av = sc.nextBoolean();
            ta[i]= new TravelAgencies(regNo, name, type, price, av);
        }
        int preg =sc.nextInt(); sc.nextLine();
        String ptype =sc.nextLine();

        int highest = findAgencyWithHighestPackagePrice(ta);
        System.out.println(highest);
        TravelAgencies t = agencyDetailsForGivenldAndType(ta,preg,ptype);
        if(t!=null){
            System.out.println(t.getAgencyName()+":"+t.getPrice());
        }
        else{
            System.out.println("Null");
        }
    }
    // findAgencyWithHighestPackagePrice method:

// This method will take array of TravelAgencies objects as an input parameter and return the highest package 
// price from the given array of objects.
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] ta){
        int highestPackagePrice = Integer.MIN_VALUE;
        for (TravelAgencies t : ta) {
            if(t.getPrice() > highestPackagePrice){
                highestPackagePrice = t.getPrice();
            }
        }
        return highestPackagePrice;
    }
    // agencyDetailsForGivenldAndType method:

    // This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
// parameter packageType. The method will return the TravelAgencies object based on below conditions.

// FlightFacility should be available.
// The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
// If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
// have more than one package type. Travel agency and package type combination is unique. All the searches should 
// be case insensitive.
    public static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies[] ta,int regNo,String packageType){
        TravelAgencies ans=null ;
        for (TravelAgencies t : ta) {
            if(t.getRegNo()==regNo && t.getPakageType().equalsIgnoreCase(packageType)){
                ans = t;
            }
        }

        return ans;
    }


}
