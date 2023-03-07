import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0,num = 0, pares = 0, impares = 0;


        System.out.print("Digite a quantidade de números: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Digite o " + i + "º número (1 a 1000): ");
            num = sc.nextInt();
            if(num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        sc.close();
    }
}

