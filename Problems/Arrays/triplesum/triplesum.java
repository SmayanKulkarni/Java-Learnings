
import java.util.*;

class sum {

    private int[] arr;
    private int target;

    static int count = 0;

    sum(int arr[], int target) {
        this.arr = arr;
        this.target = target;
    }

    public int pairs() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++)
                if (arr[i] + arr[j] +arr[k]== target) {
                    count++;
                }
            }
        }
        return count;
    }

}

class triplesum {
    public static void main(String args[]) {
        int arr[] = {1,4,5,6,3};
        sum ans = new sum(arr, 12);
        int ctr = ans.pairs();
        System.out.println(ctr);
    }

}