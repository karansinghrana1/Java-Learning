



// class Car{
//    private int carId;
//    private String carName;
//    private String fuelType;

//    public Car(int carId,String carName,String fuelType){
//     this.carId=carId;
//     this.carName=carName;
//     this.fuelType=fuelType;
//    }

//    public int getCarId(){
//     return carId;
//    }

// }



// class RemoveCar{
//     public static List<Car> RemoveAndRearrange(int parameter,List<Car> cars){
//         List<Car> newCars = new ArrayList<>();
//         for (Car car : cars) {
//             if(car.getCarId() != parameter){
//                 newCars.add(car);
//             }
//         }
//         if(newCars.isEmpty()){
//             return null;
//         }

//         return newCars;
//     }
// }

// public class Solution {

//     public static void main(String[] args){
//         List<Car> cars = new ArrayList<>(5);
//         Scanner sc = new Scanner(System.in);
//         for(int i =0;i<cars.size();i++){
//             int carId=sc.nextInt();sc.nextLine();
//             String carName=sc.nextLine();
//             String fuelType=sc.nextLine();

//             Car car = new Car(carId, carName, fuelType);
//             cars.add(car);
//         }

//         int parameter = sc.nextInt();sc.nextLine();

//         List<Car> ans = RemoveAndRearrange(parameter,cars);


//     }
    
// }
