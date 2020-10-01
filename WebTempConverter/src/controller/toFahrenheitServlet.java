package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CelsiusToFahrenheit;

/**
 * Servlet implementation class toFahrenheitServlet
 */
@WebServlet("/toFahrenheitServlet")
public class toFahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public toFahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tempC = (request.getParameter("cNum"));
		
		CelsiusToFahrenheit userTemp = new CelsiusToFahrenheit(Double.parseDouble(tempC));
		
		request.setAttribute("userTemperature", userTemp);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);

		PrintWriter writer = response.getWriter();
		writer.println(userTemp.toString());
		writer.close();
	}

}
