package com.model;

import javax.servlet.http.HttpServletRequest;

import com.controller.Controller;
import com.controller.RequestMapping;

@Controller("mainModel")
public class MainController {
	
	@RequestMapping("main.do")
	public String main_page(HttpServletRequest req){
		req.setAttribute("msg", "Main_페이지");
		return "view/main.jsp";
	}
	
	@RequestMapping("board1.do")
	public String board_list(HttpServletRequest req){
		req.setAttribute("msg", "Board_페이지");
		return "view/board.jsp";
	}
}
