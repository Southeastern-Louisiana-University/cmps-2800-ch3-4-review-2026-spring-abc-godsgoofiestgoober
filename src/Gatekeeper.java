import java.util.Scanner;

public class Gatekeeper
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // --- 1. INPUTS ---
        int userAge;
        int userSecCode;
        int userClearLevel;

        System.out.print("Enter Age: ");
        userAge = input.nextInt();

        System.out.print("Enter Security Code: ");
        userSecCode = input.nextInt();

        System.out.print("Enter Clearance Level (1-3): ");
        userClearLevel = input.nextInt();

        // --- 2. BOOLEAN PRE-CHECKS (Chapter 3.10) ---
        boolean isValidAge = (userAge >= 18 && userAge <= 65);
        // System.out.println("isValidAge is " + isValidAge); // Note by PM - Only used for testing purposes
        // Rule: Age must be between 18 and 65 inclusive

        boolean isValidCode = ((userSecCode % 5 == 0 || userSecCode % 7 == 0) && (userSecCode % 10 != 0));
        // System.out.println("isValidCode is " + isValidCode); // Note by PM - Only for testing purposes

        // Rule: (Divisible by 5 OR 7) AND (NOT divisible by 10)
        // We use parentheses to ensure the OR happens before the ANE

        // Rule: Level must be 1, 2, or 3. If not, they are blocked.

        boolean isBlocked = !(userClearLevel == 1 || userClearLevel == 2 || userClearLevel == 3);
        // System.out.println("isBlocked is " + isBlocked); // Note by PM - Only for testing purposes

        System.out.println("");
        // --- 3. CONTROL FLOW DECISIONS (Chapter 3.3 & 3.13) ---

        // Priority 1: Check if the level is totally invalid
        if (isBlocked)
        {
            System.out.println("ACCESS DENIED: Invalid Level");
        }

        // Priority 2: Check Age
        else if (!isValidAge)
        {
            System.out.println("ACCESS DENIED: Age Restriction");
        }

        // Priority 3: Check Code
        else if (!isValidCode)
        {
            System.out.println("ACCESS DENIED: Invalid Code");
        }

        // If code is valid, we check the specific level using Switch
        else
        {
            switch (userClearLevel)
            {
                case 1:
                    System.out.println("Guest Access Granted");
                    break;
                case 2:
                    System.out.println("User Access Granted");
                    break;
                case 3:
                    System.out.println("Admin Access Granted");
                    break;
            }
        }



        // --- 4. RISK ASSESSMENT (Ternary Operator - Chapter 3.14) ---
        // Syntax: (condition) ? value_if_true : value_if_false

        System.out.println((userAge < 25) || (userSecCode > 1000) ? "Risk Assessment: High Risk" : "Risk Assessment: Low Risk");




    }
}

