import java.util.Scanner;

public class LineToColumnMod {
    
    public static void main(String[] args) {
        
        String userString;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter some text > ");
        userString = keyboard.nextLine();
        
        for (int count = 0; count < userString.length(); count++) {
            if (userString.charAt(count) != ' ') {
                System.out.print(userString.charAt(count));
            }
            else {
                System.out.println();
            }
            
        }
    }
}