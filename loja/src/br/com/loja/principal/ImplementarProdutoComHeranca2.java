package br.com.loja.principal;

import javax.swing.JOptionPane;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;

public class ImplementarProdutoComHeranca2 {

	public static void main(String[] args) {

		char opcao = JOptionPane.showInputDialog
				("Digite:\n<1> CD ou\n<2> Livro").charAt(0);
		if (opcao=='1') {
			CD cd = new CD(
					Integer.parseInt(JOptionPane.showInputDialog("C�digo:")),
					JOptionPane.showInputDialog("Descricao"),
					Float.parseFloat(JOptionPane.showInputDialog("Valor Venda: ")),
					Float.parseFloat(JOptionPane.showInputDialog("Valor Compra: ")),
					JOptionPane.showInputDialog("Artista"),
					JOptionPane.showInputDialog("Gravadora")
					);
			System.out.println(cd.getAll());
		}else if (opcao=='2') {
			Livro livro = new Livro();
			Autor autor = new Autor();
			livro.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("C�digo")));
			livro.setDescricao(JOptionPane.showInputDialog("Descri��o"));
			livro.setEditora(JOptionPane.showInputDialog("Editora"));
			livro.setIsbn(JOptionPane.showInputDialog("ISBN"));
			livro.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Valor Compra: ")));
			livro.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Valor Venda: ")));
			livro.setAutor(autor);
			autor.setEmail(JOptionPane.showInputDialog("Email"));
			autor.setNome(JOptionPane.showInputDialog("Nome"));
			autor.setNomeAcademico(JOptionPane.showInputDialog("Nome Academico"));
			System.out.println(livro.getAll());
		}else {
			System.out.println("Op��o inv�lida!!!!");
		}
		
		
	}

}
