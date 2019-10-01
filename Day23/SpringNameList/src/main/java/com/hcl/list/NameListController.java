package com.hcl.list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class NameListController {
	@RequestMapping("/list")
	public ModelAndView nameDemo() {
		List<String> lstNames=new ArrayList<String>();
		lstNames.add("Priya");
		lstNames.add("Vineeth");
		lstNames.add("Swetha");
		lstNames.add("Viji");
		lstNames.add("Vishwa");
		return new ModelAndView("ShowPage","lists",lstNames);
	}

}
