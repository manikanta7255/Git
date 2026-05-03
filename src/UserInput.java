import java.util.*;
public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = sc.nextLine();
        System.out.println("Your input is: "+ input);
    }
}
