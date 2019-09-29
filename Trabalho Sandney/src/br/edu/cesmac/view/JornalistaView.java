package br.edu.cesmac.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.cesmac.enumMenu.EnumMenu.Dados;
import br.edu.cesmac.model.Jornalista;

public class JornalistaView {
	
	BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

	public Jornalista ler() throws NumberFormatException, IOException {
		Jornalista jornalista = new Jornalista();
		
		System.out.println(Dados.JORNALISTA.getValor());
		System.out.println(Dados.CODIGO.getValor());
		jornalista.setIdJornalista(Integer.parseInt(buffReader.readLine()));
		System.out.println(Dados.NOME.getValor());
		jornalista.setNomeJornalista(buffReader.readLine());		
		
		return jornalista;
	}
	
	public int lerId() throws NumberFormatException, IOException {
		int id;
		System.out.println(Dados.INFORMEJORNALISTA.getValor());
		return Integer.parseInt(buffReader.readLine());
	}
	
}
