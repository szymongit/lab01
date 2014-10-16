package pl.altkom;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>HelloWorld Servlet</title>");
        out.println("</head>");

        out.println("<body bgcolor=\"lightblue\"><center>");
        out.println("<table align='center'><tr><td>");

        String name = request.getParameter("name");
        if (name == null) {
            name = "";
        }

        // out.println("<h1>Witaj "+name+"!</h1>");
        out.println("<h1>Menu</h1>");

        // dodanie linku do formularza ulubionej marki
        String cp = request.getContextPath();
        String path = cp + "/makeForm.html";

        out.println("<a href=\"" + path + "\">Informacje producenta</a>");
        out.println("</td></tr><table>");

        out.println("</center></body>");
        out.println("</html>");
    }
}
