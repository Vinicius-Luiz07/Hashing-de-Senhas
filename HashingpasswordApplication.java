package com.hashingpassword.hashingpassword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class HashingpasswordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HashingpasswordApplication.class, args);

		HashObjeto hash = new HashObjeto();

		Scanner leia = new Scanner(System.in);

		System.out.println("Ola, digita sua senha: ");
		String senha = leia.nextLine();
		String saida = hash.hashMetodo(senha);

		System.out.println("Senha original: " + senha);
		System.out.println("Senha Hash: " + saida);

	}

}
