package com.model;

import javax.servlet.http.HttpServletRequest;

import com.controller.Controller;
import com.controller.RequestMapping;

@Controller("memberModel")
public class MemberController {

	@RequestMapping("join1.do")
	public String join(HttpServletRequest req){
		req.setAttribute("msg", "Join_∆‰¿Ã¡ˆ");
		return "view/join.jsp";
	}
}
