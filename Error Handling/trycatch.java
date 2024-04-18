import java.util.*;

public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int b = 0;
        try{
        int ans = k/0;
        System.out.println(ans);
        }
        catch(Exception e){
            System.out.println("The problem could not be solved due to: ");
            System.out.println(e);
        }
        
    }
}
