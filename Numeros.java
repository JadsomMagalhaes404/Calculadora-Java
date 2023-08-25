package CalculadoraSimples;
public class Numeros {
    private double num1;
    private double num2;

    public void setNumeros(double n1, double n2){
        this.num1 = n1;
        this.num2 = n2;
    }
    private double getNumero1(){
        return num1;
    }
    private double getNumero2(){
        return num2;
    }
    public double Soma(){
        return getNumero1() + getNumero2();
    }
    public double Subtração(){
        return getNumero1() - getNumero2();
    }
    public double Multiplicação(){
        return getNumero1() * getNumero2();
    }
    public double Divisão(){
        return getNumero1() / getNumero2();
    }


}
