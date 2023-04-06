// import java.util.Scanner;

// public class Mergesort {
//     public static void main(String... args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         mergesort(arr, 0, n - 1);
//     }

//     private static void mergesort(int[] arr, int i, int j) {
//         if (i < j) {
//             int m = i + (j - i) / 2;
//             mergesort(arr, i, m);
//             mergesort(arr, m + 1, j);
//             merge(arr, i, m, j);
//         }
//     }

//     private static void merge(int[] arr, int i, int m, int j) {
//         int merger[] = new int[j - i + 1];
//         int k = 0;
//         int l = i;
//         int r = m + 1;
//         while (l <= m && r <= j) {
//             if (arr[l] < arr[r]) {
//                 merger[k] = arr[l];
//             } else {
//                 merger[k] = arr[r];
//             }
//             k++;
//             l++;
//         }
//         while (l <= m) {
//             merger[k] = arr[l];
//             k++;
//             l++;
//         }
//         while (r <= j) {
//             merger[k] = arr[r];
//             k++;
//             r++;
//         }
//         for (int x = 0; x < merger.length; x++) {
//             arr[i + x] = merger[x];
//         }

//     }
// }

import java.util.Scanner;

public class Mergesort {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergesort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void mergesort(int[] arr, int i, int j) {
        if (i < j) {
            int m = i + (j - i) / 2;
            mergesort(arr, i, m);
            mergesort(arr, m + 1, j);
            merge(arr, i, m, j);
        }
    }

    static void merge(int[] arr, int i, int m, int j) {
        int merger[] = new int[j - i + 1];
        int k = 0;
        int l = i;
        int r = m + 1;
        while (l <= m && r <= j) {
            if (arr[l] < arr[r]) {
                merger[k] = arr[l];
            } else {
                merger[k] = arr[r];
            }
            k++;
            l++;
        }
        while (l <= m) {
            merger[k] = arr[l];
            k++;
            l++;
        }
        while (r <= j) {
            merger[k] = arr[r];
            k++;
            r++;
        }
        for (int x = 0; x < merger.length; x++) {
            arr[i + x] = merger[x];
        }

    }
}