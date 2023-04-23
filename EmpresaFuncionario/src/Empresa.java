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
	
	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionarios = funcionario;
	}
}


