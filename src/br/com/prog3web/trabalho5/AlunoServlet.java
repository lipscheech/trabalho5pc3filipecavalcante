package br.com.prog3web.trabalho5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Aluno")
public class AlunoServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Instrui o browser a respeito do tipo de cont�udo
		resp.setContentType("text/html");

		// cria um objeto do tipo PrintWriter, para enviar mensagem ao browser
		PrintWriter out = resp.getWriter();

		String nome, matricula, idade, genero;

		// pegando os valores de vari�veis enviadas do cliente
		matricula = req.getParameter("matricula");
		nome = req.getParameter("nome");
		idade = req.getParameter("idade");
		genero = req.getParameter("genero");

		// imprime estes dados no cliente
		out.println("<!DOCTYPE HTML><HTML><HEAD><TITLE>Cadastro");
		out.println("</TITLE></HEAD><BODY>");
		out.println("<H1>Dados do Aluno</H1>");

		int idd = Integer.parseInt(idade);

		if (idd >= 18) {
			if (genero.equals("masculino")) {
				out.println("<p> Como vai garoto !</p>");
				out.println("<p>Nome: " + nome + "</p>");
				out.println("<p>Matricula: " + matricula + "</p>");
				out.println("<p>G�nero: " + genero + "</p>");
				out.println("Voc� precisa servir ao ex�rcito");
			} else {
				out.println("<p>Como vai querida !");
				out.println("<p>Nome: " + nome + "</p>");
				out.println("<p>Matricula: " + matricula + "</p>");
				out.println("<p>G�nero: " + genero + "</p>");
				out.println("<p>Idade: " + idade + " anos</p>");
				out.println("Voc� n�o precisa servi ao ex�rcito");
			}

		} else {
			if (genero.equals("masculino")) {
				out.println("<p> Como vai garoto !</p>");
				out.println("<p>Nome: " + nome + "</p>");
				out.println("<p>Matricula: " + matricula + "</p>");
				out.println("<p>G�nero: " + genero + "</p>");
				out.println("Voc� est� ok com as obriga��es militares");
			} else {
				out.println("<p>Como vai querida !");
				out.println("<p>Nome: " + nome + "</p>");
				out.println("<p>Matricula: " + matricula + "</p>");
				out.println("<p>G�nero: " + genero + "</p>");
				out.println("<p>Idade: " + idade + " anos</p>");
				out.println("Voc� n�o precisa servi ao ex�rcito");
			}

		}

		out.println("<BR></BODY></HTML>");

		// Fechando o objeto
		out.close();

	}

}
