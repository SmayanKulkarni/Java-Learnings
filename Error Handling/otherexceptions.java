import java.util.*;

public class otherexceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 34;
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();
        int k = sc.nextInt();
        
        try{
        int ans = arr[ind]/k;
        System.out.println(ans);
        }
        catch(ArithmeticException e){z
            System.out.println("The problem could not be solved due to: ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The problem could not be solved due to: ");
            System.out.println(e); // important 
        }
        catch(Exception e)
        {
            System.out.println("The problem could not be solved due to: ");
            System.out.println(e);
        }
        
    }
}
