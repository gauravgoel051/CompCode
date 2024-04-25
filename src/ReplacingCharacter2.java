import java.util.Scanner;

public class ReplacingCharacter2 {

    static String ReplacingCharacter(String s, int pos) {

        String res = "";
        char ch = s.charAt(pos - 1);
        int fi = s.indexOf(ch);
        for (int i = 0; i < s.length(); i++) {
            if (i == fi) {
                res = res + s.charAt(i);
            } else if (s.charAt(i) == ch) {
                res = res + '$';
            } else {
                res = res + s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String s = sc.next();

        System.out.println("Enter the position of character");
        int pos = sc.nextInt();

        System.out.println(ReplacingCharacter(s,pos));

    }
}
