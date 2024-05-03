package src;

import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Java Básico");
        curso.setDescricao("Aprenda os conceitos básicos de Java");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Como se tornar um programador");
        mentoria.setDescricao("Imersão em programação");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}
