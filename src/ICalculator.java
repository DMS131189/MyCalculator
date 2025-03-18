public interface ICalculator {
    
    // Clean Code Concepts
    // Avoid shorting words.
    String type = "";
    float memory=0;
    void sum(float n1, float n2);
    void subtract(float n1, float n2);
    void multiply(float n1, float n2);
    void divide(float n1, float n2);
    void clear();
    float result();
    

}
