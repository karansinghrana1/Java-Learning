import java.util.*;;

class Fruits{
    private int fruitId;
    private String fruitName;
    private int price;
    private int rating;

    public Fruits( int fruitId,String fruitName,int price,int rating){
        this.fruitId=fruitId;
        this.fruitName=fruitName;
        this.price=price;
        this.rating=rating;
    }

    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
    public int getFruitId(){
        return fruitId;
    }

}


public class P2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Fruits> fruits = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int fruitId=sc.nextInt();sc.nextLine();
            String fruitName= sc.nextLine();
            int price = sc.nextInt();sc.nextLine();
            int rating = sc.nextInt();sc.nextLine();

            Fruits fruit = new Fruits(fruitId, fruitName, price, rating);
            fruits.add(fruit);
        }

        int parameter = sc.nextInt();sc.nextLine();

        Fruits ans = findMaximumPriceByRating(fruits,parameter);
        System.out.println(ans.getFruitId());
    }



    public static Fruits findMaximumPriceByRating(List<Fruits> fruits,int parameter){
        Fruits maxPriceFruit=fruits.get(1);
        for(Fruits fruit : fruits){
            if(fruit.getRating()>parameter){
                if(fruit.getPrice()>maxPriceFruit.getPrice()){
                    maxPriceFruit=fruit;
                }
            }
        }

        return maxPriceFruit;
    }
}
