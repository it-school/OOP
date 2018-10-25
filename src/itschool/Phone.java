package itschool;

public class Phone
{
    private String model;
    private int coresNumber;
    private int freqeuncyMHz;
    private float megapixels;
    private int errorCode;
//  TODO    Добавить использование перечислений для получения описания ошибки по её коду по примеру class Example2 отсюда:  https://proft.me/2015/03/29/primer-raboty-s-perechisleniyami-enum-v-java/

    public Phone()
    {
//  TODO    Добавить присвоение значений по умолчанию с установкой соответствующего кода ошибки
    }

    public Phone(String model, int coresNumber, int freqeuncyMHz, float megapixels)
    {
        this.setModel(model);
        this.setCoresNumber(coresNumber);
        this.setFreqeuncyMHz(freqeuncyMHz);
        this.setMegapixels(megapixels);
    }

    public String getModel() {
        return model.toUpperCase();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFreqeuncyMHz() {
        return freqeuncyMHz;
    }

    public boolean setFreqeuncyMHz(int freqeuncyMHz) {
        boolean result = false;
        if (freqeuncyMHz > 1000) {
            this.freqeuncyMHz = freqeuncyMHz;
            this.errorCode = 0;
            result = true;
        }
        else
        {
            this.freqeuncyMHz = 1000;
            this.errorCode = 1;
// TODO     заменить использование признака ошибки на битовую маску     https://ru.wikipedia.org/wiki/Битовое_поле
        }
        return  result;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(int coresNumber) {
        this.coresNumber = (coresNumber > 0 ? coresNumber : 1);
    }

    public float getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(float megapixels) {
        this.megapixels = (megapixels> 0 ? megapixels : 0.3f);
    }

    @Override
    public String toString() {
        return  "\nPhone model: " + this.getModel() +
                "\nfrequemcy: " + this.getFreqeuncyMHz()+
                "\ncores number: " + this.getCoresNumber()+
                "\ncamera megapixels" + this.getMegapixels();
    }

    public int getErrorCode() {
        return errorCode;
    }

}
