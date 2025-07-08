package Java_MongoDB.Funcionarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"FuncionarioRepository", "FuncionarioService"})
public class Funcionario_Application {

	public static void main(String[] args) {
		SpringApplication.run(Funcionario_Application.class, args);
	}

}
