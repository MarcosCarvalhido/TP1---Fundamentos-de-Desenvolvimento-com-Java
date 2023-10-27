import java.util.Scanner;
/*
1) Faça um programa que solicite o nome e nota de 6 alunos. Em seguida, calcule a média da turma e parabenize apenas aqueles que ficaram acima da média da turma.
*/
class Main {
  static Scanner userInput = new Scanner(System.in);
  public static void main(String[] args) {
      Turma turma = new Turma();
      turma.cadastrarAlunos();
      turma.CalcularMedia();


  }
}