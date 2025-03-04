package packageOrientacao;

//Criando a classe funcionario
public class Funcionario {
        //Criando os atributos nome e salario dos funcionários
        String nome;
        double salario;
 
//método para aumento de salário        
void aumentoSalario (double valor){
    this.salario += valor;
}

//imprime o valor do salário com o aumento
void imprimeSalario(){
    System.out.println("Novo Salario: " + this.salario + "\n");
}
  
//realiza a consulta dos dados dos funcionários
String consultarDados() {
        return "Nome: " + nome + ", Salario: " + salario;   
    
    }
}