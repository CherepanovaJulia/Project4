package laba4;

public class ex4 {
    public static void main(String[] args) {

        int vus= 6;
        int [][] fig = new int [vus][];
        for (int i = 0; i < fig.length; i++){
            int j = i + 1;
            fig[i] = new int[j];
        }
        int z = 0;
        for (int i = 0; i < vus; i++){
            for (int j = 0; j < i + 1; j++){
                fig[i][j] = 2;
            }
        }
        for (int i = 0; i < vus; i++){
            int count = i + 1;
            System.out.print("номер строки " + count + " - ");
            for (int j = 0; j < fig[i].length; j++){
                System.out.print(fig[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}