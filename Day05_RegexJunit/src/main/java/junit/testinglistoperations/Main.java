package junit.testinglistoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Element\n2. Remove Element\n3. Get Size\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add: ");
                    int addNum = scanner.nextInt();
                    listManager.addElement(list, addNum);
                    System.out.println("Updated List: " + list);
                    break;
                case 2:
                    System.out.print("Enter number to remove: ");
                    int removeNum = scanner.nextInt();
                    listManager.removeElement(list, removeNum);
                    System.out.println("Updated List: " + list);
                    break;
                case 3:
                    System.out.println("List Size: " + listManager.getSize(list));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
