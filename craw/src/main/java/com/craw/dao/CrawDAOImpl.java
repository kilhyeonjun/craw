package com.craw.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.craw.domain.CrawVO;

@Repository
public class CrawDAOImpl implements CrawDAO {

	@Inject
 	private SqlSession sql;
 
 	private static String namespace = "com.craw.mappers.craw";

 	// 데이터 목록
 	@Override
	public List<CrawVO> list() throws Exception { 
	  
	 return sql.selectList(namespace + ".list");
	}
 	
 	// 데이터 작성
	@Override
	public void write(CrawVO vo) throws Exception {
		
		sql.insert(namespace + ".write", vo);
	}
	
	// 데이터 조회
	public CrawVO view(int bno) throws Exception {
	 
	 return sql.selectOne(namespace + ".view", bno);
	}
}