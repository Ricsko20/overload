import java.util.Arrays;

public class ArrayToString {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        boolean[] booleanArray = {true, false, true, true};
        String[] stringArray = {"alma", "fizzbuz", "majomkenyérfa", "axolotl"};

        System.out.println("Int Array: " + convertToString(intArray));
        System.out.println("Double Array: " + convertToString(doubleArray));
        System.out.println("Boolean Array: " + convertToString(booleanArray));
        System.out.println("String Array: " + convertToString(stringArray));
    }

    public static String convertToString(Object array) {
        if (array instanceof int[]) {
            return Arrays.toString((int[]) array);
        }
        if (array instanceof double[]) {
            return Arrays.toString((double[]) array);
        }
        if (array instanceof boolean[]) {
            return Arrays.toString((boolean[]) array);
        }
        if (array instanceof String[]) {
            return Arrays.toString((String[]) array);
        }
        return "Nincs ilyen tömbtípus";
    }
}
