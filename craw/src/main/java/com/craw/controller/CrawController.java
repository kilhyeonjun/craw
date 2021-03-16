package com.craw.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.craw.domain.CrawVO;
import com.craw.service.CrawService;


@Controller
@RequestMapping("/craw/*")
public class CrawController {
	
	@Inject
	private CrawService service;
	
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void getList(Model model) throws Exception {
		 
		 
	  List<CrawVO> list = null;
	  list = service.list();
	  model.addAttribute("list", list);
	  
	 }
}