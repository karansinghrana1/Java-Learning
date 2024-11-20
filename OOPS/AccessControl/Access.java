package AccessControl;

public class Access {
    protected int num;
    String s;
    int[] arr;

    public Access(int num, String s) {
        this.num = num;
        this.s = s;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    

    

    
}
