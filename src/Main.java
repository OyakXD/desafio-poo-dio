package src;

import src.br.com.dio.desafio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setDescricao("Bootcamp para formação de desenvolvedores Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Lucas");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();

        System.out.println("Conteudos Inscrito" + dev.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        // ...



    }
}
