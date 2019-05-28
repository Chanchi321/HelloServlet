package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 这行代码要写在所有的getPrameter之前，
		 * 告知服务器，针对post请求，使用哪种字符集解码；
		 */
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("name:"+name);
		response.getWriter().println("<h1>你好"+name+"<br>age:"+age+"</h1>");
		
	}
}
