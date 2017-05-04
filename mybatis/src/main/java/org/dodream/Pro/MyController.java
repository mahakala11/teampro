package org.dodream.Pro;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@Autowired
	public MyService svc;
	@Autowired
	SqlSessionTemplate SqlSessionTemplate;
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
    public String inputform(Model model,MyVO vo,BindingResult result){
		
    	return "/input";
    }

	@RequestMapping(value = "join", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Boolean> input(MyVO vo,Model model,HttpSession session){
		Map<String, Boolean> map = new HashMap<String,Boolean>();
		boolean ok = svc.join(vo);
		map.put("save",ok);
		int n = 0;
		return map;
	
	}
	
}
