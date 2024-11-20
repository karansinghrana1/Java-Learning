import java.util.*;;
public class NoOfDiceRollWithTarget {
    public static void main(String[] args) {
        // diceCom("", 4);
        // System.out.println(diceComArr("", 4));
        System.out.println(diceComArrface("", 8,8));
    }
    static void diceCom(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i<=target; i++) {
            diceCom(p+i, target-i);
        }
    }

    static ArrayList<String> diceComArr(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list; 
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <= 6 && i<=target; i++) {
            ans.addAll(diceComArr(p+i, target-i));
        }
        return ans;
    }
    //custom dice
    static ArrayList<String> diceComArrface(String p,int target,int faces){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list; 
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <= faces && i<=target; i++) {
            ans.addAll(diceComArrface(p+i, target-i,faces));
        }
        return ans;
    }
}
