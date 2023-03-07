public class exercicio08 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 7, 9, 11};

        calcularIntersecao(array1, array2);
    }

    public static void calcularIntersecao(int[] array1, int[] array2) {

        int quantidade = 0;

        for(int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    quantidade++;
                    System.out.println(array1[i]);
                }
            }
        }

        System.out.println("Quantidade de números iguais: " + quantidade);
    }
}
