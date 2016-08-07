package com.example;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MonetaryTransferRepository extends MongoRepository<MonetaryTransferInstruction, String> {
	
public List<MonetaryTransferInstruction> findByCustomerId(String customerId);

}
