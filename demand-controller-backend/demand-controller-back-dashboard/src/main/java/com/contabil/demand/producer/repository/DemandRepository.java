package com.contabil.demand.producer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.contabil.demand.contract.model.Demand;

public interface DemandRepository extends MongoRepository<Demand, String> {

}
