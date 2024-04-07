package ua.hillel.treshchun.lessons.lesson13Homework14;

public class HW13 {
    public static void main(String[] args) {
        StringClass HW = new StringClass();

        System.out.println("Enter string to look for occurances of a given char:");
        String str = HW.readWord();
        System.out.println("Enter char to look for(in case of string, first char will be used):");
        char ch = HW.readWord().charAt(0);
        System.out.println(ch + " occurs in " + str + " " + HW.findSymbolOccurance(str, ch) + " times.");

        System.out.println("Enter a string to search in: ");
        str = HW.readWord();
        System.out.println("Enter a string to search for: ");
        String lookupStr = HW.readWord();
        System.out.println("Target found at position " + HW.findWordPosition(str, lookupStr));

        System.out.println("Enter string to reverse: ");
        str = HW.readWord();
        System.out.println(HW.stringReverse(str));

        System.out.println("Enter string to check if it is a palindrome: ");
        str = HW.readWord();
        System.out.println(HW.isPalindrome(str));

        HW.guessGame();
    }
}
