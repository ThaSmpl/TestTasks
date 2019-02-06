/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;
import java.io.*;
public class Task5 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        do
        {
            System.out.println("Введите слово:");
            word = consoleReader.readLine().toLowerCase();
        } while (!word.matches("^[а-яА-Яa-zA-Z]+$"));
        int i = 0;
        // сравниваем первый символ с последним, второй с предпоследним и т.д.
        while (word.charAt(i) == word.charAt(word.length()-i-1))
        {
            if (i == word.length()/2)   // если прошли середину строки
            {
                System.out.println("Слово "+word+" является палиндромом");    // слово - палиндром
                return;
            }
            else
                i++;
        }
        System.out.println("Слово "+word+" не является палиндромом");
    }
    
}
