package task3;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Task3
{
  public static void main(String []argv) throws IOException
  {
    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
    // �.� ������� ������ ����� ������������� ������, ���������� ��������� ������
    ArrayList<Integer> arrayInt = new ArrayList<Integer>();
    String input;
    do
    {
        System.out.println("������� ������ ����� ����� ������");
        input = consoleReader.readLine();
    } while (!input.matches("^([1-9]+\\d*\\s?){1,}$"));
    // �������� ����� �� ������� ������ � ��������� �� � ������
    StringTokenizer tokenizer = new StringTokenizer(input," ");
    while (tokenizer.hasMoreTokens())
    {
        arrayInt.add(Integer.valueOf(tokenizer.nextToken()));
    }
    // ���������� ���������
    for (int i = 1; i < arrayInt.size(); i++)
    {
        int j = i - 1;
        int temp = arrayInt.get(i);
        while ((j >= 0)&&(temp > arrayInt.get(j)))
        {
            arrayInt.set(j+1, arrayInt.get(j));
            j--;
        }
        arrayInt.set(j+1, temp);
    }
    System.out.println("��������� ����������:");
    System.out.println(arrayInt.toString());
  }
}