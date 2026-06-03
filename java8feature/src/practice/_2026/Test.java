package src.practice._2026;

public class Test {
    public static void main(String[] args) {

        char[] a = {'h', 'e', 'l', 'l', 'o'};
        int i = a.length-1;
        int j = 0;
        while (i>j){
            char temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i--; j++;
        }
        System.out.println(a);


    }

    static char[] reverse(char[] o){
        char[] result = new char[5];
        for (int i = o.length-1, j=0; i>=0; i--, j++){

            result[i] = o[j];

        }
        return result;
    }
}