class Vehicle {
    private Integer x;
    private Integer y;

    public Vehicle(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getCoords(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer moveToPoint(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer moveUpperRight() {
        this.x = 1;
        this.y = 1;
    }

    public Integer moveUpperLeft() {
        this.x = 0;
        this.y = 0;
    }

    public Integer IntegermoveUpperLeft() {

    }

}

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println(car.getCoords());
        car.moveToPoint(0, 0);
        System.out.println(car.getCoords());
        car.moveUpperRight();
        System.out.println(car.getCoords());
        car.moveUpperLeft();
        System.out.println(car.getCoords());
        car.moveToPoint(2, 0);
        System.out.println(car.getCoords());
    }
}