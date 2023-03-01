import java.util.Scanner;
public class tarea3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa una cadena de 9 caracteres (solo x,o,_): ");
        String cadena = input.nextLine();


        if(cadena.length() > 9) {
            System.out.println("La cadena debe ser de nueve caracteres.");
            return;
        }

        for(int i = 0; i < 9; i++) {
            if(cadena.charAt(i) != 'x' && cadena.charAt(i) != 'o'&& cadena.charAt(i) != '_') {
                System.out.println("La cadena solo puede contener los caracteres x, o ");
                return;
            }

        }

        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("+---+---+---+");
        System.out.println("| " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " |");
        System.out.println("+---+---+---+");
    }

}
