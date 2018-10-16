package br.usjt.fabricio.deswebmob.pipocaandroid;

import java.util.ArrayList;
import java.util.Arrays;

public class Genero {

    private int id;
    private String nome;
    private ArrayList<Genero> generos;

    public Genero(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    public ArrayList<Genero> geraGeneros(){
        Genero genero1 = new Genero(1 , "Ação");
        Genero genero2 = new Genero(2, "Aventura");

        this.generos.add(genero1);
        this.generos.add(genero2);

        return generos;
    }
}
