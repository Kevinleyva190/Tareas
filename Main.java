import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.print("Ingresa un texto:");
        String entrada= teclado.nextLine();
        for(int i = 0; i <=entrada.length() ; i++) {
            for (int j = 1; entrada.length() >= j; j++) {
                char uno=entrada.charAt(i);
                char dos=entrada.charAt(j);
                if (uno<dos) {
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
            }
        }
    }
}