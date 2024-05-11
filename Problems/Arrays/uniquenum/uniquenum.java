
import java.util.*;

class unique{

    private int arr[];
     
    unique(int arr[])    
    {
        this.arr = arr;
    }

    public int unique()
    {
        
        for(int i=0;i<arr.length;i++)
        {
            boolean unique= true;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                   unique=false;
                   break;
                }
            }
            if(unique==true)
            {
                return arr[i];
            }          
        }
       return -1;
    }
}

class uniquenum {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,15,2,3,4,1,1};
        unique ans = new unique(arr);
        int ans1= ans.unique();
        System.out.println(ans1);
    }

}