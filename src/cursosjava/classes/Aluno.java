package cursosjava.classes;

public class Aluno {
	
	private String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	private String nomeMae;
	private String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	private double notaAluno01;
	private double notaAluno02;
	private double notaAluno03;
	private double notaAluno04;
	
	public Aluno(String nomePadrao,int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
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
		return "Nome do responsavel: " +  responsavel;
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

	public double getNotaAluno01() {
		return notaAluno01;
	}

	public void setNotaAluno01(double notaAluno01) {
		this.notaAluno01 = notaAluno01;
	}

	public double getNotaAluno02() {
		return notaAluno02;
	}

	public void setNotaAluno02(double notaAluno02) {
		this.notaAluno02 = notaAluno02;
	}

	public double getNotaAluno03() {
		return notaAluno03;
	}

	public void setNotaAluno03(double notaAluno03) {
		this.notaAluno03 = notaAluno03;
	}

	public double getNotaAluno04() {
		return notaAluno04;
	}

	public void setNotaAluno04(double notaAluno04) {
		this.notaAluno04 = notaAluno04;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}
public double getMediaNota() {
	return (notaAluno01 + notaAluno02 + notaAluno03 + notaAluno04)/4;
}
}

