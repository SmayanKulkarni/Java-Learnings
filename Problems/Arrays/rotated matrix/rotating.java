import java.util.*;

 class rotating {

    static void printmatrix(int arr[][])
    {
        for(int i = 0;i<arr[i].length;i++)
        {
            for(int j=0;j<arr[j].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
    
    }

    static void reversearray(int arr[])
    {
        int i=0, j=arr.length-1;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void transpoiseinplace(int matrix[][], int r, int c)
    {
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void rotatematrix(int matrix[][], int n)
    {
        transpoiseinplace(matrix, n, n);

        for(int i=0;i<n;i++)
        {
            reversearray(matrix[i]);
        }
    }
}

class rotate {
    public static void main(String args[]) {
        int r, c;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        printmatrix(matrix);

        rotatematrix(matrix,2);

    }
}