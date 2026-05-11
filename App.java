import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userCorrect = "tidii2802";
        String passwordCorrect = "123456789";

        boolean checkUser = false;
        int attempts = 0;

        boolean exit=false;
        
        while (!exit){
            if (!checkUser){
                System.out.println("Enter your username: ");
                String user = sc.nextLine();
                if (user.equals(userCorrect)){
                    checkUser = true;
                } else {
                    System.out.println("Incorrect username, please try again.");
                    continue;
                }
            }

            System.out.println("Enter your password: ");
            String password = sc.nextLine();
            attempts++;
            if (attempts >= 3){
                System.out.println("Too many attempts, exiting program.");
                exit = true;
                continue;
            }else{
                if (password.equals(passwordCorrect)){
                    System.out.println("Login successful!");
                    exit = true;
                } else {
                    System.out.println("Incorrect password, please try again.");
                }
            }
        }

        sc.close();
    }
}