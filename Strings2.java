class Strings2
{
    /**
     * @param args
     */
    public static void main(String ...args)
    {
        String a= "Manish";
        String b = "Manish";
        System.out.println(a==b);

        String name1=new String("Manish");
        String name2=new String ("Manish");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(a.charAt(0));
        System.out.println(new int []{1,2,3,4});    //it gives you some  garbage value
        // int v=a.length();
        // System.out.println(a);
        // System.out.println(v);
    }
}