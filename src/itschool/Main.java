package itschool;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Phone phone = new Phone();

        int freq = 0;
        phone.setCoresNumber(4);
        do {
            freq  = (int)(Math.random()* 3000);
            System.out.println( freq);
        } while (!phone.setFreqeuncyMHz(freq));


        phone.setMegapixels(10);
        phone.setModel("Samsung J7");

        System.out.println("\nPhone model: " + phone.getModel());
        System.out.println("frequemcy: " + phone.getFreqeuncyMHz());
        System.out.println("cores number: " + phone.getCoresNumber());
        System.out.println("camera megapixels: "+ phone.getMegapixels());


        Phone phone2;

        do {
            freq  = (int)(Math.random()* 2000);
            phone2 = new Phone("HTC", 4, freq  , 12);
            System.out.println(phone2.toString());
        } while (phone2.getErrorCode() > 0);
/*
        System.out.println("\nPhone model: " + phone2.getModel());
        System.out.println("frequemcy: " + phone2.getFreqeuncyMHz());
        System.out.println("cores number: " + phone2.getCoresNumber());
        System.out.println("camera megapixels: "+ phone2.getMegapixels());
*/


        Kettle kettle = new Kettle(1, 2.5f, "Green", "");

        System.out.println(kettle);

    }
}
