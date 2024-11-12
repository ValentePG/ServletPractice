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

//        InputStream inputStream = req.getInputStream();
//        FileOutputStream arquivo = new FileOutputStream(caminhodearquivo);
//
//        byte[] bytes1 = new byte[1024];
//
//        while(inputStream.available()>0){
//            inputStream.read(bytes1);
//            arquivo.write(bytes1);
//        }
//        inputStream.close();
//        arquivo.close();

        // InputStream inputStream = req.getInputStream();
        // byte[] bytes = new byte[1024];
        // StringBuilder stringBuilder = new StringBuilder();
        // while(inputStream.available()>0){ inputStream.read(bytes);
        // stringBuilder.append(bytes);
        // }

        // transforma o json em vetor de byte
        byte[] bytes = req.getInputStream().readAllBytes();

        // Tenta transformar os bytes em String
        String msgDecode = new String(bytes);

        // Biblioteca GSON para transforamr a string "JSON" em classe java
        UsuarioTeste usuarioTeste = gson.fromJson(msgDecode, UsuarioTeste.class);

        System.out.println(usuarioTeste.toString());
    }
}
