import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Dealership dealership;

    @Before
    public void setUp(){
        customer = new Customer("Alex", 100000);
        car = new Car("Ford","Fiesta","Red",10000, 0, TypeOfCar.FUEL,TypeOfEngine.ENGINE1_2, TypeOfTyres.NORMAL, TypeOfGearbox.AUTOMATIC);
        dealership = new Dealership(0);
    }

    @Test
    public void customerCanBuyCar(){
        dealership.addCar(car);
        assertEquals(1,dealership.howManyCars());
        customer.buyCar(car, dealership);
        assertEquals(90000, customer.getMoney());
        assertEquals(10000, dealership.getTill());
        assertEquals(1, customer.howManyCars());
        assertEquals(0,dealership.howManyCars());
    }


}
