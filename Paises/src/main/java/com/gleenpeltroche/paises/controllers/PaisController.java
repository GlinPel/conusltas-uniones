package com.gleenpeltroche.paises.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gleenpeltroche.paises.services.ApiService;

@Controller
public class PaisController {
	@Autowired
	ApiService apiService;
	
	@RequestMapping("")
	public String index(Model model) {
		List<Object[]> lista1 = apiService.queryNumber1();
		model.addAttribute("lista1", lista1);
		List<Object[]> lista2 = apiService.queryNumber2();
		model.addAttribute("lista2", lista2);
		List<Object[]> lista3 = apiService.queryNumber3();
		model.addAttribute("lista3", lista3);
		List<Object[]> lista4 = apiService.queryNumber4();
		model.addAttribute("lista4", lista4);
		List<Object[]> lista5 = apiService.queryNumber5();
		model.addAttribute("lista5", lista5);
		List<Object[]> lista6 = apiService.queryNumber6();
		model.addAttribute("lista6", lista6);
		List<Object[]> lista7 = apiService.queryNumber7();
		model.addAttribute("lista7", lista7);
		return "index.jsp";
	}
}
