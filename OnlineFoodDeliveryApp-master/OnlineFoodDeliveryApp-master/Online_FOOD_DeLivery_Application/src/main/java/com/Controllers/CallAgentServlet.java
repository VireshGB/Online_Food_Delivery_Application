package com.Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CallAgentServlet")
public class CallAgentServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int orderid = Integer.parseInt(req.getParameter("orderId"));
		HttpSession ses = req.getSession();
		ses.setAttribute("orderid", orderid);
		resp.sendRedirect("CollectAllAgents");
	}
}