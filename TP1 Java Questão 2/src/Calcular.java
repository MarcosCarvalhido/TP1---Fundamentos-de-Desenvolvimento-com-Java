import java.util.Scanner;

public class Calcular {
    static Scanner userInput = new Scanner(System.in);

    protected double capital;
    protected double juros;
    protected int meses;
    
    public void Montante(){
        double montante;
        capital = SetCapital();
        juros = SetJuros();
        meses = SetMeses();
        
        montante = capital * (Math.pow((1 + juros), meses));
        
        LerResposta(Math.round(montante));
    }
    protected double SetCapital(){
        userInput = new Scanner(System.in);
        System.out.println("Digite a quantidade de capital: ");
        return userInput.nextDouble();
    }
    protected double SetJuros(){
        userInput = new Scanner(System.in);
        System.out.println("Digite a taixa de juros: ");
        return userInput.nextDouble() / 100;
    }
    protected int SetMeses(){
        userInput = new Scanner(System.in);
        System.out.println("Digite a quantidade de meses: ");
        return userInput.nextInt();
    }
    protected void LerResposta(double resposta){
        System.out.println("O Montante calculado apartir dos valores informados é: " + resposta);
    }
}
