import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a coordenada de x: ");
        int x = sc.nextInt();
        System.out.println("Digite a coordenada de y: ");
        int y = sc.nextInt();
        
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            
            System.out.println("Digite a coordenada de x: ");
            x = sc.nextInt();
            System.out.println("Digite a coordenada de y: ");
            y = sc.nextInt();
        }
        
        if (x == 0 || y == 0) {
            System.out.println("Quadrante inválido");
        }
        
        sc.close();
    }
}