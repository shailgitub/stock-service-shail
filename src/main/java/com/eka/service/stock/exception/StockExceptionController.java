package com.eka.service.stock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StockExceptionController {

	@ExceptionHandler(value = StockNotFoundException.class)
	public ResponseEntity<Object> exception(StockNotFoundException exception) {
		return new ResponseEntity<>("stock not found", HttpStatus.NOT_FOUND);
	}
}
