package hospital;

public class Paciente {
	private  String nomeCompleto;
	private  String rg;
	private  String cpf;
	private  String telefone;
	private Endereco endereco;
	
	//(construtor abaixo)
	public Paciente(String nome,String rg,String cpf,Endereco endereco, String telefone) {
		this.nomeCompleto = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public Paciente(String nome,String rg, String cpf) {
		this.nomeCompleto = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getRg() {
		return rg;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
	