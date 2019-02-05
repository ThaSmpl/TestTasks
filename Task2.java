/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Task2 
{
    /**
     * @param n
     * @param args the command line arguments
     * @return 
     */
    private static int []fibArray; // массив для хранения уже вычисленных чисел Фибоначчи
    public static int f(int n)
    {
        /**
         * Функция, вычисляющая n-е число Фибоначчи
         * @param n - номер числа Фибоначчи
         */    
        if (fibArray[n] == 0)
            if (n<2)
                fibArray[n] = 1;
            else
                fibArray[n] = f(n-1)+f(n-2);
        return fibArray[n];
    }
    public static void main(String[] args) throws IOException 
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        do 
        {
            System.out.println("Введите N:");
            input = consoleReader.readLine();
        } 
        while (!input.matches("^[1-9]+\\d*$"));
        int N = Integer.parseInt(input);    // верхняя граница диапазона
        // Вычисление количества чисел Фибоначчи в диапазоне
        double sqrt5 = Math.sqrt(5.0);
        double logPhi = Math.log((1+sqrt5)/2);
        int n = (int)Math.floor(Math.log((N+0.5)*sqrt5)/logPhi); // Формула Бине
        fibArray = new int[n]; // выделяем нужное количество памяти под массив
        f(n-1);
        System.out.println("В диапазоне от 1 до "+N+" есть "+n+" чисел Фибоначчи:");
        System.out.println(Arrays.toString(fibArray));
    }
}
