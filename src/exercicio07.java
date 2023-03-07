public class exercicio07 {
    public static void main(String[] args) {
    int[] numeros = {10, 5, 7, 20, 3};
    int menor = numeros[0];
    int maior = numeros[0];

        for(int i = 1; i < numeros.length; i++) {
        if(numeros[i] < menor) {
            menor = numeros[i];
        }
        if(numeros[i] > maior) {
            maior = numeros[i];
        }
    }

        System.out.println("Menor número do array: " + menor);
        System.out.println("Maior número do array: " + maior);
}
}
