import java.util.*;

class swapping{

    private int arr[];
    swapping(int arr[]) {
        this.arr = arr;
    }

    public void swap(int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public void printarray()
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public void SortZerosandOnes()
    {
        int n = arr.length;
        int left =0, right = n-1;
        while(left<right)
        {
            if(arr[left] %2!=0 && arr[right] %2== 0)
            {
                swap(left, right);
                left++;
                right --;
            }

            if(arr[left]%2==0) left++;
            if(arr[right]%2!=0) right--;
        }
        printarray();
    }

    
}

class swapoddeven {
    public static void main(String args[]) {
        int arr[] = {12,3,2,23,12,21,12,24,45,3,243,34,35};
        int n = arr.length;
        swapping obj = new swapping(arr);
        obj.SortZerosandOnes();
        
    }
}
