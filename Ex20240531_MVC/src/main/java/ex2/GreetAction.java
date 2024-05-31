package ex2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetAction {
	
	public String exe(HttpServletRequest request, HttpServletResponse response) {
		String viewPath = null;
		
		request.setAttribute("msg", "MVC를 시작합니다.");
		
		//forward할 JSP 경로를 반환하자!
		
		viewPath = "/ex2/page1.jsp";
		
		return viewPath;
	}
	
}
