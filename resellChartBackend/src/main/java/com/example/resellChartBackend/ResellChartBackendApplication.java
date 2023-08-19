package com.example.resellChartBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping(path = "api/clothItem")
public class ResellChartBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResellChartBackendApplication.class, args);
	}

}
