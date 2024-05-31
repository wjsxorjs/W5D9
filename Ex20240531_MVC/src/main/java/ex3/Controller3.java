package ex3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex3.GreetAction;
import ex3.DateAction;
import ex3.TestAction;

/**
 * Servlet implementation class Controller3
 */
@WebServlet("/Controller3")
public class Controller3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		
		String viewPath = null;
		
		Action action = null;
		
		if(type == null || type.equalsIgnoreCase("greet")) {
			action = new GreetAction();
		} else if(type.equalsIgnoreCase("date")){
			action = new DateAction();
		}else if(type.equalsIgnoreCase("test")){
			action = new TestAction();
			/*
			 action = new Action(){
			 
			 	@Override
			 	public String execute(HttpServletRequest request, HttpServletResponse response){
			 		request.setAttribute("test","TestAction활용");
			 		return "/ex3/page3.jsp";
			 	}
			 
			 };
			도 가능하지만. 개인적인 심미적 만족감 때문에 그냥 만들었습니다.
			까먹기도 했었고요.
			*/
		} else if(type.equalsIgnoreCase("hungry")) {
				action = (req, res) -> {
				 		req.setAttribute("hungry","배고프다");
				 		return "/ex3/page4.jsp";
				 };
		}
		
		viewPath = action.execute(request, response);
		
		
		RequestDispatcher disp = request.getRequestDispatcher(viewPath);
		disp.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
