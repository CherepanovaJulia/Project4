package laba4;

public class ex3 {
    public static void main(String[] args) {

        int shir = 5;
        int vus = 3;
        int[][] fig = new int[vus][shir];
        int n = 0;
        for (int i = 0; i < vus; i++) {
            for (int j = 0; j < shir; j++) {
                fig[i][j] = 2;
            }
        }
        for (int i = 0; i < vus; i++) {
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < shir; j++) {
                System.out.print(fig[i][j] + " ");
                n++;
            }
            System.out.println(" Количество символов в строке " + n);
        }
    }
}


