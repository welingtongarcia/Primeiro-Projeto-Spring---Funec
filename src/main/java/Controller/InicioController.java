/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author codinhoto
 */
@RestController
public class InicioController {
    @GetMapping("/")
    public String inicio(){
        return "Inicio do projeto";
    }
    
    @GetMapping("/aluno")
    public String aluno(){
        return "Aluno: Joao da Silva";
    }
    
    @GetMapping("/curso")
    public String curso(){
        return "Curso: Sistemas de informação";
    }
    
    @GetMapping("/disciplina")
    public String disciplina(){
        return "Disciplina: Programação Java";
    }
    
     @GetMapping("/saudacao")
    public String saudacao(){
        return "Olá";
    }
    
     @GetMapping("/tecnologia")
    public String tecnologia(){
        return "tecnologia: Spring";
    }
}
