package hospital;

public class Medico {
	public String crm; 
	public String nomeCompleto;
	public Endereco endereco; 
	public String telefone; 
	
	public Medico(String crm, String nome, Endereco endereco) {
		this.crm = crm;
		this.nomeCompleto = nome;
		this.endereco = endereco;
	}

	public String getCrm() {
		return crm;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
