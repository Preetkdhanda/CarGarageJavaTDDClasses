public class Car extends Vehicle {


    private TypeOfCar typeOfCar;
    private TypeOfEngine typeOfEngine;
    private TypeOfTyres typeOfTyres;
    private TypeOfGearbox typeOfGearbox;

    public Car(String make, String model, String colour, int price, int damage, TypeOfCar typeOfCar, TypeOfEngine engine, TypeOfTyres tyres, TypeOfGearbox gearbox) {
        super(make, model, colour, price, damage);
        this.typeOfCar = typeOfCar;
        this.typeOfEngine = engine;
        this.typeOfTyres = tyres;
        this.typeOfGearbox = gearbox;
    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public TypeOfTyres getTypeOfTyres() {
        return typeOfTyres;
    }

    public void setTypeOfTyres(TypeOfTyres typeOfTyres) {
        this.typeOfTyres = typeOfTyres;
    }

    public TypeOfGearbox getTypeOfGearbox() {
        return typeOfGearbox;
    }

    public void setTypeOfGearbox(TypeOfGearbox typeOfGearbox) {
        this.typeOfGearbox = typeOfGearbox;
    }

    public int checkIfDamaged(Car car){
        if (car.getDamage()>0){
            return car.getPrice() - car.getDamage();
        }else{
            return car.getPrice();
        }
    }
}



