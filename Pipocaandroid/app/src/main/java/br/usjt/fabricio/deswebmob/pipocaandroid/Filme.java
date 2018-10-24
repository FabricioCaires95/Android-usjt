package br.usjt.fabricio.deswebmob.pipocaandroid;

import java.util.ArrayList;

/**
 * Fabricio Caires
 * 816155552
 */

public class Filme {

    private int id;
    private String titulo, descricao, anoLancamento, direcao;
    private int popularidade;
    private Genero genero;

    private ArrayList<Filme> list = new ArrayList();

    public Filme(){

    }

    public Filme(int id, String titulo, String descricao, String anoLancamento, String direcao, int popularidade, Genero genero){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;

        this.anoLancamento = anoLancamento;
        this.direcao = direcao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Filme> getList() {
        return list;
    }

    public void setList(ArrayList<Filme> list) {
        this.list = list;
    }



    public ArrayList<Filme> gerarLista(){
        Filme f1 = new Filme(1, "Piratas do Caribe - Fim do Mundo", "filme bom",
                "30/10/2010", "Direção", 50, new Genero(1, "Aventura"));

        Filme f2 = new Filme(2, "Velozes e Furiosos", "filme legal",
                "20/08/2009", "Direção", 50, new Genero(2, "Ação"));



        getList().add(f1);
        getList().add(f2);

        return this.list;
    }

    public ArrayList<String> getListaNomes(String genero){
        ArrayList<String> lista = new ArrayList<String>();
        setList(gerarLista());
        for (Filme filme: list) {
            if(genero.equals("Todos"))
                lista.add(filme.getTitulo());

            if(filme.getGenero().getNome().equals(genero))
                lista.add(filme.getTitulo());
        }

        return lista;
    }

    public Filme buscaFilme(String nomeFilme){
        setList(gerarLista());

        for (Filme filme:list) {
            if(filme.getTitulo().equals(nomeFilme))
                return filme;
        }

        return null;
    }
}
