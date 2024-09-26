package com.diegolinkk.testejdbc2;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.diegolinkk.testejdbc2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Testejdbc2Application implements CommandLineRunner {
	@Autowired
	UsuarioRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Testejdbc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.listarUsuarios().forEach(u -> System.out.println(u));
	}
}
