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
        System.out.println("������� �����:");
        word = consoleReader.readLine().toLowerCase();
        int i = 0;
        // ���������� ������ ������ � ���������, ������ - � ������������� � �.�.
        while (word.charAt(i) == word.charAt(word.length()-i-1))
        {
            if (i == word.length()/2)   // ���� ����� �� �������� ������
            {
                System.out.println("����� "+word+" �������� �����������");    // ������ ����� - ���������
                return;
            }
            else
                i++;
        }
        System.out.println("����� "+word+" �� �������� �����������");
    }
    
}
