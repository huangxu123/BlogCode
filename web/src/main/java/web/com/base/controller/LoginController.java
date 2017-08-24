package web.com.base.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import web.com.base.entity.User;
import web.com.base.service.UserService;

@Controller
public class LoginController extends BaseController{

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="system/login")
	public ModelAndView login(@RequestParam("username")String username,@RequestParam("password")String password){
		System.out.println("------------request----------name:"+username+",password:"+password);
		
		logger.debug("-----debug-----");
		logger.info("-----info-----");
		logger.error("-----error-----");
		logger.warn("-----warn-----");
		logger.trace("-----trace-----");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("name", "world");
		return new ModelAndView("system/login_success", model);
	}

	@RequestMapping(value="system/select")
	@ResponseBody
	public String selectDate(@RequestParam("id")int id){
		System.out.println("------------request----------id:"+id);
		
		User user = userService.findById(id);
		
		return user.toString();
	}
	
	
}
