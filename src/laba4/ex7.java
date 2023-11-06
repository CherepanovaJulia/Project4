package laba4;

public class ex7 {
    public static void main(String[] args) {

        int x = 4;
        int y = 7;
        int[][] Zmeyka = new int[x][y];
        int hvost = 0;
        int telo = 0;
        int h = 0;
        for (int i = 0; h < Zmeyka.length ; h++) {
            for (int j = 0; j < (Zmeyka[i].length - hvost); j++) {
                Zmeyka[i][j] = telo;
                telo++;
            }
            if(i < Zmeyka.length - 1) {
                i++;}
            for (int o = x - 1; o > hvost; o--) {
                Zmeyka[o][Zmeyka[i].length - 1 - hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < Zmeyka.length; i++){
            int count = i + 1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < Zmeyka[i].length; j++){
                System.out.print(Zmeyka[i][j] + " ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}

