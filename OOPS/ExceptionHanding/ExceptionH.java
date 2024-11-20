package ExceptionHanding;

public class ExceptionH {
    public static void main(String[] args) {
        int a=5;
        int b = 0;
       try{
        // divide(a, b);
        String name= "karan";
        if(name.equals("karan")){
            throw new MyException(name);
        }
        //throw new Exception("just for fun");
       }catch(Exception e){
        System.out.println(e.getMessage());
       }finally{
        System.out.println("this will alwyas run");
       }
    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("this is an exc");
        }
        return a/b;
       }
    
}
