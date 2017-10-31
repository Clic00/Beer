package br.com.example.web;

import java.io.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import br.com.example.model.BeerExpert;

/***
 * @author Levyzão
 * 
 * CAMADA DE CONTROLE
 *
 */

@WebServlet("/BeerSelect")
public class BeerSelect extends HttpServlet {
	       
	private static final long serialVersionUID = 2L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		BeerExpert be = new BeerExpert();		
		Locale local = new Locale("pt","BR");
		Date today = new Date();		
		DateFormat dt = DateFormat.getDateInstance(DateFormat.FULL,local);

		String hora = dt.format(today.getTime()).toString();
		String cor = request.getParameter("color");
		List<String> result = be.getBrands(cor);
		
		request.setAttribute("styles",result);
		request.setAttribute("color", cor);
		request.setAttribute("time", hora);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
			
	}

}
