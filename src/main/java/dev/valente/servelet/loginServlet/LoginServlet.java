package dev.valente.servelet.loginServlet;

import com.google.gson.Gson;
import dev.valente.model.UsuarioTeste;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Gson gson = new Gson();


        // transforma o json em vetor de byte, não encontrei solução melhor, talvez seja uma instrução pesada
        byte[] bytes = req.getInputStream().readAllBytes();

        // Tenta transformar os bytes em String, não encontrei solução melhor, talvez seja uma instrução pesada
        String msgDecode = new String(bytes);

        // Biblioteca GSON para transforamr a string "JSON" em classe java
        UsuarioTeste usuarioTeste = gson.fromJson(msgDecode, UsuarioTeste.class);

        System.out.println(usuarioTeste.toString());
    }
}
