package com.contabil.demand.producer.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.contabil.demand.contract.model.Demand;
import com.contabil.demand.producer.repository.DemandRepository;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public class DemandService {

	private final DemandRepository demandRepository;
	
	
	public List<Demand> getDemands(){
		return demandRepository.findAll();
	}
	
	public ResponseEntity<String> insertDemand(Demand demand) {
		log.info("Enviando entidade {}, para persistecia");
		
		try {
			demandRepository.save(demand);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body("Ocorreu um problema na inclusão de uma nova demanda!");
		}
		
		return ResponseEntity.ok().body("Demanda inserida com sucesso");
	}
	
}
