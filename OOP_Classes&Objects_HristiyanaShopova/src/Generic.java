public class Generic {
    public static <T> void printArray(T[] arr)
    {
        for (T element: arr)
        {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        Generic.printArray(intArr);
    }
}
