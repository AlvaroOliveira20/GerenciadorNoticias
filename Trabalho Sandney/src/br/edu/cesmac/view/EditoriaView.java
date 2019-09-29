package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.cesmac.enumMenu.EnumMenu.Dados;
import br.edu.cesmac.model.Editoria;

public class EditoriaView {
	
	BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

	public Editoria ler() throws NumberFormatException, IOException {
		Editoria editoria = new Editoria();
		
		System.out.println(Dados.EDITORIA.getValor());
		System.out.println(Dados.CODIGO.getValor());
		editoria.setIdEditoria(Integer.parseInt(buffReader.readLine()));
		System.out.println(Dados.NOME.getValor());
		editoria.setNome(buffReader.readLine());		
		
		return editoria;
	}
	
	public int lerId() throws NumberFormatException, IOException {
		int id;
		System.out.println(Dados.INFORMEEDITORIA.getValor());
		return Integer.parseInt(buffReader.readLine());
	}
	
}
