class InsertionSort
{
    void Insertioon(int arr[])
    {
        int n=arr.length;
        int i,j,key;
        for(i=0;i<n;i++)
        {
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    void Print(int arr[])
    {
        int n=arr.length;
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[])
    {
        InsertionSort ob=new InsertionSort();
        int arr[]={12,11,13,5,6,7,1};
        System.out.print("Given array is :");
        ob.Print(arr);
        System.out.print("\nSorted array is :");
        ob.Insertioon(arr);
        ob.Print(arr);
    }
}