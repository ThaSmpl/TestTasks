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
        int trueCount = 0; // ������� �������� ��������
        int i = 0;
        // ���������� ���� �� ��� ���, ���� �� ������� 4 ���������� ��������
        while (i < 4)
        {
            System.out.println("������� 'True' ��� 'False':");
            String temp = consoleReader.readLine();
            if (Boolean.valueOf(temp))  // ����������� ������ � ���������� ��������
            {
                trueCount++;    
                i++;
            }
            else if (!Boolean.valueOf(temp))
                i++;
            else System.out.println("������������ ��������. ���������� ��� ���.");
        }
        if (trueCount == 2)
            System.out.println("True");
        else
            System.out.println("False");
    }   
}
