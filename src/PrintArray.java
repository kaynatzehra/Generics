import javax.imageio.stream.ImageInputStream;

public class PrintArray {

    public static void toPrint(Integer[] array)
    {
        for(int i : array)
        {
            System.out.println(i);
        }
    }

    public static void toPrint(Double[] array)
    {
        for(double i : array)
        {
            System.out.println(i);
        }
    }
    public static void toPrint(Character[] array) {
        for (char i : array) {
            System.out.println(i);
        }
    }
 public static void main(String[] args)
        {
            Integer[] intArray = { 1,2,3,4};
            Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4};
            Character[]  charArray = { 'a', 'b', 'c', 'd'};

            PrintArray.toPrint(intArray);
            PrintArray.toPrint(doubleArray);
            PrintArray.toPrint(charArray);


            }

        }

