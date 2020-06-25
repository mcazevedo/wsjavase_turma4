package br.com.loja.principal;

import javax.swing.JOptionPane;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;

public class ImplementarProdutoComHeranca3 {
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static void main(String[] args) {
		
		char opcao = s("Digite:\n<1> CD ou\n<2> Livro").charAt(0);
		if (opcao=='1') {
			CD cd = new CD(
					i("C�digo:"),
					s("Descricao"),
					f("Valor Venda: "),
					f("Valor Compra: "),
					s("Artista"),
					s("Gravadora")
					);
			System.out.println(cd.getAll());
		}else if (opcao=='2') {
			Livro livro = new Livro();
			Autor autor = new Autor();
			livro.setCodigo(i("C�digo"));
			livro.setDescricao(s("Descri��o"));
			livro.setEditora(s("Editora"));
			livro.setIsbn(s("ISBN"));
			livro.setValorCompra(f("Valor Compra: "));
			livro.setValorVenda(f("Valor Venda: "));
			livro.setAutor(autor);
			autor.setEmail(s("Email"));
			autor.setNome(s("Nome"));
			autor.setNomeAcademico(s("Nome Academico"));
			System.out.println(livro.getAll());
		}else {
			System.out.println("Op��o inv�lida!!!!");
		}
		
		
	}

}
