package Homework.Work_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task2_UserValidatorTest {

    @BeforeEach
    void resetFlag() {
        Task2_UserValidator.validationEnable  = true;
    }

    @Test //Валидный пользователь
    void shouldPassValidationForValidUser() {
        UserData userData = new UserData("Anton", 38, "anton@email.com");
        assertDoesNotThrow(() -> Task2_UserValidator.validate(userData));
    }

    @Test //Невилидное имя
    void shouldThrowExceptionForInvalidName() {
        UserData userData = new UserData("anton", 38, "anton@mail.com");

        assertThrows(InvalidUserException.class, () -> Task2_UserValidator.validate((userData)));
    }

    @Test //Флаг отключен
    void shouldSkipValidationWhenDisable() {
        Task2_UserValidator.validationEnable = false;

        UserData userData = new UserData("", -38, "bad");

        assertDoesNotThrow(() -> Task2_UserValidator.validate(userData));
    }
}
