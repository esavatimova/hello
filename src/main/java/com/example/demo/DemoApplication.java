package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/*
 * @SpringBootApplication— это удобная аннотация, которая добавляет все следующее:
 * @Configuration: помечает класс как источник определений компонентов для контекста приложения.
 * @EnableAutoConfiguration: сообщает Spring Boot, что нужно начать добавление bean-компонентов на основе настроек пути к классам,
 * других bean-компонентов и различных настроек свойств.
 * Например, если эта spring-webmvc аннотация находится в пути к классам, она помечает приложение как веб-приложение и активирует
 * ключевые действия, такие как настройка файла DispatcherServlet.
 * @ComponentScan: сообщает Spring искать другие компоненты, конфигурации и службы в com/example пакете, позволяя ему найти контроллеры.
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
/*который запускается при старте
извлекает все bean-компоненты, которые были созданы вашим приложением или автоматически добавлены Spring Boot.
Он сортирует их и выводит*/
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}