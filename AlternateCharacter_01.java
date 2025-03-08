import java.util.Scanner;

public class AlternateCharacter_01
{
    public static String alternate(String input)
    {
        StringBuilder alternateString = new StringBuilder();
        for(int i=0;i<input.length();i+=2)
        {
            alternateString.append(input.charAt(i));
        }
        return alternateString.toString();

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        System.out.println("Enter String");
        userInput = scan.nextLine();
        System.out.println(AlternateCharacter_01.alternate(userInput));

        scan.close();

        
    }
}


// 1. Alternate character Display
// Write a method that accepts a String object as an argument and then returns the alternate 
// characters as substring starting from index 0. For instance, if the string argument passed is 
// “GREAT”, the method should return “GET”. Demonstrate the method in a program that 
// asks the user to input a string and then passes it to the method.