
import java.util.*;

class nextmax{
    private   int arr[];
    private  int max;
    nextmax(int arr[])
    {
        this.arr= arr;
    }
  
    public int secmax()
    {
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
              max = arr[i];
          }
        } 
       
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]==max)
        {
            arr[i] =-1;
        }
      }  

      int max = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]>max)
        {
            max = arr[i];
        }
      } 
      return max;
    }
}

class secondmax {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,15,2,3,4,1,1};
        nextmax ans = new nextmax(arr);
        int ans1= ans.secmax();
        System.out.println(ans1);
    }


}