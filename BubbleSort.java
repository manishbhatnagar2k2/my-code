// class BubbleSort
// {
//     void bubble(int arr[])
//     {
//         int i,j,n;
//         n=arr.length;
//         for(i=0;i<n;i++)
//         {
//             for(j=0;j<n;j++)
//             {
//                 if(arr[j]>arr[i])
//                 {
//                     int tmp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=tmp;
//                 }
//             }
//         }
//     }
//     void print(int arr[])
//     {
//         int i,n;
//         n=arr.length;
//         for(i=0;i<n;i++)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }

//     public static void main(String ...args)
//     {

//         int n;
//         int arr[]={5,6,3,8,1,2};
//         BubbleSort b=new BubbleSort();
//         System.out.println("Before sorting");
//         b.print(arr);
//         System.out.println("\nAfter sorting");
//         b.bubble(arr);
//         b.print(arr);
//     }
// }

import java.util.Scanner;

class BubbleSort {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // int n;
        // int arr[]={5,6,3,8,1,2};
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // BubbleSort b=new BubbleSort();
        int i, j;
        n = arr.length; 
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("After sorting");
        n = arr.length;
        for (i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("Before sorting");

    }
}
