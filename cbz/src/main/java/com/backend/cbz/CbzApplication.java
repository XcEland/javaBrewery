package com.backend.cbz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.cbz.model.BankAccount;
import com.backend.cbz.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class CbzApplication {

	static ObjectMapper objectMapper = new ObjectMapper();
	public static void main(String[] args) {
		SpringApplication.run(CbzApplication.class, args);
	}

	public static void writeValue() throws JsonProcessingException{
		BankAccount bankAccount = new BankAccount(123, "Geekific");
		try {
			objectMapper.writeValue(new File("src/main/resources/jsons/BankAccount.json"), bankAccount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String asString = objectMapper.writeValueAsString(bankAccount);
		System.out.println(asString);
		

	}

	public static void Demo(){

		String json = "{{\"id\":2,\"holderName\":\"Donal\"},}"
		+ "{{\"id\":223,\"holderName\":\"Dawns\"},}";
		try {
			BankAccount[] acc = objectMapper.readValue(json, BankAccount[].class);

			for (BankAccount i: acc){
				System.out.println(i);
			}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}catch(JsonProcessingException e){
			e.printStackTrace();
		}
	}

	public static void oK(){
		// String jsonString = "{ \"id\": 1, \"name\": \"John Doe\", \"email\": \"john.doe@example.com\" }";
		String filePath ="src/main/resources/txt/stringFormat.txt";

		 try {
			String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
			User user = objectMapper.readValue(jsonString, User.class);
			objectMapper.writeValue(new File("src/main/resources/jsons/User.json"), user);
			System.out.println(user);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		// try{
		// 	// User user = objectMapper.readValue(new File("src/main/resources/txt/bankAccount.txt"), User.class);
		// 	writeValue();
		// 	System.out.println("Demo: ");
		// 	// Demo();
		// } catch (Exception e){
		// 	e.printStackTrace();
		// }
	}



}
