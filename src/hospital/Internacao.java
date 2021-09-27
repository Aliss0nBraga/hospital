package hospital;

import java.time.localDate;

public class Internacao {
	private Medico medicoResponsavel;
	private Paciente paciente;
	private LocalDate dataInternacao;
	private LocalDate dataAlta;
	private String observacoes;

	// Getters
	public Medico getMedico() {
		return this.medicoResponsavel;
	}
	public Paciente getPaciente() {
		return this.paciente;
	}
	public LocalDate getData() {
		return this.dataInternacao;
	}
	public LocalDate getData() {
		return this.dataAlta;
	}
	public String getObservacoes() {
		return this.observacoes;
	}
	// Setters 
	public void setMedico(Medico medico) {
		this.medicoResponsavel = medico;
	}
	public void setDataAlta(LocalDate data) {
		this.dataAlta = data;
	}
	public void setString(String obervacoes) {
		this.observacoes = observacoes;
	}
}
