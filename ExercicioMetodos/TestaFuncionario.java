package packageOrientacao;

public class TestaFuncionario {

    

    public static void main(String[] args) {
        
        //Atribuindo valores aos objetos
        Funcionario f1 = new Funcionario();
        f1.nome = "Maria da Silva";
        f1.salario = 2000.00;
                 
        Funcionario f2 = new Funcionario();
        f2.nome = "Joao de Moraes";
        f2.salario = 1800.00;
        
        
        //mostrando os valores na tela do funcionário1
        System.out.println ("Nome: " + f1.nome);
        System.out.println("Salario: R$" + f1.salario); 
        
        //Adicionando valor para aumentar o salário
        f1.aumentoSalario(800);
        f1.imprimeSalario();
        
        
        //mostrando os valores na tela do funcionário2
        System.out.println ("Nome: " + f2.nome);
        System.out.println("Salario: R$" + f2.salario);
        
        //Adicionando valor para aumentar o salário
        f2.aumentoSalario(900);
        f2.imprimeSalario();
            

        //Adicionanado método para consulta de dados dos funcionários
        System.out.println(f1.consultarDados());
        System.out.println(f2.consultarDados());
       
    }
    
}
