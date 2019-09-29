package br.edu.cesmac.enumMenu;

public class EnumMenu {
	public enum OpcoesSubMenu {    
	    ADICIONAR(1), ALTERAR(2), EXCLUIR(3), LISTAR(4), SAIR(5);
	     
	    private final int valor;
	    OpcoesSubMenu(int valorOpcao){
	        valor = valorOpcao;
	    }
	    public int getValor(){
	        return valor;
	    }
	}
	public enum OpcoesMenu {    
	    EDITORIAS(1), JORNALISTAS(2), NOTICIAS(3), SAIR(4);
	     
	    private final int valor;
	    OpcoesMenu(int valorOpcao){
	        valor = valorOpcao;
	    }
	    public int getValor(){
	        return valor;
	    }
	}
	
	public enum StringsMenu {    
	    TITULO("==== MENU PRINCIPAL ===="), OPC("Escolha a sua opção!"), EDITORIAS("1 - Editorias"), JORNALISTAS("2 - Jornalistas"), NOTICIAS("3 - Noticias"), SAIR("4 - Sair"), INFORME ("Informe a sua opção: ");
	     
	    private final String valor;
	    StringsMenu(String valorOpcao){
	        valor = valorOpcao;
	    }
	    public String getValor(){
	        return valor;
	    }
	}
	
	
	
	public enum StringsSubMenu {    
		TITULOEDITORIAS("==== EDITORIAS ===="), TITULOJORNALISTAS("==== JORNALISTAS ===="), TITULONOTICIAS("==== Noticias ===="), OPC("Escolha a sua opção!"), ADICIONAR("1 - Adicionar"), ALTERAR("2 - Alterar"), EXCLUIR("3 - Excluir"), LISTAR ("4 - Listar"), SAIR("5 - Sair"), INFORME("Informe a sua opção: ");
	     
	    private final String valor;
	    StringsSubMenu(String valorOpcao){
	        valor = valorOpcao;
	    }
	    public String getValor(){
	        return valor;
	    }
	}
	
	public enum Manipuladores {    
		RODAPE("=================================================== \n\n"), EDITORIA("=============== Editorias Cadatradas ==============="), JORNALISTAS("=============== Jornalistas Cadastrados ==============="), NOTICIA("=============== Noticias Cadastradas ===============") ;
	     
	    private final String valor;
	    Manipuladores(String valorOpcao){
	        valor = valorOpcao;
	    }
	    public String getValor(){
	        return valor;
	    }
	}
	
	
	
	public enum Dados {    
		EDITORIA("Dados da Editoria"), JORNALISTA("Dados do Jornalista"), NOTICIA("Dados da Noticia"), CODIGO("Código: "), NOME("Nome: "), TITULO("Titulo: "), INFORMENOTICIA("Informe o código da noticia!"), INFORMEJORNALISTA("Informe o código do Jornalista!"), INFORMEEDITORIA("Informe o código da editoria!");
	     
	    private final String valor;
	    Dados(String valorOpcao){
	        valor = valorOpcao;
	    }
	    public String getValor(){
	        return valor;
	    }
	}
	
	
	
	public enum TestaEncontrado {    
		EDITORIA("Editoria não encontrada!"), NOTICIA("Noticia não encontrada!"), JORNALISTA("Jornalista não encontrado!");
	     
	    private final String valor;
		TestaEncontrado(String valorOpcao){
	        valor = valorOpcao;
	    }
	    public String getValor(){
	        return valor;
	    }
	}
}


