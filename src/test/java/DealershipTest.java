import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;

    @Before
    public void before(){
        dealership = new Dealership(13000);
        car = new Car("Ford","Fiesta","Red",12000, 500, TypeOfCar.FUEL,TypeOfEngine.ENGINE1_2, TypeOfTyres.NORMAL, TypeOfGearbox.AUTOMATIC);
    }
//
//    @Test
//    public void checkIfTillIsEmpty(){
//        assertEquals(0, dealership.getTill());
//    }

    @Test
    public void checkAmountOfCards(){
        assertEquals(0, dealership.howManyCars());
    }

    @Test
    public void addCarToDealership(){
        dealership.purchaseCarForDealership(car);
        assertEquals(1, dealership.howManyCars());
        assertEquals(1000, dealership.getTill());
    }

    @Test
    public void sellCarToCustomer(){
        dealership.purchaseCarForDealership(car);
        assertEquals(1,dealership.howManyCars());
        dealership.sellCar(car);
        assertEquals(13000, dealership.getTill());
        assertEquals(0,dealership.howManyCars());
    }

    @Test
    public void canCheckIfCarIsDamaged(){
        assertEquals(11500, car.checkIfDamaged(car));
    }

    @Test
    public void repairDamagedCars(){
        dealership.repairCar(car);
        assertEquals(12500, dealership.getTill());
    }
}
