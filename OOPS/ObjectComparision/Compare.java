package ObjectComparision;

public class Compare implements Comparable<Compare> {
    int roll;
    float marks;
    public Compare(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    
    

    @Override
    public int compareTo(Compare o) {
        
        int diff= (int)(this.marks - o.marks) ;
        return diff;

    }




    public static void main(String[] args) {
        Compare kar = new Compare(12, 86.20f);
        Compare rah = new Compare(13, 80.00f);

        if(kar.compareTo(rah)<0){
            System.out.println("kar has more marks");
        }

    }
}
