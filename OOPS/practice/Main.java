package practice;
import java.util.*;

class Music{
    private int playListNo;
    private String type;
    private int count;
    private double duration;
    
    
    public Music(int p,String t,int c,double d){
        this.playListNo=p;
        this.type=t;
        this.count=c;
        this.duration=d;
    }
    
    public int getPlayListNo(){
        return playListNo;
    }
    public String getType(){
        return type;
    }
    public int getCount(){
        return count;
    }
    public double getDuration(){
        return duration;
    }
}

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        List<Music> musics = new ArrayList<>();
        for(int i=0;i<4;i++){
            int p = sc.nextInt();
            sc.nextLine();
            String t=sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            
            Music m = new Music(p,t,c,d);
            musics.add(m);
        }
        
        int p1=sc.nextInt();
        sc.nextLine();
        int p2=sc.nextInt();
        sc.nextLine();
        
        int avg = findAvgOfCount(musics,p1);
        if(avg==0){
            System.out.println("No playlist found.");
        }
        else{
            System.out.println(avg);
        }
        
        List<Music> ans = sortTypeByDuration(musics,p2);
        if(ans==null){
            System.out.println("No playlist found with mentioned attribute.");
        }
        else{
            for(Music m : ans){
                System.out.println(m.getType());
            }
        }
        
        
    }
    
    public static int findAvgOfCount(List<Music> musics, int parameter){
        int sum=0;
        int c=0;
        
        for(Music m:musics){
            if(m.getCount()>parameter){
                sum+=m.getCount();
                c++;
            }
        }
        
        if(sum==0){
            return 0;
        }
        
        return sum/c;
    }
    
    public static List<Music> sortTypeByDuration(List<Music> musics,int parameter){
        List<Music> ans = new ArrayList<>();
        for(Music m:musics){
            if(m.getDuration()>parameter){
                ans.add(m);
            }
        }
        
        Collections.sort(ans,Comparator.comparingDouble(xy->xy.getDuration()));
        
        return ans;
    }
}