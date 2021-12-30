public class PrintArrayG<T>
{
    private T[] Array;

    public PrintArrayG(T[] Array) {
        this.Array = Array;
    }
    public void toPrint()
    {
        PrintArrayG.toPrint(this.Array);
    }
    public static <T> void toPrint(T[] Array)
    {
        for(T t : Array)
        {
            System.out.println(t);

        }
    }



    public static void main(String[] args)
    {
        Integer[] intArray = { 1,2,3,4};
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4};
        Character[]  charArray = { 'a', 'b', 'c', 'd'};

        PrintArrayG.toPrint(intArray);
        PrintArrayG.toPrint(doubleArray);
        PrintArrayG.toPrint(charArray);


    }

}
