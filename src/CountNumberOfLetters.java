import java.util.Scanner;

public class CountNumberOfLetters {

    public static void main(String[] args) {
        System.out.println("Input a sentence:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        count(string);
        scanner.close();
    }

    public static void count(String x) {
        char chars[]= x.toCharArray();
        int letters=0, num=0, space=0, others=0;
        for (int i=0; i<chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                letters++;
            }
            else if(Character.isDigit(chars[i])) {
                num++;
            }
            else if(Character.isSpaceChar(chars[i])) {
                space++;
            }
            else {
                others++;
            }
        }

        System.out.println("Total number of letters is "+letters);
        System.out.println("Total number of numbers is "+num);
        System.out.println("Total number of spaces is "+space);
        System.out.println("Total number of other characters is "+others);
    }

}


