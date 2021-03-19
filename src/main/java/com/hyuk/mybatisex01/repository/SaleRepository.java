package com.hyuk.mybatisex01.repository;

import org.apache.ibatis.annotations.Mapper;

import com.hyuk.mybatisex01.model.beans.SaleBean;

@Mapper
public interface SaleRepository {
	public SaleBean findByIdAndJoin(int id);
}
