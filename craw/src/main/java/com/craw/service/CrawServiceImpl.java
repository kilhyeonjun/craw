package com.craw.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.craw.dao.CrawDAO;
import com.craw.domain.CrawVO;

@Service
public class CrawServiceImpl implements CrawService {

	@Inject
 	private CrawDAO dao;
 
 	//게시물 목록
	@Override
	public List list() throws Exception {
	
		return dao.list();
	}

	//게시물 작성
	@Override
	public void write(CrawVO vo) throws Exception {
		dao.write(vo);
	}

	// 게시물 조회
	@Override
	public CrawVO view(int bno) throws Exception {

	 return dao.view(bno);
	}
}