public class Alunos {
  private String nome;
  private double nota;

  public Alunos(String nome, double nota) {
    this.nome = nome;
    this.nota = nota;
  }

  public String getNome() {
    return nome;
  }

  public double getNota() {
    return nota;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }
}