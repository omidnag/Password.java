import java.util.Scanner;

public class LoginMain {

public static void main(String[] args) {

    
    String Password;
    
    Password = "Lesson";
    

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input.next();

    if (password.equals(Password)) {
        System.out.println("Welcome!");
    }
 
     else {
        System.out.println("Invalid Password!");
    }

}

}