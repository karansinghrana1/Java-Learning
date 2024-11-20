// 
public class CountZero {
   public static void main(String[] args) {
    int n=102020;
    int count=0;
    System.out.println(count( n, count));
   }
   static int count(int n,int c){
    if(n==0){
        return c;
    }
    if(n%10==0){
        return count(n/10 , c+1);
    }
    return count(n/10 , c);

   }
}
