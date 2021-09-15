package cursosjava.classes;

import java.util.ArrayList;
import java.util.List;



public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	private String nomeMae;
	private String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
   private List<Disciplina> Disciplina = new ArrayList<Disciplina>();
   
   public List<Disciplina> getDisciplina() {
	return Disciplina;
}
   
   
   public void setDisciplina(List<Disciplina> disciplina) {
	Disciplina = disciplina;
}
   
  
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomeResponsavel() {
		String responsavel = this.nomeMae == null ? nomePai : nomeMae;
		return "Nome do responsavel: " + responsavel;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	
	public String getNomeMae() {
		return nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}
	
	public double getMediaNota() {
		
	
   double somaNotas = 0.0;
   
   for (Disciplina disciplina : this.Disciplina) {
	   
	   somaNotas += disciplina.getNota1();
	   
	   
	   
	   }
return somaNotas / 4;
	
	}
	
	
	/* METODO PARA SABE SE O ALUNO FOI APROVADO */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}

	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", Disciplina=" + Disciplina + "]";
	}

	

}
