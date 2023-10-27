import java.awt.List;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Turma {
  static Scanner userInput = new Scanner(System.in);
  private boolean adcionar = true;
  
  ArrayList<Alunos> turma = new ArrayList<Alunos>();
  public void cadastrarAlunos() {
    
    do{
      String nome = ColetarNome();
      double nota = ColetarNota();
      String resposta = ColetarResposta();
    
      // userInput = new Scanner(System.in);
      Alunos aluno = new Alunos(nome,nota);
      turma.add(aluno);
      
      adcionar = verificarResposta(resposta);
      }
      while(adcionar);
    }

  public void ExibirAlunos(){
    for (Alunos aluno : turma) {
      System.out.println(aluno.getNome());
    }
  }
  public void ExibirNotas(){
    for (Alunos aluno : turma) {
      System.out.println(aluno.getNota());
    }
  }

  public void CalcularMedia(){
    double soma = 0;
    double media = 0 ;
    int quantidade = turma.size();

    for (Alunos aluno : turma) {
      soma += aluno.getNota();
    }
    media = Math.round(soma / quantidade);
    
    System.out.println( MessageFormat.format("A media das notas entre os {0} alunos da turma é: {1}"
    ,quantidade, media));
    
    parabenizar(media);
  }
  protected void parabenizar(double media){
     for (Alunos aluno : turma) {
       if(aluno.getNota() > media){
        System.out.println( MessageFormat.format("Parabens {0}! Você tirou uma nota acima da media!"
        ,aluno.getNome()));
       }
    }
  }

  protected boolean verificarResposta(String resposta){
    if(resposta.toLowerCase().equals("n")){
      return false;
    }
    else{
      return true;
    }
  }
  protected String ColetarNome(){
    userInput = new Scanner(System.in);
    System.out.println("Digite o nome do/a aluno/a: ");
    return userInput.nextLine();
  }
  protected double ColetarNota(){
    userInput = new Scanner(System.in);
    System.out.println("Digite a nota do/a aluno/a: ");
    return userInput.nextDouble();
  }
  protected String ColetarResposta(){
    userInput = new Scanner(System.in);
    System.out.println("Adcionar outro aluno?");
    System.out.println(" 'Y' ou 'N' ");
    return userInput.nextLine();
  }
}