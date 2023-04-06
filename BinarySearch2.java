class BinarySearch2
{
   
    static  int BinarySearch(int arr[], int size, int key)
    {
        int s=0;
        int e=size-1;
        int mid=(s+e)/2;

        while(s<=e)
        {
            if(arr[mid] == key)
            {
                return mid;
            }
            if(key > arr[mid])
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
            mid=(s+e)/2;
        }
    return -1;
}
public static void main(String ...args)
{
        int i;
        int n;
        int[] arr =new int[n];
         n=arr.length ;
        int key;
        int res=BinarySearch(arr, n-1,key);

        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            System.out.println("element search is :"+key);
            if(res==-1)
            System.out.println("element is not found ");
            else
            System.out.println("Element is present at position of array");
            System.out.println(res);
        }
    }
}