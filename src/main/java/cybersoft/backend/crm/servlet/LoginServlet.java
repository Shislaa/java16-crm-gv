package cybersoft.backend.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.backend.crm.servlet.util.JspConst;
import cybersoft.backend.crm.servlet.util.UrlConst;

@WebServlet(name = "loginServlet", urlPatterns = UrlConst.LOGIN)
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(JspConst.AUTH_LOGIN).forward(req, resp);
	}
}
