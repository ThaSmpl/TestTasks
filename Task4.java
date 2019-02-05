/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;
import java.io.*;
public class Task4 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int trueCount = 0; // счетчик истинных значений
        int i = 0;
        // продолжаем ввод до тех пор, пока не получим 4 корректных значения
        while (i < 4)
        {
            System.out.println("Введите 'True' или 'False':");
            String temp = consoleReader.readLine();
            if (Boolean.valueOf(temp))  // преобразуем строку в логическое значение
            {
                trueCount++;    
                i++;
            }
            else if (!Boolean.valueOf(temp))
                i++;
            else System.out.println("Некорректное значение. Попробуйте еще раз.");
        }
        if (trueCount == 2)
            System.out.println("True");
        else
            System.out.println("False");
    }   
}
