package itschool;

public class Main
{
    public static void main(String[] args)
    {
        Phone phone1 = new Phone();

        phone1.setModel("Samsung J7");
        phone1.setMegapixels(10);
        phone1.setCoresNumber(4);

        int freq = 0;
        do {
            freq  = (int)(Math.random()* 3000);
            System.out.println( freq);
        } while (!phone1.setFreqeuncyMHz(freq));

        System.out.println("\nPhone model: " + phone1.getModel());
        System.out.println("frequemcy: " + phone1.getFreqeuncyMHz());
        System.out.println("cores number: " + phone1.getCoresNumber());
        System.out.println("camera megapixels: "+ phone1.getMegapixels());



        Phone phone2;

        do {
            freq  = (int)(Math.random()* 2000);
            phone2 = new Phone("HTC", 4, freq  , 12);
            System.out.println(phone2.toString());
        } while (phone2.getErrorCode() > 0);



        Kettle kettle = new Kettle(1, 2.5f, "Green", "");

        System.out.println(kettle);

// TODO     изучить, что такое блок TODO и использовать в дальнейшем в своих проектах (Нажмите Alt+6)   https://www.jetbrains.com/help/idea/using-todo.html
    }
}
