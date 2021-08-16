package orientacaoAobjeto;

import cursosjava.classes.Aluno;

public class PrimeiroObjeto {

	public static void main(String[] args) {
		
		// TESTE
		
		Aluno aluno01 = new Aluno("João",50);
		Aluno aluno02 = new Aluno("Fabricio",10);
		
		// System.out.println(aluno01.getNome());
		
		aluno01.setDataNascimento("03/01/1994");
		aluno01.setRegistroGeral("000.3535.97");
		aluno01.setNumeroCpf("150.951.017.40");
		 aluno01.setNomeMae("Daniela");
		aluno01.setNomePai("Joaquin");
		aluno01.setSerieMatriculado("777.8888.999");
		
		aluno01.setNotaAluno01(60);
		aluno01.setNotaAluno02(50);
		aluno01.setNotaAluno03(80);
		aluno01.setNotaAluno04(40);
		
		System.out.println("A media do Aluno 01 e de " + aluno01.getMediaNota());
		
		

		
		

	}
	

}
