package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.cesmac.model.Noticia;

public class NoticiaView {
	
	BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

	public Noticia ler() throws NumberFormatException, IOException {
		Noticia noticia = new Noticia();
		
		System.out.println("Dados da Noticia");
		System.out.println("Código: ");
		noticia.setIdNoticia(Integer.parseInt(buffReader.readLine()));
		System.out.println("Titulo: ");
		noticia.setTituloNoticia(buffReader.readLine());		
		
		return noticia;
	}
	
	public int lerId() throws NumberFormatException, IOException {
		int id;
		System.out.println("Informe o código da noticia!");
		return Integer.parseInt(buffReader.readLine());
	}
	
}
