package com.craw.dao;

import java.util.List;

import com.craw.domain.CrawVO;

public interface CrawDAO {

	//게시물 목록
	public List<CrawVO> list() throws Exception; 
	
	//게시물 작성
	public void write(CrawVO vo) throws Exception;
	
	// 게시물 조회
	public CrawVO view(int bno) throws Exception;
}