package sample.control;

import java.util.Scanner;

public class Controller {


    public String text = new String();

    public void takeInput(){


        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();

    }


    public void checkNull()
    {


      if(text.isEmpty())

          System.out.println("Empty Text!");

    }

    public int wordCounter()
    {
        int wordcount = 0;
        int stringlen = 0;



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
