package practice;
// Create a class Hotel with the below attributes:
 
// hotelId - int
// hotelName - String
// dateOfBooking – String (in the format dd-mon-yyyy)
// noOfRoomsBooked – int
// wifiFacility – String
// totalBill- double



// The above attributes should be private, write getters, setters and parameterized constructor as required.
 
// Create class Solution with main method.
 
// Implement two static methods – noOfRoomsBookedInGivenMonth and searchHotelByWifiOption in Solution class.
 
// noOfRoomsBookedInGivenMonth method:
// This method will take two input parameter - array of Hotel objects and a String parameter.
// The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).
// If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.



// searchHotelByWifiOption method:
// This method will take two input parameter - array of Hotel objects and a String parameter
// The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute 
// matches with the given wifi facility(String parameter passed).
// If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.
 
// Note : 
// No two Hotel object would have the same hotelId.
// No two Hotel object would have the same totalbill.
// The Array either has at least two objects with specified wifi option OR  no object with specified wifi option. 
// All the searches should be case insensitive. 
// dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)
 
// The above mentioned static methods should be called from the main method. 
 
// For noOfRoomsBookedInGivenMonth method - The main method should print the total number of booked rooms as it is, 
// if the returned value is greater than 0, else it should print "No rooms booked in the given month"
 
// For searchHotelByWifiOption method - The main method should print the hotelId from the returned Hotel object if the returned value is not null. 
// If the returned value is null then it should print "No such option available".
 
// Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring attributes in the above mentioned attribute sequence. 
// Next, read the value of two String parameters for capturing the month and wifi option .



// Consider below sample input and output:


// Input1:
// 101
// Best Stay
// 01-jan-2022
// 10
// Yes
// 20000
// 102
// Apple Stay
// 12-Feb-2022
// 3
// Yes
// 4000
// 103
// Accord
// 11-May-2022
// 5
// Yes
// 15000
// 104
// Royal Park
// 22-Dec-2021
// 7
// Yes
// 12000
// May
// Yes
 
// Output1:
// 5
// 103



// Input2:
// 101
// Best Stay
// 01-jan-2022
// 10
// Yes
// 20000
// 102
// Apple Stay
// 12-Feb-2022
// 3
// Yes
// 4000
// 103
// Accord
// 11-May-2022
// 5
// Yes
// 15000
// 104
// Royal Park
// 22-Dec-2021
// 7
// Yes
// 12000
// May1
// Yes1



// Output2:
// No rooms booked in the given month
// No such option available

// --------------------------------------------------
// Sample code snippet for reference: 
// Please use below code to build your Solution.
// --------------------------------------------------
// import java.util.Scanner;
// public class Solution
// {
//     public static void main(String[] args)
//  {
//     //code to read values 
//   //code to call required method
//   //code to display the result
//  }
    
//  //code the first method 
  
    
//  //code the second method    

// }
    
// //code the class

// -------------------------------------------------
// Note on using Scanner object:
// Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
// Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

// Consider below input values:
// 1001
// Savings

// Referring below code:

// Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();
// String str = sc.nextLine(); -&gt; here we expect str to have value Savings.Instead it may be "".

// If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.



// Create a class Hotel with the below attributes:
 
// hotelId - int
// hotelName - String
// dateOfBooking – String (in the format dd-mon-yyyy)
// noOfRoomsBooked – int
// wifiFacility – String
// totalBill- double


import java.util.*;
class Hotel{
    private int hotelId,noOfRoomsBooked;
    private String hotelName,dateOfBooking,wifiFacility;
    private double totalBill;
    public Hotel(int hotelId,String hotelName,String dateOfBooking, int noOfRoomsBooked,   String wifiFacility,
            double totalBill) {
        this.hotelId = hotelId;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }
    public String getDate(){
        return dateOfBooking;
    }
    public String getWifi(){
        return wifiFacility;
    }
    public double getBill(){
        return totalBill;
    }
    public int getId(){
        return hotelId;
    }
    public int getRoom(){
        return noOfRoomsBooked;
    }
    
}


// hotelId - int
// hotelName - String
// dateOfBooking – String (in the format dd-mon-yyyy)
// noOfRoomsBooked – int
// wifiFacility – String
// totalBill- double
public class Question2 {
    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();;
            String date = sc.nextLine();;
            int room=sc.nextInt();sc.nextLine();
            String wif=sc.nextLine();
            double bill = sc.nextDouble();sc.nextLine();

            Hotel hotel = new Hotel(id, name, date, room, wif, bill);
            hotels.add(hotel);

        }
        String p1=sc.nextLine();
        String p2=sc.nextLine();

        int ans1 = noOfRoomsBookedInGivenMonth(hotels,p1);
        Hotel ans2 =searchHotelByWifiOption(hotels,p2);

        sc.close();

    }

    // noOfRoomsBookedInGivenMonth method:
// This method will take two input parameter - array of Hotel objects and a String parameter.
// The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).
// If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.

    public static int noOfRoomsBookedInGivenMonth(List<Hotel> hotels,String parameter){
        int booking =0;
        
        for (Hotel hotel : hotels) {
            String month = hotel.getDate().substring(3,6);
            if(month.equalsIgnoreCase(parameter)){
                booking+=hotel.getRoom();
            }
        }

        if(booking==0){
            System.out.println("No room booked in a given month");
        }
        else{
            System.out.println(booking);
        }
        return booking;

    }

    // searchHotelByWifiOption method:
// This method will take two input parameter - array of Hotel objects and a String parameter
// The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute 
// matches with the given wifi facility(String parameter passed).
// If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.

    public static Hotel searchHotelByWifiOption(List<Hotel> hotels, String parameter) {
        Hotel f = null; // first highest bill
        Hotel s = null; // second highest bill

        for (Hotel hotel : hotels) {
            if (hotel.getWifi().equalsIgnoreCase(parameter)) {
                if (f == null) {
                    // If f is null, assign the first hotel
                    f = hotel;
                } else if (hotel.getBill() > f.getBill()) {
                    // Update second highest to the first highest, then update first highest
                    s = f;
                    f = hotel;
                } else if (s == null || hotel.getBill() > s.getBill()) {
                    // Update the second highest if it hasn't been set or if the current hotel has a higher bill
                    s = hotel;
                }
            }
        }

        if (s != null) {
            System.out.println(s.getId());
        } else {
            System.out.println("No such option available");
        }
        return s;
    }

}
