import java.util.Scanner;
class BinarySearch
{
    /**
     * @param args
     */
    public static void main(String ...args)
    {
       Scanner in =new Scanner(System.in);
       System.out.println("enter the size  of an array");
       int n =in.nextInt();
         int[] arr =new int[n];
            System.out.println("enter the elements of an array");
            for(int i=0;i<n;i++)
            {
                arr[i]=in.nextInt();
            }
            System.out.println("enter the element to be searched");
            int x=in.nextInt();
            int low=0;
            int high=n-1;
            int mid=0;
            while(low<=high)
            {
                mid=(low+high)/2;
                if(arr[mid]==x)
                {
                    System.out.println("element found at index"+mid);
                    break;
                }
                else if(arr[mid]<x)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
    }  
}