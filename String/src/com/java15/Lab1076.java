package src.com.java15;

public class Lab1076 {
    public static void main(String[] args) {

        String str = "Welcome to JLC, Java Training Center, No 1 in Java Training and Placement. Java is Popular Language. Java.";
        System.out.println(str);
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int indx = str.indexOf("Java", i);
            if (indx >= 0) {
                i = indx;
                count++;
            }
        }
        System.out.println("Count:" + count);
    }
}
