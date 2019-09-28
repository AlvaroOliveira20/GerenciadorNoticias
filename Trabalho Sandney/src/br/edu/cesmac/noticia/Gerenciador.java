package br.edu.cesmac.noticia;

import java.io.IOException;

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

		while (opcaoMenuPrincipal != 4) {
			opcaoMenuPrincipal = gerenciadorView.montarMenuPrincipal();

			if (opcaoMenuPrincipal == 1) {

				while (opcaoSubmenu != 5) {
					opcaoSubmenu = gerenciadorView.montarMenuEditoria();

					if (opcaoSubmenu == 1) {
						manipuladorEditoria.cadastrar(editoriaView.ler());
					} else if (opcaoSubmenu == 2) {
						manipuladorEditoria.alterar(editoriaView.ler());
					}else if (opcaoSubmenu == 3) {
						manipuladorEditoria.listar();
						Editoria e = manipuladorEditoria.getById(editoriaView.lerId());
						
						if (e == null) {
							System.out.println("Editoria não encontrada!");
						} else {
							manipuladorEditoria.excluir(editoriaView.ler());
						}
	
					} else if (opcaoSubmenu == 4) {
						manipuladorEditoria.listar();
					}
				}
			}
				
				if (opcaoMenuPrincipal == 2) {

					while (opcaoSubmenu != 5) {
						opcaoSubmenu = gerenciadorView.montarMenuJornalista();

						if (opcaoSubmenu == 1) {
							manipuladorJornalista.cadastrar(jornalistaView.ler());
						} else if (opcaoSubmenu == 2) {
							manipuladorJornalista.alterar(jornalistaView.ler());
						}else if (opcaoSubmenu == 3) {
							manipuladorJornalista.listar();
							Jornalista j = manipuladorJornalista.getById(jornalistaView.lerId());
							
							if (j == null) {
								System.out.println("Jornalista não encontrado!");
							} else {
								manipuladorJornalista.excluir(jornalistaView.ler());
							}
		
						} else if (opcaoSubmenu == 4) {
							manipuladorJornalista.listar();
						}
					}
				}
				
				if (opcaoMenuPrincipal == 3) {

					while (opcaoSubmenu != 5) {
						opcaoSubmenu = gerenciadorView.montarMenuNoticia();

						if (opcaoSubmenu == 1) {
							manipuladorNoticia.cadastrar(noticiaView.ler());
						} else if (opcaoSubmenu == 2) {
							manipuladorNoticia.alterar(noticiaView.ler());
						}else if (opcaoSubmenu == 3) {
							manipuladorNoticia.listar();
							Noticia n = manipuladorNoticia.getById(noticiaView.lerId());
							
							if (n == null) {
								System.out.println("Noticia não encontrada!");
							} else {
								manipuladorNoticia.excluir(noticiaView.ler());
							}
		
						} else if (opcaoSubmenu == 4) {
							manipuladorNoticia.listar();
						}
					}
				}

		System.out.println("Fim");
	}

}
}

