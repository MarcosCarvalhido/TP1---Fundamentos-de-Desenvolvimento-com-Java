import java.text.MessageFormat;
import java.util.Scanner;

public class Fibonacci {
    static Scanner userInput = new Scanner(System.in);
    public void CalcularFibonacci(){
         
        int primeiro = 1;
        int segundo = 1;
        int resultado = 0;
        int repetições = SetRepetições();
        String sequencia = "";

        for (int i = 0; i < repetições; i++) {
            if(i > 1){
                resultado = primeiro + segundo;

                sequencia = gerarSequencia(i, resultado, repetições, sequencia);
                primeiro = segundo;
                segundo = resultado;
            }
            else{
                sequencia = sequencia + "1" + ", ";
            }
        }
        lerFibonacci(sequencia, repetições);
        razãoAurea(segundo, primeiro, repetições);
    }
    public int SetRepetições(){
        userInput = new Scanner(System.in);
        System.out.println("Digite a quantidade de sequencias: ");
        return userInput.nextInt();    
    }
    public void razãoAurea(double ultimo, double perultimo, int repetições){
        double aurea = (ultimo + perultimo) / ultimo;
        System.out.println("A razão aurea é uma constante matematica calculada dividindo a soma dos dois ultimos valores de uma sequencia de Fibonacci pelo ultimo valor.");
        System.out.println(MessageFormat.format("Em uma sequencia de {0} repetições, a divisão de {1} e {2} é igual a {3}. A constante Phi.",repetições,ultimo,perultimo,aurea));
    }
    public void lerFibonacci(String fibonacci, int repetições){
        System.out.println(MessageFormat.format("A sequencia de Fibonacci com {0} digitos é: {1}",repetições,fibonacci));
    }
    protected String gerarSequencia(int i, int resultado,int repetições, String sequencia){
        if(i == (repetições - 1)){
            sequencia = sequencia + "e " + resultado + ".";
        }
        else if (i == (repetições - 2)){
            sequencia = sequencia + resultado + " ";
        }
        else{
            sequencia = sequencia + resultado + ", ";
        }
        return sequencia;
    }

}
