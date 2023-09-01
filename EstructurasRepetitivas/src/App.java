import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        System.out.println("Sentencias repetitivas");
        System.out.println("Sentencia while");
        byte n = lector.nextByte();
        byte x = 1;
        
        // No permitir valores menores o iguales a cero

        while(n <= 0){
        System.out.println("Que tabla de multiplicacion desea mostrar? ");    
        n = lector.nextByte();
        }

        while(x <= 10){
            System.out.println(n + "x" + x + "=" + n*x);
            x++; 
        }
        System.out.println("Despues del while");
        System.out.println("Fin");

        lector.close();
    }
}