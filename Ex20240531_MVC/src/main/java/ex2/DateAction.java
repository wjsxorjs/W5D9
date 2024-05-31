package ex2;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateAction {

	public String exe(HttpServletRequest request, HttpServletResponse response) {
		String viewPath = null;
		
		LocalDate date = LocalDate.now();
		
		request.setAttribute("date", date.toString());
		
		//forward할 JSP 경로를 반환하자!
		
		viewPath = "/ex2/page2.jsp";
		
		return viewPath;
	}
	
	
}
