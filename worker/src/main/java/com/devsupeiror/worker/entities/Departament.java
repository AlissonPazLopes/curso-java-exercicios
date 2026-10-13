package com.devsupeiror.worker.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_departament") // cria a tabela com o nome do departamento
public class Departament {

    @Id // o id da tabela de departamento// chave primaria da tabela automatica entao vai de 1 a .... n
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public Departament(){

    }

    public Departament(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
