import java.util.Scanner;

public class ShortenTester {
    public static void main (String[] args)
    {
        System.out.println("What's your sentence?");
        Scanner text = new Scanner(System.in);

        Shorten text2 = new Shorten();
        String longPost2 = text.nextLine();

        System.out.println("Actual:" + text2.shorten(longPost2));
    }
}
