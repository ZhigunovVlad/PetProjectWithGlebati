package health;

import health.context.MyApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

// Аннотация указывает, что мы хотим поднять полный контекст приложения
@SpringBootTest(classes = MyApp.class)
class ContextTest {

    // Инъектируем контекст приложения для проверки его успешной загрузки
    @Autowired
    private ApplicationContext context;

    /**
     * Проверяет, успешно ли поднялся контекст Spring Boot
     */
    @Test
    void whenApplicationIsStarted_thenContextIsLoadedSuccessfully() {
        Assertions.assertNotNull(context); // Контекст существует
    }
}