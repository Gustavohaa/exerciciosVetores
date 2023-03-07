public class exercicio10 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {50, 60, 70, 80, 90};

        int count = 0;

        for (int num1 : array1) {
            boolean found = false;
            for (int num2 : array2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(num1);
                count++;
            }
        }
        for (int num2 : array2) {
            boolean found = false;

            for (int num1 : array1) {
                if (num2 == num1) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(num2);
                count++;
            }
        }

        System.out.println("Quantidade de números distintos são : " + count);
    }
}