import java.util.Scanner;

public class tarea
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduce los datos: ");
    String cadena = scanner.nextLine();

    String[] partes = cadena.split(" ");
    String nombre = partes[0].toUpperCase();
    String profesion = partes[1].toUpperCase();
    String pais = partes[2].toUpperCase();

    System.out.println("Nombre: " + nombre);
    System.out.println("Profesión: " + profesion);
    System.out.println("País: " + pais);
}
}






