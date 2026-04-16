package PesquisaEmList.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntevaloAnos = new ArrayList<>();

        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntevaloAnos.add(l);
                }
            }
        }
        return livrosPorIntevaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public void listarLivros(){
        System.out.println(livrosList);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 05", "Autor 01", 2000);
        catalogoLivros.adicionarLivro("Livro 02", "Autor 02", 2020);
        catalogoLivros.adicionarLivro("Livro 01", "Autor 01", 2010);
        catalogoLivros.adicionarLivro("Livro 04", "Autor 04", 1990);
        catalogoLivros.adicionarLivro("Livro 05", "Autor 01", 2002);
        catalogoLivros.adicionarLivro("Livro 06", "Autor 06", 1980);

        catalogoLivros.listarLivros();

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 01"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000,2010));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 05"));
    }
}
