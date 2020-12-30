package com.ks.stuaimis.action.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ks.stuaimis.biz.person.PersonBiz;

@RequestMapping("/person")
@Controller
public class PersonAction {
	
	@Autowired
	private PersonBiz personBiz;
	
	
	@RequestMapping("query")
	public String showPersonList(Model model)throws Exception{
		model.addAttribute("DATA", personBiz.findPersonList());
		return "personList";
	}

}
