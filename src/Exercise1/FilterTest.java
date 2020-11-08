package Exercise1;

public class FilterTest<T> implements Filter<T>{
    @Override
    public boolean accept(T x) {
        //Filter strings longer than 9 characters
        if (x instanceof String){
            if (((String) x).length() >= 9)
                return true;
        }

        //Filter non negative integers
        if (x instanceof Integer){
            if ((Integer) x >= 0 )
                return true;
        }
        //return false if values are not accepted
        return false;
    }

    public static void main(String[] args) {
        //Create an array of Strings to filter
        String[] a = { "This is a long string", "How long should I make the strings", "long", "short, ",
        "incredibly long string that I don't want to write","123456789","12345678", "Mary"};

        //Create an array of integers
        int[] b = {-1, 2, 54, 324, -65, -654, 0, 349023094, 22345, 270, -12335345};

        //create an array for filtered string values
        String[] longStrings;

        //create and array for filtered integers
        int[] positiveNumbers;

        //create a String filter
        FilterTest<String> stringFilter = new FilterTest<>();

        //Create a Integer filter
        FilterTest<Integer> intFilter = new FilterTest<>();

        //call filter method on arrays
        longStrings = filter(a, stringFilter);
        positiveNumbers = filter(b, intFilter);

        //print filtered String array
        for (int i = 0; i < longStrings.length; i++){
            if (longStrings[i] != null) {
                System.out.println(longStrings[i]);
            }
        }

        //print filtered Integer array
        for (int j = 0; j < positiveNumbers.length; j++){
            if (positiveNumbers != null) {
                System.out.println(positiveNumbers[j]);
            }
        }
    }

    //filter method for filtering Strings
    public static String[] filter(String[] a, Filter<String> f) {
        String[] b = new String[a.length];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (f.accept(a[i])) {
                b[counter++] = a[i];
            }
        }
        return b;
    }
    //filter method for filtering Integers
    public static int[] filter(int[] a, Filter<Integer> f) {
        int[] b = new int[a.length];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (f.accept(a[i])) {
                b[counter++] = a[i];
            }
        }
        return b;
    }

}
