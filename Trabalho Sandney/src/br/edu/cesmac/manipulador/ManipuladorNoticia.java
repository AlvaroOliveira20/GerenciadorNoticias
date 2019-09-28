package br.edu.cesmac.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.model.Noticia;

public class ManipuladorNoticia {
	ArrayList<Noticia> noticias = new ArrayList<Noticia>();

	public void cadastrar(Noticia noticia) {
		this.noticias.add(noticia);
	}

	public void alterar(Noticia noticia) {
		for (Noticia n : noticias) {
			if (n.getIdNoticia() == noticia.getIdNoticia()) {
				this.noticias.set(this.noticias.indexOf(n), noticia);
			}
		}

	}

	public void excluir(Noticia noticia) {
		this.noticias.remove(noticia);

	}

	public void listar() {
		System.out.println("=============== Jornalistas Cadastrados ===============");

		for(Noticia noticia : noticias) {
			System.out.println("Código " + noticia.getIdNoticia() + " - " + noticia.getTituloNoticia());
		}
		
		System.out.println("=================================================== \n\n");
	}
	
	public Noticia getById(int idNoticia) {
		Noticia noticia = null;
	
		for (Noticia n : noticias) {
			if (n.getIdNoticia() == idNoticia) {
				noticia = n;
				break;
			}
		}
		
		return noticia;
	}

	public List<Noticia> getNoticias() {
		return this.getNoticias();
	}

}
