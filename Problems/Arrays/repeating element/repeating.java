
import java.util.*;

class repeat {

    private int arr[];

    repeat(int arr[]) {
        this.arr = arr;
    }

    public int repeated() {
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
            
        }
        return -1;
    }
}

class repeating {
    public static void main(String args[]) {
        int arr[] = { 1, 5, 3, 4, 6, 3, 4 };
        repeat ans = new repeat(arr);
        int ans1 = ans.repeated();
        System.out.println(ans1);
    }

}