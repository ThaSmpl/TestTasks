/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.io.*;

public class Task1 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        // Для получения строки из консоли
        Reader inputReader = new InputStreamReader(System.in);
        BufferedReader consoleReader = new BufferedReader(inputReader);
        String input;
        int N;
        // Проверка ввода, цикл не прервется, пока не будет введено корректное
        // значение
        do
        {
            System.out.println("Введите целое число больше 0");
            input = consoleReader.readLine();
        } while (!input.matches("^[1-9]+\\d*$"));
        N = Integer.parseInt(input);
        System.out.println("Простые числа в диапазоне от 1 до " + N);
        if (N == 1)
            // Число 1 не является простым
            System.out.println("Нет простых числе в заданном диапазоне");
        else if (N >= 2)
        {
            System.out.print(2 + " ");  // Число 2 - заведомо простое, сразу выводим
            for (int n = 3; n <= N; n++)
            {
                int div = 2;
                boolean divSuccess = false;
                while ((div <= Math.sqrt(n))&&(!divSuccess))
                {
                    if (n%div == 0) 
                        divSuccess = true;  // если нашелся делитель - число составное
                    else
                        div++;
                }
                if (!divSuccess)    // делителя не нашлось - число простое, выводим
                    System.out.print(n+" ");
            }
        }
    }
}
