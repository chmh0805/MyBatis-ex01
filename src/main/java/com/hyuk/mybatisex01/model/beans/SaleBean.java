package com.hyuk.mybatisex01.model.beans;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SaleBean {
	private int id; // Sale
	private String username; // Sale
	private String name; // Product
	private String code; // Product
}
