package com.contabil.demand.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan("com.contabil.demand.contract.model")
@EnableMongoRepositories("com.contabil.demand.producer.repository")
public class DemandControllerBackProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemandControllerBackProducerApplication.class, args);
	}

}
