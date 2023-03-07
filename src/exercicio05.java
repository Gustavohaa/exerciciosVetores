public class exercicio05 {
    public static void main(String[] args) {
        int numeros []= new int[100];

        for (int i = 0; i < 100;i++ ){
            numeros[i]= i + 1;
        }
        for (int i = 0; i < numeros.length; i++){
            if(verificador(numeros[i])){
                System.out.println(numeros[i] + " É primo !");
            }
        }
    }
    public static boolean verificador(int numero){
        for(int i = 2 ; i < numero;i++){
            if(numero % i == 0)
                return false;
        }
        return  true;
    }
}
