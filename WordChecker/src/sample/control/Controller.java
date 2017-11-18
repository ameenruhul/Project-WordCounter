package sample.control;

import java.util.Scanner;

public class Controller {



    String takeInput(){


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
         return text;
    }


    void checkNull(String array)
    {
       String text = array;

      if(text.isEmpty())

          System.out.println("Empty Text!");

    }

    int wordCounter(String array)
    {
        int wordcount = 0;
        int stringlen = 0;

        String text = array;

        stringlen = text.length();

        for (int i = 0; i < stringlen; i++)
        {
            if (text.charAt(i) == ' ')
            {
                wordcount = wordcount + 1;

            }
        }

        return wordcount + 1;
    }





}
