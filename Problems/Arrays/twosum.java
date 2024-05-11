import java.net.SocketImpl;
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
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

}

class twosum {
    public static void main(String args[]) {
        int arr[] = {4,6,3,5,8,2};
        sum ans = new sum(arr, 7);
        int ctr = ans.pairs();
        System.out.println(ctr);
    }

}