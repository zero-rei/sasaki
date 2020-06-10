package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;

/**
 * Servlet implementation class listServlet
 */
@WebServlet("/listServle")
public class listServle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public listServle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String nai = request.getParameter("nai");
		String mail = request.getParameter("mail");
		String time = request.getParameter("time");
		String times = request.getParameter("times");

		ArrayList<Employee> list =new ArrayList<Employee>();
		list=EmployeeDao.tukareta3(name,nai,mail,time,times);

		ArrayList<Employee> List = new ArrayList<Employee>();
		List = EmployeeDao.selectAllStudent1( );

		request.setAttribute("list", List);

		String view = "/WEB-INF/view/result1.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
