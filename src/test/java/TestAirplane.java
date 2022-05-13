import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestAirplane {

    Airplane airplane;

    @BeforeEach
    public void setUp() {
        airplane = new Airplane("Beoing", 20);
    }

    @Test
    public void hasType() {
        assertThat(airplane.getType()).isEqualTo("Boeing");
    }

    @Test
    public void hasSize() {
        assertThat(airplane.getSize()).isEqualTo(20);
    }

    @Test
    public void hasFunction() {
        assertThat(airplane.getIsFunction()).isEqualTo(true);
    }
}
