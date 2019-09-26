package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.cesmac.model.Editoria;

public class EditoriaView {
	
	BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

	public Editoria ler() throws NumberFormatException, IOException {
		Editoria editoria = new Editoria();
		
		System.out.println("Dados da Editoria");
		System.out.println("Código: ");
		editoria.setIdEditoria(Integer.parseInt(buffReader.readLine()));
		System.out.println("Nome: ");
		editoria.setNome(buffReader.readLine());		
		
		return editoria;
	}
	
	public int lerId() throws NumberFormatException, IOException {
		int id;
		System.out.println("Informe o código da editoria!");
		return Integer.parseInt(buffReader.readLine());
	}
	
}
