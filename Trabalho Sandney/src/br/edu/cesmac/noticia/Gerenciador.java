package br.edu.cesmac.noticia;

import java.io.IOException;

import br.edu.cesmac.enumMenu.EnumMenu.OpcoesMenu;
import br.edu.cesmac.enumMenu.EnumMenu.OpcoesSubMenu;
import br.edu.cesmac.enumMenu.EnumMenu.TestaEncontrado;
import br.edu.cesmac.manipulador.ManipuladorEditoria;
import br.edu.cesmac.manipulador.ManipuladorJornalista;
import br.edu.cesmac.manipulador.ManipuladorNoticia;
import br.edu.cesmac.model.Editoria;
import br.edu.cesmac.model.Jornalista;
import br.edu.cesmac.model.Noticia;
import br.edu.cesmac.view.EditoriaView;
import br.edu.cesmac.view.GerenciadorView;
import br.edu.cesmac.view.JornalistaView;
import br.edu.cesmac.view.NoticiaView;

public class Gerenciador {

	public static void main(String[] args) throws IOException {
		GerenciadorView gerenciadorView = new GerenciadorView();
		EditoriaView editoriaView = new EditoriaView();
		JornalistaView jornalistaView = new JornalistaView();
		NoticiaView noticiaView = new NoticiaView();

		ManipuladorEditoria manipuladorEditoria = new ManipuladorEditoria();
		ManipuladorJornalista manipuladorJornalista = new ManipuladorJornalista();
		ManipuladorNoticia manipuladorNoticia = new ManipuladorNoticia();

		int opcaoMenuPrincipal = 0;
		int opcaoSubmenu = 0;

		while (opcaoMenuPrincipal != OpcoesMenu.SAIR.getValor()) {
			opcaoMenuPrincipal = gerenciadorView.montarMenuPrincipal();

			if (opcaoMenuPrincipal == OpcoesMenu.EDITORIAS.getValor()) {

				while (opcaoSubmenu != OpcoesSubMenu.SAIR.getValor())  {
					opcaoSubmenu = gerenciadorView.montarMenuEditoria();

					if (opcaoSubmenu == OpcoesSubMenu.ADICIONAR.getValor()) {
						manipuladorEditoria.cadastrar(editoriaView.ler());
					} else if (opcaoSubmenu == OpcoesSubMenu.ALTERAR.getValor()) {
						manipuladorEditoria.alterar(editoriaView.ler());
					}else if (opcaoSubmenu == OpcoesSubMenu.EXCLUIR.getValor()) {
						manipuladorEditoria.listar();
						Editoria e = manipuladorEditoria.getById(editoriaView.lerId());
						
						if (e == null) {
							System.out.println(TestaEncontrado.EDITORIA.getValor());
						} else {
							manipuladorEditoria.excluir(editoriaView.ler());
						}
	
					} else if (opcaoSubmenu == OpcoesSubMenu.LISTAR.getValor()) {
						manipuladorEditoria.listar();
					}
				}
			}
				
				if (opcaoMenuPrincipal == OpcoesMenu.JORNALISTAS.getValor()) {

					while (opcaoSubmenu != OpcoesSubMenu.SAIR.getValor()) {
						opcaoSubmenu = gerenciadorView.montarMenuJornalista();

						if (opcaoSubmenu == OpcoesSubMenu.ADICIONAR.getValor()) {
							manipuladorJornalista.cadastrar(jornalistaView.ler());
						} else if (opcaoSubmenu == OpcoesSubMenu.ALTERAR.getValor()) {
							manipuladorJornalista.alterar(jornalistaView.ler());
						}else if (opcaoSubmenu == OpcoesSubMenu.EXCLUIR.getValor()) {
							manipuladorJornalista.listar();
							Jornalista j = manipuladorJornalista.getById(jornalistaView.lerId());
							
							if (j == null) {
								System.out.println(TestaEncontrado.JORNALISTA.getValor());
							} else {
								manipuladorJornalista.excluir(jornalistaView.ler());
							}
		
						} else if (opcaoSubmenu == OpcoesSubMenu.LISTAR.getValor()) {
							manipuladorJornalista.listar();
						}
					}
				}
				
				if (opcaoMenuPrincipal == OpcoesMenu.NOTICIAS.getValor()) {

					while (opcaoSubmenu != OpcoesSubMenu.SAIR.getValor()) {
						opcaoSubmenu = gerenciadorView.montarMenuNoticia();

						if (opcaoSubmenu == OpcoesSubMenu.ADICIONAR.getValor()) {
							manipuladorNoticia.cadastrar(noticiaView.ler());
						} else if (opcaoSubmenu == OpcoesSubMenu.ALTERAR.getValor()) {
							manipuladorNoticia.alterar(noticiaView.ler());
						}else if (opcaoSubmenu == OpcoesSubMenu.EXCLUIR.getValor()) {
							manipuladorNoticia.listar();
							Noticia n = manipuladorNoticia.getById(noticiaView.lerId());
							
							if (n == null) {
								System.out.println(TestaEncontrado.NOTICIA.getValor());
							} else {
								manipuladorNoticia.excluir(noticiaView.ler());
							}
		
						} else if (opcaoSubmenu == OpcoesSubMenu.LISTAR.getValor()) {
							manipuladorNoticia.listar();
						}
					}
				}

		System.out.println("Fim");
	}

}
}

