package com.ecommerce.orderservice.dto;

import com.ecommerce.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
