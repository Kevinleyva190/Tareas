import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un texto: ");
        String input = teclado.nextLine();

        boolean consecutivo = true;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i-1) + 1) {
                consecutivo = false;

            }
        }

        System.out.println(consecutivo);
    }
}
