/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Notas {
    private int id_notas;
    private Float nota;

    public Notas() {
    }

    public Notas(int id_notas, Float nota) {
        this.id_notas = id_notas;
        this.nota = nota;
    }

    public int getId_notas() {
        return id_notas;
    }

    public void setId_notas(int id_notas) {
        this.id_notas = id_notas;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }
    
    
}
