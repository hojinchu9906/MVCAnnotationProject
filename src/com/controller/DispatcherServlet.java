package com.controller;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet extends HttpServlet{

	private static final long serialVersionUID=1L;
	
	private String[] strCls={
		"com.model.MainController",
		"com.model.MemberController"
	};

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try{
			String cmd=req.getRequestURI();
			
			cmd=cmd.substring(req.getContextPath().length()+1);		//     /MVCProject/main.do
			for(String cls:strCls){
				Class clsName=Class.forName(cls);
				
				if(clsName.isAnnotationPresent(Controller.class)==false)
					continue;
				
				Object obj=clsName.newInstance();
				
				Method[] methods=clsName.getDeclaredMethods();
				for(Method m:methods){
					RequestMapping rm=
							m.getAnnotation(RequestMapping.class);
					if(rm.value().equals(cmd)){
						String jsp=(String)m.invoke(obj, req);
						
						RequestDispatcher rd=
								req.getRequestDispatcher(jsp);
						rd.forward(req, resp);
						return;
					}
				}
			}
			
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	
	
}















































