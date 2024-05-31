package ex3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String viewPath = null;
		
		request.setAttribute("test", "TestAction활용");
		
		//forward할 JSP 경로를 반환하자!
		
		viewPath = "/ex3/page3.jsp";
		
		return viewPath;
	}
	
}
