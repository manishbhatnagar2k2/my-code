package MyPack; 
public class Main
{
    public static void main(String args[])
    {
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(1.6);
        MyCharacterClass myChar = new MyCharacterClass('M');
        MyStringClass myString = new MyStringClass("Manish");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

    }
}