import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars;
    private int till;

    public Dealership(int till) {
        this.till = till;
        this.cars = new ArrayList<>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public int howManyCars(){
       return this.cars.size();
    }

    public void purchaseCarForDealership(Car car){
        this.cars.add(car);
        this.buyCar(car);
    }
    public void buyCar(Car car){
     this.till -= car.getPrice();
    }

    public void sellCar(Car car){
        this.till += car.getPrice();
        this.cars.remove(car);
    }

    public void repairCar(Car car){
        if (car.getDamage() > 0){
        this.till -= car.getDamage();
        }
    }
}
