package src.com.basic;

public class StringReverse {
    public static void main(String arg[]) {
        String str = "ABCDE";
        stringReverseViaCharAt(str); //BEST
        stringReverseViaArray(str);
        stringReverseViaAppend(str);
        stringReverseViaMethod(str);
    }

    private static void stringReverseViaCharAt(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    private static void stringReverseViaArray(String str) {
        char[] charArray = str.toCharArray();
        char[] reverseArray = new char[str.length()];
        int length = charArray.length;
        int i = length - 1;
        int j = 0;
        while (i >= 0) {
            reverseArray[j] = charArray[i];
            i--;
            j++;
        }
        System.out.println(reverseArray);
    }

    private static void stringReverseViaAppend(String str) {
        StringBuilder sb = new StringBuilder();
        for (int index = str.length() - 1; index >= 0; index--) {
            sb.append(str.charAt(index));
        }
        System.out.println(sb);
    }

    private static void stringReverseViaMethod(String str) {
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1.reverse());
    }
}