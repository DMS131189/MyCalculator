
public class Calculator implements ICalculator{

    public String type= "";
    public float memory=0;

    // construtor vazio
    public Calculator(){

    }

    // meu construtor customizado pra receber type
    public Calculator(String type){
        this.type = type;
    }

    // quantos construtores eu quizer...

    @Override
    public void sum(float n1, float n2) {
        this.memory = n1+n2;
    }

    @Override
    public void subtract(float n1, float n2) {
        this.memory = n1-n2;
    }

    @Override
    public void multiply(float n1, float n2) {
        this.memory = n1*n2;
    }

    @Override
    public void divide( float n1, float n2) {
        this.memory = n1/n2;
    }

    @Override
    public void clear(){
       this.memory= 0;
    }

    @Override
    public float result(){
        return this.memory;
    }


}