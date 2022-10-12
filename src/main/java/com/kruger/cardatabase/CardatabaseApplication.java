package com.kruger.cardatabase;

import com.kruger.cardatabase.domain.CarRepository;
import com.kruger.cardatabase.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	//private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	@Autowired
	private CarRepository carRepository;


	@Autowired
	private OwnerRepository orepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/**
		// Add owner objects and save these to db
		Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new  Owner("Mary" , "Robinson");


		orepository.saveAll(Arrays.asList(owner1, owner2));

		Car car1= new Car("Ford", "Mustang", "Red","ADF-1121", 2021, 59000, owner1);
		Car car2= new Car("Nissan", "Leaf","White","SSJ-3002", 2019, 29000,owner2);
		Car car3=new Car("Toyota", "Prius","Silver","KKO-0212", 2020, 39000, owner2);

		carRepository.saveAll(Arrays.asList(car1,car2,car3));
		// Fetch all cars and log to console
		for (Car car : carRepository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}*/


	}
}
