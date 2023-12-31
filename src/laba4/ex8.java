package laba4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ (количество сдвигаемых символов): ");
        int key = in.nextInt();
        String encryptStr = Caeser.encrypt(text, key);
        System.out.print("Зашифрованный текст :" + "\"" + encryptStr + "\"");

        System.out.print("\nВернуть тексту первоначальный вид? (y/n)");
        boolean cool = false;
        while (!cool) {
            String reply = in.next();
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, key);
                System.out.println(decryptStr);
                cool = true;
            } else if (reply.toLowerCase().equals("n")) {
                System.out.println("Ваш текст был успешно зашифрован!");
                cool = true;
            } else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }
    private static class Caeser {
        static String encryptText;
        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }
}