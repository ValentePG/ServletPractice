package dev.valente.servelet;

import com.google.gson.Gson;
import dev.valente.model.UsuarioTeste;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter printWriter = resp.getWriter();

        resp.setContentType("text/json");
        UsuarioTeste user1 = new UsuarioTeste();

        user1.setName("GABRIEL");
        user1.setRole("ADMIN");
        user1.setProfission("DEV");

        Gson gson = new Gson();

        String response = gson.toJson(user1);

        UsuarioTeste user2 = gson.fromJson(response, UsuarioTeste.class);

        printWriter.println(response);

        printWriter.println(user2.toString());
    }

}