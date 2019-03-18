package com.gym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.dao.CardioDao;
import com.gym.model.Cardio;

@Service
public class CardioService {
	@Autowired
	private CardioDao cardioDao;
	
	public List<Cardio> getCardioMems(){
		  Iterable<Cardio> cardioList = cardioDao.findAll();
		  List<Cardio> cardio = new ArrayList<>();
		  cardioList.forEach(list -> cardio.add(list));
		return cardio;
		
	}



	public void createCardioMem(Cardio code) {
		cardioDao.save(code);
	}
	
	

}
