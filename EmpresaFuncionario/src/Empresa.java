//int[] notas = new int[4];
public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios; /*Isso significa que a minha classe Empresa possui um 
	atributo chamado funcionarios que é um array (vetor) de objetos da classe Funcionario */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionario(Funcionario funcionario, int indice) {
		this.funcionarios[indice] = funcionario;
	}
	
	public void addFuncionario(Funcionario novoFuncionario) {
	    // Cria um novo array com tamanho igual ao array atual + 1
	    Funcionario[] novoArray = new Funcionario[funcionarios.length + 1];
	    // Copia os funcionários do array atual para o novo array
	    for (int i = 0; i < funcionarios.length; i++) {
	        novoArray[i] = funcionarios[i];
	    }
	    // Adiciona o novo funcionário no último índice do novo array
	    novoArray[funcionarios.length] = novoFuncionario;
	    // Atualiza a referência do array atual para o novo array com o novo funcionário adicionado
	    funcionarios = novoArray;
	}

}


