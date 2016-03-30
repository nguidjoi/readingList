package com.manning.readinglist.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/logout")
	public String logout() {
		return "index";
	}


	@RequestMapping(value = "/charts")
	public String charts() {
		return "charts";
	}

	@RequestMapping(value = "/tables")
	public String tables() {
		return "tables";
	}

	@RequestMapping(value = "/widgets")
	public String widgets() {
		return "widgets";
	}

	@RequestMapping(value = "/icons")
	public String icons() {
		return "icons";
	}

	@RequestMapping(value = "/panels")
	public String panels() {
		return "panels";
	}

	@RequestMapping(value = "/forms")
	public String forms() {
		return "forms";
	}
}
