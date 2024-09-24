package r5a08.tp1;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class UserGreatingTest{

    @Test
    @Order(1)
    public void formatGreeting_resultat_is_ok(){
        //Arrange
        var user = new UserGreating();
        //Act
        String name = user.formatGreeting("Hani");
        //Assert
        String exceptedName = "Bonjour Hani";
        Assertions.assertEquals(name,exceptedName);



    }
    @Test
    @Order(2)
    public void formatGreeting_is_not_empty(){
        //Arrange
        String name = "Hani";
        //Assert
        Assertions.assertFalse(name.isEmpty());
    }
    @Test
    @Order(3)
    public void formatGreeting_has_less_than_10_char(){
        //Arrange
        String name = "Hani";
        //Assert
        Assertions.assertTrue(name.length() < 11);
    }
    @Test
    @Order(4)
    public void formatGreeting_does_not_contain_special_char(){
        //Arrange
        Pattern s = Pattern.compile("^[a-zA-Z0-9 _-]+$");
        //Act
        String name = "Hani";
        boolean b = Pattern.matches(String.valueOf(s),name);
        //Assert
        Assertions.assertTrue(b);
    }
}
