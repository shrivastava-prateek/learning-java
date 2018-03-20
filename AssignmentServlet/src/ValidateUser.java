

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String user=request.getParameter("user");
		 String pass=request.getParameter("pass");
		 if(user.equals("abc")&&pass.equals("abc123")){
			 response.sendRedirect("ValidUser.jsp");
		 }
		 else
			 response.sendRedirect("InvalidUser.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
