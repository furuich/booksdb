package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.ExService;
import com.example.demo.form.ExForm;

//初期画面表示、Serviceに検索の指示

@Controller
public class ExController {
	@Autowired
	private ExService service;

	// 初期画面表示

	@RequestMapping(value ="/", method = RequestMethod.GET)
public String index(@ModelAttribute("form") ExForm form) {
		return "index";
	}

	// 検索結果表示 の指示

	@RequestMapping(value ="/search", method = RequestMethod.POST)
public String search(@ModelAttribute("form") ExForm form, Model model) {

		// 検索処理（select）を呼び出す
		service.select(form);

		// model に詰める
		model.addAttribute("form", form);

		return "index";
	}

}
