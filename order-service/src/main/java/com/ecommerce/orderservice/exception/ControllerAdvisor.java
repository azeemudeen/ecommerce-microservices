package com.ecommerce.orderservice.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ControllerAdvisor {

    @ExceptionHandler(ProductOutOfStockException.class)
    public ResponseEntity<ErrorResponse> handleProductOutOfStock(ProductOutOfStockException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), ex.getStatusCode(), ex.getTimestamp());
        log.error("Status {} - Exception: {} ",errorResponse.getStatusCode(),errorResponse.getMessage());
        return new ResponseEntity<>(errorResponse, errorResponse.getStatusCode());
    }
}
