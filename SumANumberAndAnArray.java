public class SumANumberAndAnArray {
    public static void main(String[] args) {
        int szam = 11;
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        
        System.out.println(tombSzamSum(szam, arr));
    }

public static int tombSzamSum(int szam, int[] arr) {
    int osszeg = szam;
    for(int i = 0; i < arr.length; i++) {
        osszeg += arr[i];
    }
    return osszeg;
}

}