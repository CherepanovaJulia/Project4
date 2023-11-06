package laba4;

import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random random = new Random(15);
        int x = 4;
        int y = 4;
        int mas1[][] = new int[x][y];
        for (int i = 0 ; i < x; i++) {
            for (int j = 0 ; j < y; j++) {
                mas1[i][j] = random.nextInt(15);
                System.out.println("i = "+ i +";j= "+ j +"; число: " + mas1[i][j]);
            }
        }
        System.out.println("После преобразования: ");

        int del1 = random.nextInt(x - 1);
        int del2 = random.nextInt(y - 1);

        System.out.println("Удаленные строка = "+ (del1) +"; удаленный столбец = "+ (del2));
        System.out.println("После удаления");

        int mas2[][] = new int[x - 1][y - 1];
        for (int i=0, s = 0; i < x - 1; s++) {
            if (s != del1){
                for (int j =0, k = 0 ; j < y - 1; k++) {
                    if (k != del2) {
                        mas2[i][j] = mas1[s][k];
                        System.out.println("i = " + i + ";j= " + j + "; число: " + mas2[i][j]);
                        j++;
                    }
                }
             i++;
            }
        }
    }
}
