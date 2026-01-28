import java.util.Scanner;

public class Chapter3Review
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // --- 1. INPUT & SANITIZATION ---
        System.out.println("Enter Code (format: pre-num-suffix):");
        String userInput = input.nextLine();

        // Remove whitespace from ends (Chapter 4.4)
        String userCrypto = userInput.replace(" ","");

        // --- 2. STRING EXTRACTION (Chapter 4.4) ---
        // We need to find the positions of the hyphens to split the string.

        // Handle error if dashes are missing

        // VISUALIZATION:
        // "t x - 2 4 9 1 - a l p h a"
        //  0 1 2 3 4 5 6 7 8 9 ...
        // substring(0, 2) gets 0 and 1, stops before 2.

        // --- 3. CHARACTER ANALYSIS (Chapter 4.3) ---
        // Get the first character of the prefix

        // specific Character class method to check if it's a letter

        // Convert to uppercase char

        // --- 4. MATHEMATICAL CALCULATION (Chapter 4.2) ---
        // Convert the string "2491" into integer 2491

        // Formula: Sqrt(ID^3)
        // We use Math.pow(base, exponent) and Math.sqrt(value)

        // --- 5. FORMATTED OUTPUT (Chapter 4.6) ---

        // %-10s : String, Left-aligned, 10 spaces wide
        // %-10d : Integer, Left-aligned, 10 spaces wide
        // %-10.3f : Float, Left-aligned, 10 spaces wide, exactly 3 decimal places
    }
}

