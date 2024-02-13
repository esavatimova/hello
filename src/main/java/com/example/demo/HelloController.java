package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Класс помечен как @RestController, что означает, что он готов к использованию Spring MVC для обработки веб-запросов.
 * @GetMapping сопоставляет / с методом index().
 * При вызове из браузера или с помощью curl в командной строке метод возвращает чистый текст.
 * Это происходит потому, что @RestController объединяет @Controller и @ResponseBody, две аннотации,
 * которые приводят к тому, что веб-запросы возвращают данные, а не представление.
 */
@RestController
public class HelloController {

    @GetMapping("/helloWorld")
    public String index() {
        return "Hello world";
    }

}