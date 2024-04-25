import java.util.Scanner;
public class ReplacingCharacter {

    static String ReplacingCharacters(String s){
        char ch = s.charAt(0);
        String ss = "";

        for(int i=0;i<s.length();i++){
            if(i==0){
                ss = ss+s.charAt(0);
            }
            else if(s.charAt(i)==ch){
                ss= ss + '$';
            }
            else{
                ss=ss+s.charAt(i);
            }
        }
        return ss;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(ReplacingCharacters(s));



    }
}
