package com.hyuk.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hyuk.mybatisex01.model.Product;

@Mapper
public interface ProductRepository {
	public void save(Product product);
	public void delete(int id);
	public void update(Product product);
	public List<Product> findAll();
	public Product findById(int id);
}
