package laba4;

public class ex2 {
    public static void main(String[] args) {

        int fig = 10;
        int z = 0;
        int i,j;
        for (i = 1; i <= fig; i++) {
            System.out.println("Номер строки " + i + " ");
            for (j = 0; j < fig; j++) {
                System.out.println("+");
                z =  z + 1;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}