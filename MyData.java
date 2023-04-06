class MyData<T>
{
    T i;
    public void add(T i1)
    { i=i1; }
    public T get()
    {return(i); }

}
public class Example1{
    public static void main(String ...args)
    {
        MyData<Integer> m=new MyData<Integer>();
        Integer k=new Integer(5);
        m.add(k);
    }
}  