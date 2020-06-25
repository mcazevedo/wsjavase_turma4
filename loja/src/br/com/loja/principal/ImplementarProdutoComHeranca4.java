package br.com.loja.principal;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;
import br.com.loja.tela.Magica;

public class ImplementarProdutoComHeranca4 {

	public static void main(String[] args) {
		
		char opcao = Magica.s("Digite:\n<1> CD ou\n<2> Livro").charAt(0);
		if (opcao=='1') {
			CD cd = new CD(
					Magica.i("C�digo:"),
					Magica.s("Descricao"),
					Magica.f("Valor Venda: "),
					Magica.f("Valor Compra: "),
					Magica.s("Artista"),
					Magica.s("Gravadora")
					);
			System.out.println(cd.getAll());
		}else if (opcao=='2') {
			Livro livro = new Livro();
			Autor autor = new Autor();
			livro.setCodigo(Magica.i("C�digo"));
			livro.setDescricao(Magica.s("Descri��o"));
			livro.setEditora(Magica.s("Editora"));
			livro.setIsbn(Magica.s("ISBN"));
			livro.setValorCompra(Magica.f("Valor Compra: "));
			livro.setValorVenda(Magica.f("Valor Venda: "));
			livro.setAutor(autor);
			autor.setEmail(Magica.s("Email"));
			autor.setNome(Magica.s("Nome"));
			autor.setNomeAcademico(Magica.s("Nome Academico"));
			System.out.println(livro.getAll());
		}else {
			System.out.println("Op��o inv�lida!!!!");
		}
		
		
	}

}
