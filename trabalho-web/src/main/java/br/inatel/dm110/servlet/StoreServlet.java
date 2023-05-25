package br.inatel.dm110.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.inatel.dm110.interfaces.StoreLocal;


@WebServlet("/StoreServlet")
public class StoreServlet extends HttpServlet {

	private static final long serialVersionUID = -24118939727042992L;
	private static Logger log = Logger.getLogger(StoreServlet.class.getName());
	
	@EJB
	private StoreLocal storeBean;

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		log.info("name: " + name);
//		resp.setContentType("text/html");
//
//		try (PrintWriter out = resp.getWriter()) {
//			out.println("<h1>Hello from Servlet!</h1>");
//			if (name == null) {
//				out.println("<h2>No name to say hi</h2>");
//			} else {
//				out.println("<h2>" + storeBean.sayHello(name) + "</h2>");
//			}
//			// out.println("Current date: " + new java.util.Date());
//		}
//	}
}
