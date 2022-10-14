/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_netbeans;

/**
 *
 * @author Jhordhan
 */
public class Alugar {
        public static void alugar(Usuario user, Alugavel alugavel, Usuario rentUser){
        Number idade = rentUser.getIdade();
        Number classificacao = alugavel.getClassificacao();
        int quantidade = 0;
        quantidade++;
        if(quantidade >= 3){
            System.out.println("Numero máximo de items");
        }
        
        if((int)rentUser.getIdade() < 18 && (int)alugavel.getClassificacao() == 18){
            System.out.println("O Cliente não tem idade para alugar esta obra");
        }
        
        if(user.getRole() != "Funcionário"){
            System.out.println("Você não pode efetuar essa funcionalidade");
        } else {
            user.getNome();
            alugavel.setIsRented(true);
            rentUser.getNome();
            System.out.println("Cliente: "+rentUser.getNome() + "\nO que levou: "+alugavel.getTitulo()+ " - "+alugavel.getTipo() +"\n \n Efetuado por: " + user.getNome());
        }
        
    }

}
