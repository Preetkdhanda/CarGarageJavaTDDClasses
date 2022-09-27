import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void before(){
        car = new Car("Ford","Fiesta","Red",12000, 500, TypeOfCar.FUEL,TypeOfEngine.ENGINE1_2, TypeOfTyres.NORMAL, TypeOfGearbox.AUTOMATIC);
    }

    @Test
    public void hasMake(){
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void hasPrice(){
        assertEquals(12000, car.getPrice());
    }

    @Test
    public void hasFuelType(){
        assertEquals("Fuel", car.getTypeOfCar().getValue());
    }

    @Test
    public void hasTypeOfEngine(){
        assertEquals(1.2, car.getTypeOfEngine().getValue(),0.0);
    }

    @Test
    public void hasTypeOfTyres(){
        assertEquals("Normal", car.getTypeOfTyres().getValue());
    }

    @Test
    public void hasTypeOfGearbox(){
        assertEquals("Automatic", car.getTypeOfGearbox().getValue());
    }
}
