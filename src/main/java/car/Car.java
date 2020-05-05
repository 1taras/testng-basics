package car;

public class Car {
    String brandName = "default-name";
    String color = "default_color";
    int weight = 200;
    boolean isNew = true;
    int currentSpeed = 44;

    public String beepBeep() {
        return "Beeeep-beep!";
    }

    public int increaseSpeed(int increaseValue) {
        return currentSpeed + increaseValue;
    }

    public String changeColor(String colorValue) {
        return color = colorValue;
    }


}
