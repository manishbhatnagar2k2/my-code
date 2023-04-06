class SelectionSort
{
    void sort(int arr[])
    {
        int i,j;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void print(int arr[])
    {
        int i;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String ...args)
    {
        int n;
        int i,j;
        int arr[]={7,4,1,2,5};
        SelectionSort ob=new SelectionSort();
        System.out.println("Before Sorting");
        ob.print(arr);
        ob.sort(arr);
        System.out.println("\nSorted array");
        ob.print(arr);
    }
}