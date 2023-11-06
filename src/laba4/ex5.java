package laba4;

import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random random = new Random(10);
        System.out.println("Первоначальный массив:");

        int x = 5;
        int y = 3;
        int[][] mas1= new int[x][y];
        for (int i = 0 ; i < x; i++) {
            for (int j = 0 ; j < y; j++) {
                mas1[i][j] = random.nextInt(10);
                System.out.println("i = "+i+"; j= "+j+"; value= "+ mas1[i][j]);
            }
        }
        System.out.println("Транспонирование: ");

        int[][] mas2 = new int[y][x];
        for (int i = 0 ; i < y; i++) {
            for (int j = 0 ; j < x; j++) {
                mas2[i][j] = mas1[j][i];
                System.out.println("i = "+ i +";j= "+ j +";value= " + mas2[i][j]);
            }
        }
    }
}

