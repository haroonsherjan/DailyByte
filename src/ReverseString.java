import java.lang.reflect.Array;

public class ReverseString {
    public static void main(String... args){
        String case1 = "Cat";
        String case2 = "The Daily Byte";
        String case3 = "civic";
        String[] arr = {case1, case2, case3};

        for(String x: arr){
            System.out.println(x + " -> " + reverseString(x));
        }
    }

    private static String reverseString(String string) {
        char[] charArray = string.toCharArray();
        int length = charArray.length;
        for(int x = 0; x < length/2; x++){
            char tmp = charArray[x];
            charArray[x] = charArray[length - 1 - x];
            charArray[length - 1 - x] = tmp;
        }
        return String.copyValueOf(charArray);
    }
}
