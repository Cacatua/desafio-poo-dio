package com.kktua;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /*
         * Criando cursos
         */
        Curso curso = new Curso();
        curso.setTitulo("curso js");
        curso.setDescricao("descricao curso js");
        curso.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Java");
        curso2.setDescricao("descricao curso Java");
        curso2.setCargaHoraria(6);

        /*
         * Criando mentoria
         */
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        /*
         * Criando bootcampo
         */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        /*
         * Criando Dev
         */
        Dev dev = new Dev();
        dev.setNome("KKtua");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println("Conteudos inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Eduardo");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos inscritos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());

    }
}
