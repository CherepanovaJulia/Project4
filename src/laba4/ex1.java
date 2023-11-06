package laba4;

public class ex1 {
    public static void main(String[] args) {

        int fig = 11;
        int i,j,z;
        for (i = 1; i <= fig; i++) {
            System.out.println("Номер строки " + i + " ");
            z=0;
            for (j = -12; j < fig; j++) {
                System.out.println("+");
                z =  z + 1;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}
