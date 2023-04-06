import java.util.*;
class MyGeneric<T1>
{
    int val = 344;
    private T1 t1;
      
    {
        this.val=val;
        this.t1=t1;  
    }
    public int getVal()
    {
        return val;
    }
    public void setVal(int val)
    {
        this.val=val;
    }
    public T1 getT1()
    {
        return t1;
    }
    public void setT1(T1 t1)
    {
        this.t1=t1;
    }
}
class Demo
{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(54);
        arrayList.add(59);
        int a = arrayList.get(0);
        // System.out.println(a);
        MyGeneric g1 = new MyGeneric(23);
       String a= g1.getT1();
       System.out.println(a);
    }
}