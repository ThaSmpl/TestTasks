/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

import java.io.*;
import java.util.Set;

public class Task6 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        // множество цифр
        Set<String> numbers = Set.of("0","1","2","3","4","5","6","7","8","9");
        System.out.println("Введите текст:");
        // используем StringBuilder, т.к. данные строки можно изменять напрямую
        StringBuilder text = new StringBuilder(consoleReader.readLine());
        int i = 0;
        while (i < text.length())   // просматриваем текст посимвольно
        {
            // если символ содержится в множестве цифр, то удаляем его из строки
            if (numbers.contains(String.valueOf(text.charAt(i))))
                text.delete(i,i+1);
            else 
                i++;
        }
        System.out.println("Текст после удаления чисел:");
        System.out.println(text);
    }
    
}
