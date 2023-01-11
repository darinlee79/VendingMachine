import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("Welcome to the Vending Machine, please input your full name (first name + last name)");
        String userName = scanner.nextLine();
        if (userName == null || userName.equals("")){
            while (userName == null || userName.equals("")) {
                System.out.println("Cannot leave this empty. Please input your full name.");
                userName = scanner.nextLine();
            }
        }
        Student student = new Student(userName);
        students.add(student);
        System.out.println("Hello " + userName);
        String userAction = "";
        while (!userAction.equalsIgnoreCase("exit")){
            System.out.println("Input 1 to check orders, input 2 to check balance, and input 3 to make a new order. Input 'reload' to reset the vending machine. Input 'exit' at any time to leave");
            userAction = new Scanner(System.in).nextLine();
            if (userAction.equalsIgnoreCase("1")) {
                System.out.println("Your orders are as follows: \n" + student.getMyItems());
            }
            else if (userAction.equalsIgnoreCase("2")){
                System.out.println("Your balance is: " + student.getMoney());
            }
            else if (userAction.equalsIgnoreCase("3")) {
                System.out.println("Would you like an espresso, cappuccino, or latte? Input your desired drink to order");
                String drinkChoice = new Scanner(System.in).nextLine();
                while(!(drinkChoice.equalsIgnoreCase("espresso")||drinkChoice.equalsIgnoreCase("cappuccino")||drinkChoice.equalsIgnoreCase("latte"))){
                    if (!(drinkChoice.equalsIgnoreCase("espresso")||drinkChoice.equalsIgnoreCase("cappuccino")||drinkChoice.equalsIgnoreCase("latte"))){
                        System.out.println("Error: Your drink does not exist - Would you like an espresso, cappuccino, or latte?");
                        drinkChoice = scanner.nextLine();
                    }
                }
                if (drinkChoice.equalsIgnoreCase("espresso")){
                    System.out.println("How many espressos would you like?");
                    Integer espressoCount;
                    if (scanner.hasNextInt()) {
                        espressoCount = scanner.nextInt();
                    }
                    else {
                        scanner.next();
                        espressoCount = -1;
                    }
                    while (espressoCount < 0 || espressoCount == null) {
                        System.out.println("Invalid value! Input the amount of espressos you would like!");
                        if (scanner.hasNextInt()) {
                            espressoCount = scanner.nextInt();
                        } else {
                            String dummy = scanner.next();
                            espressoCount = -1;
                        }
                    }
                    System.out.println(vendingMachine.buyEspresso(student, espressoCount));
                }
                else if (drinkChoice.equalsIgnoreCase("cappuccino")){
                    System.out.println("How many cappuccinos would you like?");
                    Integer capCount;
                    if (scanner.hasNextInt()) {
                        capCount = scanner.nextInt();
                    }
                    else {
                        scanner.next();
                        capCount = -1;
                    }
                    while (capCount < 0 || capCount == null) {
                        System.out.println("Invalid value! Input the amount of cappuccinos you would like!");
                        if (scanner.hasNextInt()) {
                            capCount = scanner.nextInt();
                        } else {
                            String dummy = scanner.next();
                            capCount = -1;
                        }
                    }
                    System.out.println(vendingMachine.buyCappuccino(student, capCount));
                }
                else if (drinkChoice.equalsIgnoreCase("latte")){
                    System.out.println("How many lattes would you like?");
                    Integer latteCount;
                    if (scanner.hasNextInt()) {
                         latteCount = scanner.nextInt();
                    }
                    else {
                        scanner.next();
                        latteCount = -1;
                    }
                    while (latteCount < 0 || latteCount == null) {
                        System.out.println("Invalid value! Input the amount of lattes you would like!");
                        if (scanner.hasNextInt()) {
                            latteCount = scanner.nextInt();
                        } else {
                            String dummy = scanner.next();
                            latteCount = -1;
                        }
                    }
                    System.out.println(vendingMachine.buyLatte(student, latteCount));
                }
            }
            else if(userAction.equalsIgnoreCase("reload")){
                System.out.println(vendingMachine.reloadVendingMachine());
            }
        }
    }
}
