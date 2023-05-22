package Core_Java;

public class Practise_Set_6 {
    public static void main(String[] args) {
        //Problem 1
//        Create an array of 5 floats and calculate their sum.
//        float sum = 0;
//        float arr[] = {5.7f, 2.5f, 8.4f, 5.6f, 1.0f};
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("The sum of the array is : " + sum);


        //Problem 2
//        Write a program to find out whether a given integer is present in an array or not.
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {1, 2, 3, 4};
//        System.out.println("Enter a number you want to check is in array or not : ");
//        int n = sc.nextInt();
//        boolean isInArray = false;
//        for (int i = 0; i < arr.length; i++) {
//            if (n == arr[i]) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("The value " + n + " is present in the array");
//        } else {
//            System.out.println("The value " + n + " is not present in the array");
//        }


        //Problem 3
//        Calculate the average marks from an array containing marks of all students in physics
//        using a for-each loop.
//        float[] marks = {78.0f, 88.0f, 57.0f, 77.0f, 62.0f};
//        int i = marks.length;
//        float sum = 0.0f;
//        float average = 0.0f;
//        for (int n = 0; n < i; n++) {
//            sum += marks[n];
//            average = sum / i;
//        }
//        System.out.println("The average marks is : " + average);


        //Problem 4
//        Create a Java program to add two matrices of size 2x3.
//        int a[][] = {{1, 3, 4},
//                {2, 4, 3}};
//        int b[][] = {{1, 3, 4},
//                {2, 4, 3}};
//        int[][] c = new int[2][3];
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                c[i][j] = a[i][j] + b[i][j];
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }

        //Problem 5
//       Write a Java program to reverse an array.
//        int[] a = {1, 2, 3, 4, 5};
//        int l = a.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        System.out.println("Original Array : ");
//        for (int i = 0; i < l; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("Reversed Array : ");
//
//        for (int i = 0; i < n; i++) {
//            temp = a[i];
//            a[i] = a[l - i - 1];
//            a[l - i - 1] = temp;
//        }
//        for (int element : a) {
//            System.out.print(element + " ");
//        }


//        Problem 6
//        Write a Java program to find the maximum and minimum element in an array.
//        int[] a = {23, 453, 234, 564, 4, -3, 65, 843};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            } else if (a[i] < min) {
//                min = a[i];
//            }
//        }
//        System.out.println("The maximum element of array is " + max);
//        System.out.println("The minimum element of array is " + min);


        //Problem 7
//        Write a Java program to find whether an array is sorted or not.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 elements in array : ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//        boolean isSorted = true;
//        int[] arr = {a, b, c, d, e};
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted) {
//            System.out.println("The Array is sorted");
//        } else {
//            System.out.println("The Array is not sorted");
//        }


    }
}
