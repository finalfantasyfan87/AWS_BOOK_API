package com.example.bookapi;

import com.example.controller.BookController;
import com.example.model.BookDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {BookDTO.class, BookController.class})
public class BookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApiApplication.class, args);
	}

}
