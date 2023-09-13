package com.example.spring_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//esta aplicacion es para ver como se usa el deploy,
// la primera v ersion se usa package en maven luego en las sig versiones primero
//clean y luego package
@RestController
public class HolaControlador {

    //@Value("${app.varexample}")  //para ver variable de entorno
    @Value("${app.message}")    //mensaje
    String  message;
    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println(message);
        return "Hola Mundo como va todo, aca va todo bien, chau!!";
    }

    @GetMapping("/boostrap")
    public String boostrap(){
        return """
                <!doctype html>
                        <html lang="en">
                          <head>
                            <meta charset="utf-8">
                            <meta name="viewport" content="width=device-width, initial-scale=1">
                            <title>Bootstrap demo</title>
                            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
                          </head>
                          <body>
                            <h1>Hola mundo desde SpringBoot!</h1>
                            <a class="btn btn-primary" href="https://www.google.com">Google </a>
                            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
                          </body>
                        </html>
                """;
    }
}
