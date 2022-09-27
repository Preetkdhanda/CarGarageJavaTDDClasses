import java.util.ArrayList;

public class Customer {

    private String name;
    private int money;
    private ArrayList<Car> cars;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public int howManyCars(){
        return this.cars.size();
    }
    public void buyCar(Car car, Dealership dealership){
        this.cars.add(car);
        money -= car.getPrice();
        dealership.sellCar(car);
    }

    public void addCar(Car car){
        this.cars.add(car);
    }
}
