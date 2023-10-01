package dad.maven.gson;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person individual = new Person();
		
		System.out.println("Insert person's name");
		String name = sc.nextLine();
		System.out.println("Insert person's surename");
		String surename = sc.nextLine();
		System.out.println("Insert person's age");
		int age = sc.nextInt();
		
		individual.setName(name);
		individual.setSurename(surename);
		individual.setAge(age);
		
		/*System.out.println(individual.getName());
		System.out.println(individual.getSurename());
		System.out.println(individual.getAge());*/
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(individual);
        System.out.println(json);
		
	}
}
