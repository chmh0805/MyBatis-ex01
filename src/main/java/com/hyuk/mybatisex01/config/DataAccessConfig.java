package com.hyuk.mybatisex01.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class DataAccessConfig {

	// SQL Session 객체를 만들어서 DB에 접근
	
	//SQLSession을 만들기 위한 공장 생성
	// 1. DataSource 등록 (application.yml 의 spring:database: )
	
	// 2. xml 파일 연결
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("mapper/*.xml"));
		return sessionFactoryBean.getObject();
	}
	
	// SQLSession 만들기
	// 1. SQLSession은 인터페이스여서 직접 만들면 구현해야 할 함수가 너무 많기 때문에 SqlSessionTemplate 사용 (편함)
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
