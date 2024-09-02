package es.studium.Practica3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPracticaDaw3
 */
@WebServlet("/ServletPracticaDaw3")
public class ServletPracticaDaw3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  Modelo modelo = new Modelo();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPracticaDaw3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 String numeros = request.getParameter("numeros");
		  
		 ArrayList<Integer> original = new ArrayList<Integer>();
	        String[] tablaNumeros = numeros.split(",");
	        for (String numero : tablaNumeros) {
	            original.add(Integer.parseInt(numero));
	        }
	        
	        ArrayList<String> resultado = modelo.verificarPrimos(original);
	        
	        response.getWriter().append(resultado + "");
	        
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<form>");
	        out.println("<input type=\"buttom\" value=\"Volver\" onclick=\"history.back()\">");
	        out.println("</form>");
	}

}
