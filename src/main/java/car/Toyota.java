package car;

public class Toyota extends Car {
    String brandName = "Toyota";
    String color = "red";
    int weight = 1222;
    int currentSpeed = 12;

    @Override
    public String beepBeep(){
        return "こんにちは " + super.beepBeep();
    }

    public int increaseSpeed(int increaseValue){
        return currentSpeed + increaseValue;
    }

    public String changeColor(String colorValue){
        return color = "my new color is " + colorValue;
    }

    @Override
    public String toString() {
        return  "brandName='" + brandName + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", isNew=" + isNew +
                ", currentSpeed=" + currentSpeed +
                '}';
    }




}
