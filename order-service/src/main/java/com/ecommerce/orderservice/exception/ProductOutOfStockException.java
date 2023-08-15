package com.ecommerce.orderservice.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class ProductOutOfStockException extends RuntimeException{
    private String message;
    private HttpStatus statusCode;
    private LocalDateTime timestamp;

    public ProductOutOfStockException(String message){
        this.message = message;
        this.statusCode = HttpStatus.NOT_FOUND;
        this.timestamp = LocalDateTime.now();
    }
}
