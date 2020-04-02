package mastersTools.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(name = "items", urlPatterns = "items")
public class ItemsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("itemsName");
        String description = request.getParameter("itemsDescription");
        int price = Integer.parseInt(request.getParameter("itemsPrice"));
        double weight = Double.parseDouble(request.getParameter("itemsWeight"));
        //подключаемся к базе данных
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //устанавливаем соединение
        //Connection connection = DriverManager.getConnection();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
