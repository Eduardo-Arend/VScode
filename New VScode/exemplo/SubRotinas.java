package exemplo;
import java.util.Scanner;

public class SubRotinas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro valor:");
        int valor1 = leitor.nextInt();

        System.out.println("Segundo valor:");
        int valor2 = leitor.nextInt();

        System.out.println("terceiro valor:");
        int valor3 = leitor.nextInt();

        float resultado = somaMedia(valor1, valor2, valor3);

        System.out.println("Media: "+ resultado);

        leitor.close();
        
    }
    
    public static float somaMedia(int valor1, int valor2, int valor3){

        int resultado = (valor1 + valor2 + valor3) / 3 ;
        return resultado;

    }
    
}
