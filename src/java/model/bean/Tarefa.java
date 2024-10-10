/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Date;



/**
 *
 * @author Senai
 */
public class Tarefa {
    private int id_tarefa;
    private String nome_tarefa;
    private String descricao;
    private Date data_entrega;
    private String nome_turma;

    public Tarefa() {
    }

    public Tarefa(int id_tarefa, String nome_tarefa, String descricao, Date data_entrega, String nome_turma) {
        this.id_tarefa = id_tarefa;
        this.nome_tarefa = nome_tarefa;
        this.descricao = descricao;
        this.data_entrega = data_entrega;
        this.nome_turma = nome_turma;
    }

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getNome_tarefa() {
        return nome_tarefa;
    }

    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }
    
     
  
    
    
}
