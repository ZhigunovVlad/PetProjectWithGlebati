package health.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Для проверки контекст необходимо поднять его и перейти по ссылке localhost:8081/health/actuator
 */
@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args); // метод run инициализирует весь контекст и запускает встроенный веб-контейнер
    }
}