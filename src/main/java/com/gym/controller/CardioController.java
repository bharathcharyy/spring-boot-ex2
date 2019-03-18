package com.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.model.Cardio;
import com.gym.service.CardioService;

@RestController
@RequestMapping(value="/v1-gym")
public class CardioController {
	@Autowired
	private CardioService cardioService;
	
	@GetMapping("/")
	public ResponseEntity<List<Cardio>> getCardioMems(){
		return new ResponseEntity<>(cardioService.getCardioMems(), HttpStatus.OK);
		
	} 
	
//	@PostMapping("/create")
//	public ResponseEntity<?> createCardioMem(@RequestBody Cardio cardio){
//		return new ResponseEntity<>(cardioService.createCardioMem(cardio), HttpStatus.OK);
//		
//	}

}
