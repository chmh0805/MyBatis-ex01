package com.hyuk.mybatisex01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hyuk.mybatisex01.model.beans.SaleBean;
import com.hyuk.mybatisex01.repository.SaleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class SaleController {
	
	private final SaleRepository saleRepository;

	@GetMapping("/sale/{id}")
	public SaleBean findById(@PathVariable int id) {
		return saleRepository.findByIdAndJoin(id);
	}
}
