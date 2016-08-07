package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class MongoDbpocApplication implements CommandLineRunner {

	@Autowired
	private MonetaryTransferRepository monetaryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbpocApplication.class, args);
	}

	public void run(String... args) throws Exception {

		/*
		 * Collections.nCopies(100000000, 1).parallelStream().forEach(i -> {
		 * 
		 * MonetaryTransferInstruction instruction = new
		 * MonetaryTransferInstruction(); Random random = new Random(); int c =
		 * random.nextInt(1000000); System.out.println(c);
		 * instruction.setCustomerId(Integer.valueOf(c).toString());
		 * instruction.setFirstName("Aman"); instruction.setLastName("Sardana");
		 * instruction.setStatus("P"); instruction.setAmount("12.00");
		 * List<MonetaryTransferInstance> monetaryTransferInstanceList = new
		 * ArrayList<>(); MonetaryTransferInstance ins1 = new
		 * MonetaryTransferInstance(); ins1.setStatus("I");
		 * ins1.setTransferDeliverDate("12/12/2017");
		 * ins1.setTransferSendDate("11/12/2017");
		 * monetaryTransferInstanceList.add(ins1);
		 * 
		 * instruction.setMonetaryTransferInstance(monetaryTransferInstanceList)
		 * ;
		 * 
		 * monetaryRepository.save(instruction); });
		 */

		

		StopWatch watch = new StopWatch();
		watch.start();
		for (MonetaryTransferInstruction monetaryTransferInstruction : monetaryRepository.findByCustomerId("20006")) {
			System.out.println("Found ---> " + monetaryTransferInstruction);
		}
		watch.stop();
		
		System.out.println("Fetched the instructions ---> " + watch.getTotalTimeMillis());
	}
}
