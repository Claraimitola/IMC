import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su apellido:");
        String apellido = scanner.nextLine();
        System.out.println("ingrese su cédula:");
        String cedula = scanner.nextLine();
        System.out.println("ingrese su email:");
        String email = scanner.nextLine();
        System.out.println("ingrese su genero:");
        String genero = scanner.nextLine();
        System.out.println("Ingrese su peso: ");
        double pesoU = scanner.nextFloat();
        System.out.println("Igrese su altura: ");
        double alturaU = scanner.nextFloat();
        Date hoy = new Date(0);
        IMC usuario_new = new IMC(nombre,apellido,cedula,email,genero,pesoU,alturaU,hoy);

        double resultado_imc = usuario_new.CalcularIMC(alturaU, pesoU);

        System.out.println("El resultado de su calculo es: " + resultado_imc);
       
    }
}
} 