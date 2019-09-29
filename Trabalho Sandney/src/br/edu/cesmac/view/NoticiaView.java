package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.cesmac.enumMenu.EnumMenu.Dados;
import br.edu.cesmac.model.Noticia;

public class NoticiaView {
	
	BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

	public Noticia ler() throws NumberFormatException, IOException {
		Noticia noticia = new Noticia();
		
		System.out.println(Dados.NOTICIA.getValor());
		System.out.println(Dados.CODIGO.getValor());
		noticia.setIdNoticia(Integer.parseInt(buffReader.readLine()));
		System.out.println(Dados.TITULO.getValor());
		noticia.setTituloNoticia(buffReader.readLine());		
		
		return noticia;
	}
	
	public int lerId() throws NumberFormatException, IOException {
		int id;
		System.out.println(Dados.INFORMENOTICIA.getValor());
		return Integer.parseInt(buffReader.readLine());
	}
	
}
