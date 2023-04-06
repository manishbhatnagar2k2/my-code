public class Example
{
    public <E>void printArray(E[]s)
    {
        // for(int i=0;i<s.length;i++)
        for(E x:s)          //for each loop
        // System.out.println(s[i]);
        System.out.println(x);
    }

    // public void printArray(Integer []n)
    // {
    //     for(int i=0;i<n.length;i++)
    //     System.out.println(n[i]);
    // }
    public static void main(String ...args)
    {
        Example e1=new Example();
        String countries[]=new String[]{"India","Pakistan","Nepal"};
         Integer numbers[]= new Integer[]{1,2,3,4};
        e1.printArray(countries);
         e1.printArray(numbers);
    }
} 