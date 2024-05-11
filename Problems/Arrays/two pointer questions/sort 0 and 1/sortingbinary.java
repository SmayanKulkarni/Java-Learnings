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
            if(arr[left] == 1 && arr[right] == 0)
            {
                swap(left, right);
                left++;
                right --;
            }

            if(arr[left] == 0) left++;
            if(arr[right] == 1) right--;
        }
        printarray();
    }

    
}

class sortingbinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0,1,1,1,1,0,0,0,1};
        int n = arr.length;
        swapping obj = new swapping(arr);
        obj.SortZerosandOnes();
    }
}
