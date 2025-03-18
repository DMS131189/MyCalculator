public class MyCalculator {
    public static void main(String[] args) {
        // NomeClasse nomeObjeto = new NomeClasse(valorParametro1, valorP2...);

        float result=0;

        Calculator  calculatorSc = new Calculator();
        calculatorSc.type= "Scientific";

        Calculator calculator = new Calculator("Common");

        /*result= calculator.sum(10,10 );
        result= calculator.subtract(result,5);
        result= calculator.multiply(result,20);
        result= calculator.divide(result,3);*/

        // soma e uma subtração e pega o resultado
        calculator.sum(10,12);
        calculator.subtract(6,3);

        result = calculator.result();


        System.out.println("Your result is: " + result);
    }

}
