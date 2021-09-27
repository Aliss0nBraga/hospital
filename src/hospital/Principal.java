package hospital;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
	
		Endereco end1 = new Endereco("tv. Não te intessa", "12-A", "Porto Alegre", "Centro", "RS","000");
		end1.setRua ("Tv. Não te interessa");
		end1.setCidade ("Caxias do Sul");
		end1.setBairro ("centro");
		end1.setCEP ("000"); 
		
		//Medico med1 = new Medico("000-rs","Alisson Braga",end1);
		//med1.endereco = end1; - feito no construtor.
				
		//System.out.println("O Médico mora na rua" +med1.getEndereco().getRua());

		// Pegando a da atual 
		//LocalDate hoje = LocalDate.now();
		// definido a partir de uma data específica 
		//LocalDate especifica = LocalDate.of(2004, 2, 2);
		
		//System.out.print("Dia atual:" +hoje.getDayOfMonth());
		//System.out.println( "Dia em que eu nasci: "+especifica.getDayOfMonth());
		
		//int idade = hoje.getYear() - especifica.getYear();
		//System.out.println("Você tem "+idade+"anos");
		
		//Paciente alisson = new Paciente("Alisson Braga","222");
		//Paciente joaosinho = new Paciente("joaosinho","222","333","12345678",end1);
	}
		
		}
