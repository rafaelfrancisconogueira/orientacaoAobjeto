package orientacaoAobjeto;

import javax.swing.JOptionPane;

import cursosjava.classes.Aluno;
import cursosjava.classes.Disciplina;

public class PrimeiroObjeto {

	private static String disciplinaRemover;

	public static void main(String[] args) {
		
		// TESTE
		String nome = JOptionPane.showInputDialog("Qual e o nome do Aluno ");
		String idade = JOptionPane.showInputDialog("Qual e a idade");
		String dataNascimento = JOptionPane.showInputDialog("Qual e a data de nascimento");
		String rg = JOptionPane.showInputDialog("Qual e o RG :");
		String numeroCpf = JOptionPane.showInputDialog("Qual e o CPF");
		String nomeMae = JOptionPane.showInputDialog("Qual e o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual e o nome do pai");
		String serieMatriculado = JOptionPane.showInputDialog("Qual e o numero da matricula");
		
		
		
		Aluno aluno01 = new Aluno();
		Aluno aluno02 = new Aluno();
		
		
		
		// System.out.println(aluno01.getNome());
		aluno01.setNome(nome);
		aluno01.setIdade(Integer.valueOf(idade));
		aluno01.setDataNascimento(dataNascimento);
		aluno01.setRegistroGeral(rg);
		aluno01.setNumeroCpf(numeroCpf);
		aluno01.setNomeMae(nomeMae);
		aluno01.setNomePai(nomePai);
		aluno01.setSerieMatriculado(serieMatriculado);
		
		
		
	   for(int pos = 1; pos <= 4; pos++) {
		   
		   String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
		   String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");
		   
		   Disciplina disciplina = new  Disciplina();
		   disciplina.setDisciplina1(nomeDisciplina);
		   disciplina.setNota1(Double.valueOf(notaDisciplina));
		  
		   aluno01.getDisciplina().add(disciplina);
	   }
	   
	   int escolha = JOptionPane.showConfirmDialog(null, " Dseseja remover alguma disciplina?");
	   
	   if (escolha == 0) {
		   
		   int continuaRemover = 0;
		   int posicao = 1;
		   
		   while (continuaRemover ==0) {
			   
		   String disciplinaRemover = JOptionPane.showInputDialog(" Qual materia deseja excluir 1 2 3 ou 4 ?");
		   aluno01.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
		   posicao ++;
		   continuaRemover = JOptionPane.showInternalConfirmDialog(null, continuaRemover);
		   }
		   
		   
				   
		   
	   }
		
		System.out.println(aluno01.toString());
		System.out.println("mediado aluno " + aluno01.getMediaNota());
		System.out.println("Resultado " + aluno01.getAlunoAprovado());
		
		
		
	}
		
	}

		
		

	
	


