package com.Controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daoimplementations.UserDaoImpl;
import com.model.User;

@WebServlet("/CollectAllAgents")
public class CollectAllAgents extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDaoImpl userdaoimpl = new UserDaoImpl();
		List<User> DeliveryAgents = userdaoimpl.getAllUserByRole("DeliveryAgent");
		HttpSession ses = req.getSession();
		ses.setAttribute("DeliveryAgents", DeliveryAgents);
		resp.sendRedirect("AllDeliveryAgents.jsp");
	}
}