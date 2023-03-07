public class exercicio02 {
    public static void main(String[] args) {
        int numeros [] = {5,2,4,5,6};
        int soma = 0;

        for(int i = 0; i < numeros.length; i++){
            soma+=numeros[i];
        }
        double media = (double) soma/numeros.length;
        System.out.println("A média é: " + media);
    }
}
