package com.adminServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adml")
public class AdminLogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession s=req.getSession();
		s.removeAttribute("adminObj");
		s.setAttribute("msg", "Admin Logout SuccesFull");
		res.sendRedirect("admis_login.jsp");
	}

}
