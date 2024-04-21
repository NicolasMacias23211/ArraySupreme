
package ces2.arraysupreme;

import java.util.Scanner;

public class index {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un número entero:");
        int number = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Error: Por favor, ingrese un número mayor a 0");
                }
            } else {
                System.out.println("Error: Por favor, ingrese un número válido");
                scanner.next();
            }
        }
        ArraySupreme Supreme = new ArraySupreme(number);
        scanner.close(); 
    }
}
