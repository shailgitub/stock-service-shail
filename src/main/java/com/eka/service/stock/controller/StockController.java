package com.eka.service.stock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eka.service.stock.exception.StockNotFoundException;
import com.eka.service.stock.model.GoodRecordDetails;
import com.eka.service.stock.service.StockService;

@RestController
@RequestMapping("/stock")
public class StockController {

	@Autowired
	StockService stockService;

	//StockList
	@GetMapping("/stocklist")
	public ResponseEntity<Object> getStockList() {

		List<GoodRecordDetails> stockList = stockService.stockList();
		Optional<?> optional=Optional.ofNullable(stockList);
		if(optional.isPresent()) {
			return new ResponseEntity<Object>(stockList,HttpStatus.OK);
		}else {
			return new ResponseEntity<Object>(stockList,HttpStatus.NO_CONTENT);
		}
	}
	
	//get Stock by Id
		@GetMapping("/stocklist/{id}")
		public ResponseEntity<Object> getStockById(@PathVariable Integer id) {
			Optional<GoodRecordDetails> goodRecordDetails = stockService.getStockFindById(id);
			if(!goodRecordDetails.isPresent()) throw new StockNotFoundException();
				return new ResponseEntity<Object>(goodRecordDetails,HttpStatus.OK);
		}
}
