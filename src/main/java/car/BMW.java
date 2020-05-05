package car;

public class BMW extends Car {

    String brandName = "BMW";
    String color = "black";
    int weight = 666;
    int currentSpeed = 99;

    public BMW(String brandName, String color, int weight, int currentSpeed) {
        this.brandName = brandName;
        this.color = color;
        this.weight = weight;
        this.currentSpeed = currentSpeed;
    }

    public BMW() {
    }

    @Override
    public String beepBeep() {
        return "Du hast mich gefragt und ich hab nichts gesagt " + super.beepBeep();
    }

    public int increaseSpeed(int increaseValue) {
        return currentSpeed + increaseValue;
    }

    public String changeColor(String colorValue) {
        return color = "neue Farbe ist " + colorValue;
    }


}
