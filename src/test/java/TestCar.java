import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCar {

    Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Audi", 100);
    }

    @Test
    public void hasType() {
        assertThat(car.getType()).isEqualTo("Audi");
    }

    @Test
    public void hasSize() {
        assertThat(car.getSize()).isEqualTo(100);
    }

    @Test
    public void hasFunction() {
        assertThat(car.getIsFunction()).isEqualTo(true);
    }

    //step 7: create an interface & implement on at least 1 class
    @Override
    public void speedUp (int speed) {
        this.gear;
        System.out.println("switch gears to " + this.gear);
        System.out.println("accelerate");
        this.speed = speed;
    }

    @Override
    public void applyBrake (int amount) {
        System.out.println("apply brake hard");
        this.speed = amount;
    }
}
