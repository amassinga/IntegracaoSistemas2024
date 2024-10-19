package MEIW;
public class HelloWorld {
    public static void main(String[] args) {
    
    System.out.println("Hello, World!");

           HelloWorld hw = new HelloWorld();
    
            hw.imprimirNomeAluno("Armando Massinga");
}

public void imprimirNomeAluno(String nome) {
    System.out.println("Nome do aluno: " + nome);
}
} 
