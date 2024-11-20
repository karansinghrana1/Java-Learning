public class SquareRoot {
    public static void main(String[] args) {
        int n=40;
        int p=3;//presition how many decimal we want
        System.out.printf("%.3f",sr(n, p));
    }
    static double sr(int n,int p){
        int s=0;
        int e=n;

        double ans=0.0;
        while (s<=e) {
            int m=s+(e-s)/2;
            if(m*m==n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        double inc=0.1;
        for(int i=0;i<p;i++){
          while (ans*ans<=n) {
            ans+=inc;
            
          }  
          ans-=inc;
          inc/= 10;
        }
        return ans;


    }
}
