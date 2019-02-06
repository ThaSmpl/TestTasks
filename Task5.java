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
        System.out.println("Ââåäèòå ñëîâî:");
        word = consoleReader.readLine().toLowerCase();
        int i = 0;
        // ñðàâíèâàåì ïåðâûé ñèìâîë ñ ïîñëåäíèì, âòîðîé - ñ ïðåäïîñëåäíèì è ò.ä
        while (word.charAt(i) == word.charAt(word.length()-i-1))
        {
            if (i == word.length()/2)   // åñëè äîøëè äî ñåðåäèíû ñòðîêè
            {
                System.out.println("Ñëîâî "+word+" ÿâëÿåòñÿ ïàëèíäðîìîì");    // çíà÷èò ñëîâî - ïàëèíäðîì
                return;
            }
            else
                i++;
        }
        System.out.println("Ñëîâî "+word+" íå ÿâëÿåòñÿ ïàëèíäðîìîì");
    }
    
}
