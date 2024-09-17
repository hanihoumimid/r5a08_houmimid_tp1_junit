package r5a08.tp1;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class UserGreatingTest{
    @Test
    @Order(1)
    public void formatGreeting_is_not_empty(){
        //Arrange
        var user = new UserGreating();
        //Act
        String name = user.formatGreeting("Hani");
        //Assert
        Assertions.assertFalse(name.isEmpty());
    }
    @Test
    @Order(2)
    public void formatGreeting_as_less_than_10_char(){
        Assertions.assertTrue(name.length() < 11);
    }
    @Test
    @Order(3)
    public void formatGreeting_does_not_contain_special_char(){

    }
}
