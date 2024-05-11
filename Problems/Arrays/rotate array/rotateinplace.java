import java.util.*;

class rotate {

    private int arr[];
    private int k;
    rotate(int arr[], int k) {
        this.arr = arr;
        this.k = k;
    }

    public void swap(int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void reverse(int arr[], int i, int j) {
        while (i < j) {
            swap(i, j);
            i++;
            j--;
        }
    }

    public void rotating() {
        int n = arr.length;
        k = k % n; // Ensure k is within the range of array length
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
}

class rotateinplace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 5, 3, 4, 6, 3, 4};
        int n = arr.length;
        int k = sc.nextInt();
        k = k % n;
        rotate ans = new rotate(arr, k);
        ans.rotating();
        System.out.println(Arrays.toString(arr)); // Print the rotated array
    }
}
