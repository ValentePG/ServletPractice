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

        // Podemos fazer desta forma também, provavelmente é melhor! ******

        //      InputStream inputStream = req.getInputStream();
        //
        //        byte[] bytes = new byte[1024];
        //        StringBuilder stringBuilder = new StringBuilder();
        //        int bytesRead;
        //
        //        while((bytesRead = inputStream.read(bytes)) != -1){
        //
        //            stringBuilder.append(new String(bytes, 0, bytesRead));
        //        }
        //        inputStream.close();

        // String msgDecode = stringBuilder.toString();

        // transforma o json em vetor de byte
        byte[] bytes = req.getInputStream().readAllBytes();


        // Tenta transformar os bytes em String
        String msgDecode = new String(bytes);

        // Biblioteca GSON para transforamr a string "JSON" em classe java
        UsuarioTeste usuarioTeste = gson.fromJson(msgDecode, UsuarioTeste.class);

        System.out.println(usuarioTeste.toString());
    }
}
