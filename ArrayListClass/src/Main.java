import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static boolean checkNum(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    static <T> void checkType(T smth) {
        System.out.println(smth instanceof String);
    }

    public static void main(String[] args) {

        Animal a1 = new Animal("Fox", 5);
        Animal a2 = new Animal("Frog", 6);
        Animal a3 = new Animal();

        ArrayList<Animal> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner scLine = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            System.out.println(i + ". Menu option: " + i);
        }
        System.out.println("Press '0' to exit.");

        boolean exit = false;
        int remove, num, b, menuEnter;
        double a = 0.0;
        char dot = '.';

        do {
            System.out.println("Please enter from 0 to 7");
            menuEnter = sc.nextInt();

            switch (menuEnter) {
                case 1:
                    list.add(a1);
                    System.out.println("You added Fox");
                    break;
                case 2:
                    list.add(a2);
                    System.out.println("You added Frog");
                    break;
                case 3:
                    System.out.println("ArrayList size is " + list.size());
                    break;
                case 4:
                    System.out.println("Please enter index which you want to remove: ");
                    remove = sc.nextInt();
                    list.remove(remove);
                    System.out.println("ArrayList size is " + list.size());
                    break;
                case 5:
                    for (Animal animal : list) {
                        System.out.println("Your animal is " + animal.getName());
                    }
                    break;
                case 6:
                    System.out.println("Check the number odd or even - please enter number.");
                    num = sc.nextInt();
                    if (checkNum(num))
                        System.out.println("Even");
                    else
                        System.out.println("Odd");
                    break;
                case 7:
                    System.out.println("Add number Integer or Double.");
                    String str = scLine.nextLine();

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == dot) {
                            a = Double.parseDouble(str);
                            System.out.println("Your number is double = " + a);
                            break;
                        }
                    }
                    if (a == 0.0) {
                        b = Integer.parseInt(str);
                        System.out.println("Your number is Integer = " + b);
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Smth went wrong!");
            }

        } while (!exit);

    }
}