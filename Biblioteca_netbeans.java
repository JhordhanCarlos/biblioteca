package biblioteca_netbeans;

import java.util.Date;
import java.util.Scanner;

public class Biblioteca_netbeans  extends Alugar{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        //Cadastrando editoras
       
        Editora editora = new Editora();
        editora.setNomeEditora("Aleph");
        editora.setCnpj(55555);
        editora.setEndereco("Rua Tal, 80, bairro tal");
        
        Editora editora2 = new Editora();
        editora2.setNomeEditora("JBC");
        editora2.setCnpj(656565);
        editora2.setEndereco("Rua Tal, 40, bairro tal");
        
        Editora editora3 = new Editora();
        editora3.setNomeEditora("darkside");
        editora3.setCnpj(474747);
        editora3.setEndereco("Rua Tal, 90, bairro tal");
        
        Editora editora4 = new Editora();
        editora4.setNomeEditora("Tribuna de Minas");
        editora4.setCnpj(717171);
        editora4.setEndereco("Rua Tal, 90, bairro tal");
        
        //Cadastrando Livros
        
        Alugavel livro = new Alugavel();
        livro.setTitulo("The Martian");
        livro.setTipo("Livro");
        livro.setEditora(editora.getNomeEditora());
        livro.setIsbn(88888888);
        livro.setClassificacao(14);
        livro.setNumPaginas(320);
        livro.setTema("ficção-ciêntífica");
        
        Alugavel livro2 = new Alugavel();
        livro2.setTitulo("Duna");
        livro2.setTipo("Livro");
        livro2.setEditora(editora.getNomeEditora());
        livro2.setIsbn(9999999);
        livro2.setClassificacao(14);
        livro2.setNumPaginas(600);
        livro2.setTema("ficção-ciêntífica");
        
        Alugavel livro3 = new Alugavel();
        livro3.setTitulo("IT");
        livro3.setTipo("Livro");
        livro3.setEditora(editora3.getNomeEditora());
        livro3.setIsbn(111111);
        livro3.setClassificacao(16);
        livro3.setNumPaginas(700);
        livro3.setTema("Terror");
        
        Alugavel jornal = new Alugavel();
        jornal.setTitulo("Tribuna de Minas hoje");
        jornal.setTipo("Jornal");
        jornal.setEditora(editora4.getNomeEditora());
        jornal.setIsbn(666666);
        jornal.setClassificacao(16);
        jornal.setNumPaginas(700);
        jornal.setTema("Fantasia");
        
        Alugavel manga = new Alugavel();
        manga.setTitulo("Yu Yu Hakusho");
        manga.setTipo("Mangá");
        manga.setEditora(editora2.getNomeEditora());
        manga.setIsbn(666666);
        manga.setClassificacao(16);
        manga.setNumPaginas(700);
        manga.setTema("Fantasia");
        
        
        //Cadastrando usuários
        
        Usuario funcionario = new Usuario();
        funcionario.setNome("Geronimo Pereira");
        funcionario.setRole("Funcionário");
        funcionario.setIsGerente(false);
        
        Usuario cliente = new Usuario();
        cliente.setNome("Jedediah Marmelos");
        cliente.setRole("Cliente");
        cliente.setIsGerente(false);
        cliente.setIdade(23);
        
        Usuario funcionario2 = new Usuario();
        funcionario2.setNome("Agenor Silva");
        funcionario2.setRole("Funcionário");
        funcionario2.setIsGerente(true);
        
        // Operações
        

        Date date = new Date();
        System.out.println(date.getHours());
        
        if(date.getHours() > 8 && date.getHours() < 23){
            int id ; 
            System.out.println("Bem vindo(a) a Bilioteca \n \n");
            Scanner ler = new Scanner (System.in); 
            System.out.println("Qual o seu cargo?");
            System.out.println("1 - Gerente");
            System.out.println("2 - Funcionário");
            
            id = ler.nextInt (); 
            
            if (id == 1){
                System.out.println("Relatório dos ultimos alugéis \n\n");
                alugar(funcionario2, livro, cliente);
                alugar(funcionario2, livro2, cliente);
                alugar(funcionario2, livro3, cliente);
                alugar(funcionario2, livro, cliente);
            }
            
            if (id == 2){
                Usuario rent; 
                Usuario rentUser; 
                System.out.println("Escolha quem irá fazer a operação: \n\n");
                System.out.println("1 - "+funcionario.getNome());
                System.out.println("2 - "+funcionario2.getNome());
                Scanner escolha = new Scanner(System.in);
                if(escolha.nextInt() == 1){
                    rent = funcionario;
                } else {
                    rent = funcionario2;
                }
                
                System.out.println("Escolha o Cliente: \n\n");
                System.out.println("1 - "+cliente.getNome());
                Scanner escolha2 = new Scanner(System.in);
                rentUser = cliente;
                
                System.out.println("Escolha o alugável: \n\n");
                System.out.println("1 - "+livro.getTitulo()+" / "+" Tipo: "+ livro.getTipo());
                System.out.println("2 - "+livro2.getTitulo()+" / "+" Tipo: "+ livro2.getTipo());
                System.out.println("3 - "+livro3.getTitulo()+" / "+" Tipo: "+ livro3.getTipo());
                System.out.println("4 - "+jornal.getTitulo()+" / "+" Tipo: "+ jornal.getTipo());
                System.out.println("5 - "+manga.getTitulo()+" / "+" Tipo: "+ manga.getTipo());
                Scanner num = new Scanner(System.in);
     
                switch (num.nextInt()) {
                    case 1 :
                        alugar(rent, livro, rentUser);
                    break;
                    case 2 :
                        alugar(rent, livro2, rentUser);
                    break;
                    case 3 :
                        alugar(rent, livro3, rentUser);
                    break;
                    case 4 :
                        alugar(rent, jornal, rentUser);
                    break;
                    case 5 :
                        alugar(rent, manga, rentUser);
                    break; 
                }
            }
       
        }
        else {
            System.out.println("A Bilioteca está fechada");
        }
    }
    
}
