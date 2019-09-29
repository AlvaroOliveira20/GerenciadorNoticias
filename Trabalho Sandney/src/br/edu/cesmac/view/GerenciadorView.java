package br.edu.cesmac.view;

import java.io.IOException;
import java.util.Scanner;

import br.edu.cesmac.enumMenu.EnumMenu.StringsMenu;
import br.edu.cesmac.enumMenu.EnumMenu.StringsSubMenu;

public class GerenciadorView {
	Scanner opcao = new Scanner(System.in);

	public int montarMenuPrincipal() throws IOException {
		System.out.println(StringsMenu.TITULO.getValor());
		System.out.println(StringsMenu.OPC.getValor());
		System.out.println(StringsMenu.EDITORIAS.getValor());
		System.out.println(StringsMenu.JORNALISTAS.getValor());
		System.out.println(StringsMenu.NOTICIAS.getValor());
		System.out.println(StringsMenu.SAIR.getValor());
		System.out.println(StringsMenu.INFORME.getValor());

		return opcao.nextInt();
	}

	public int montarMenuEditoria() throws IOException {
		System.out.println(StringsSubMenu.TITULOEDITORIAS.getValor());
		System.out.println(StringsSubMenu.OPC.getValor());
		System.out.println(StringsSubMenu.ADICIONAR.getValor());
		System.out.println(StringsSubMenu.ALTERAR.getValor());
		System.out.println(StringsSubMenu.EXCLUIR.getValor());
		System.out.println(StringsSubMenu.LISTAR.getValor());
		System.out.println(StringsSubMenu.SAIR.getValor());
		System.out.println(StringsSubMenu.INFORME.getValor());

		return opcao.nextInt();
	}
	
	public int montarMenuJornalista() throws IOException {
		System.out.println(StringsSubMenu.TITULOJORNALISTAS.getValor());
		System.out.println(StringsSubMenu.OPC.getValor());
		System.out.println(StringsSubMenu.ADICIONAR.getValor());
		System.out.println(StringsSubMenu.ALTERAR.getValor());
		System.out.println(StringsSubMenu.EXCLUIR.getValor());
		System.out.println(StringsSubMenu.LISTAR.getValor());
		System.out.println(StringsSubMenu.SAIR.getValor());
		System.out.println(StringsSubMenu.INFORME.getValor());

		return opcao.nextInt();
	}
	
	public int montarMenuNoticia() throws IOException {
		System.out.println(StringsSubMenu.TITULOEDITORIAS.getValor());
		System.out.println(StringsSubMenu.OPC.getValor());
		System.out.println(StringsSubMenu.ADICIONAR.getValor());
		System.out.println(StringsSubMenu.ALTERAR.getValor());
		System.out.println(StringsSubMenu.EXCLUIR.getValor());
		System.out.println(StringsSubMenu.LISTAR.getValor());
		System.out.println(StringsSubMenu.SAIR.getValor());
		System.out.println(StringsSubMenu.INFORME.getValor());

		return opcao.nextInt();
	}

}
