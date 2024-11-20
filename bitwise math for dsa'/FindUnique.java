public class FindUnique{
    public static void main(String[] args){
        int[] arr={1,2,3,5,9,3,2,1,5};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}