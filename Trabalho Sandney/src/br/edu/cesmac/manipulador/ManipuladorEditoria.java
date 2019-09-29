package br.edu.cesmac.manipulador;

import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.enumMenu.EnumMenu.Manipuladores;
import br.edu.cesmac.model.Editoria;

public class ManipuladorEditoria {
	ArrayList<Editoria> editorias = new ArrayList<Editoria>();

	public void cadastrar(Editoria editoria) {
		this.editorias.add(editoria);
	}

	public void alterar(Editoria editoria) {
		for (Editoria e : editorias) {
			if (e.getIdEditoria() == editoria.getIdEditoria()) {
				this.editorias.set(this.editorias.indexOf(e), editoria);
			}
		}

	}

	public void excluir(Editoria editoria) {
		this.editorias.remove(editoria);

	}

	public void listar() {
		System.out.println(Manipuladores.EDITORIA.getValor());

		for(Editoria editoria : editorias) {
			System.out.println("Código " + editoria.getIdEditoria() + " - " + editoria.getNome());
		}
		
		System.out.println(Manipuladores.RODAPE.getValor());
	}
	
	public Editoria getById(int idEditoria) {
		Editoria editoria = null;
	
		for (Editoria e : editorias) {
			if (e.getIdEditoria() == idEditoria) {
				editoria = e;
				break;
			}
		}
		
		return editoria;
	}

	public List<Editoria> getEditorias() {
		return this.getEditorias();
	}

}
