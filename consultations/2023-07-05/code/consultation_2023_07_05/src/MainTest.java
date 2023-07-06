import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main m;

    @BeforeEach
    public void init(){
        m = new Main();
    }

    @Test
    public void test_3elt(){
        int[]ints ={3,2,3};
        assertEquals(1,m.balancedSum(ints));
    }


    @Test
    public void test_5elt(){
        int[]ints ={3,2,1,1,4};
        assertEquals(2,m.balancedSum(ints));
    }


    @Test
    @DisplayName("проверяем второй элемент")
    public void test_Second_elt(){
        int[]ints ={3,3,1,1,1};
        assertEquals(1,m.balancedSum(ints));
    }

    @Test
    @DisplayName("проверяем последний возможный элемент")
    public void test_last_elt(){
        int[]ints ={3,3,1,10,7};
        assertEquals(3,m.balancedSum(ints));
    }

}