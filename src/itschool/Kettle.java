package itschool;

public class Kettle {
    private float volume;
    private float power;
    private String color;
    private String material;

    public Kettle(float volume, float power, String color, String material) {
        this.setVolume(volume);
        this.setPower(power);
        this.setColor(color);
        this.setMaterial(material);
    }

    public Kettle() {
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = (volume < 0.5f ? 0.5f : volume);
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = (power <= 0f ? 0.5f : power);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == "" ? "White" : color);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = (material == "" ? "PVC" : material);
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "volume=" + volume +
                ", power=" + power +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
