package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var builder = new SpringApplicationBuilder(DemoApplication.class);
		builder.headless(false);
		var fabrica = builder.run(args);

		var interfaceComUsuario = fabrica.getBean(ClienteUI.class);
		interfaceComUsuario.cadastraCliente();
		interfaceComUsuario.pesquisaCliente();
	}

}
