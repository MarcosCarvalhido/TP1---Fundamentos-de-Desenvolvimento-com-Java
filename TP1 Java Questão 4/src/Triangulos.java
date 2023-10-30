import java.util.Scanner;

public class Triangulos {
    static Scanner userInput = new Scanner(System.in);
    protected double ladoA,ladoB,ladoC;
    

    public void Identificar(){
        String resultado;
        ladoA = PegarLadoA();
        ladoB = PegarLadoB();
        ladoC = PegarLadoC();

        if(ValidarTriangulo(ladoA, ladoB, ladoC)){

            resultado = TipoDeTriangulo(ladoA,ladoB,ladoC);
            LerResultado(resultado);
        }
        else{
            System.out.println("Triangulo invalido, tente novamente!");
        }
    }

    protected double PegarLadoA(){
        userInput = new Scanner(System.in);
        System.out.println("Informe o Primeiro lado do Triangulo:");
        return userInput.nextDouble();
    }
    protected double PegarLadoB(){
        userInput = new Scanner(System.in);
        System.out.println("Informe o Segundo lado do Triangulo:");
        return userInput.nextDouble();
    }
    protected double PegarLadoC(){
        userInput = new Scanner(System.in);
        System.out.println("Informe o Terceiro lado do Triangulo:");
        return userInput.nextDouble();
    }
    protected String TipoDeTriangulo(double ladoA,double ladoB,double ladoC){
        String resultado;
        if ((ladoA == ladoB) && (ladoB == ladoC) && (ladoA == ladoC)) {
            resultado = "Equilátero";
        }
        else if((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)){
            resultado = "Isósceles";
        }
        else{
            resultado = "Escaleno";
        }
        return resultado;
    }
    protected void LerResultado(String resultado){
        System.out.println("Com os lados informados é possivel fazer um triangulo " + resultado);
        if (resultado.equals("Equilátero")) {
            System.out.println("Triangulos Equiláteros possuem o tamanho de todos os seus lados iguais. ");
        }
        else if(resultado.equals("Isósceles")){
            System.out.println("Triangulos Isósceles possuem o tamanho de apenas dois de seus lados iguais. ");
        }
        else{
            System.out.println("Triangulos Escalenos possuem o tamanho de cada um de seus lados diferente. ");
        }
    }
    protected boolean ValidarTriangulo(double ladoA,double ladoB,double ladoC){
        if(((ladoA + ladoB) <= ladoC) || ((ladoC + ladoB) <= ladoA ) || ((ladoC + ladoA) <= ladoB ) ) {
            return false;
        }
        else{
             return true;
        }
    }
    
}