package fatec.poo;

import fatec.poo.model.Cliente;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#0,00");
        Scanner input = new Scanner(System.in);
        
        //estes serão utilizados para nos menus de opções do Aplic
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        //--------------------------------------------------------
        
        short opcMenu;
        
        do{
                        
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Cadastrar vendedor");
            System.out.println("3 - Cadastrar cliente");
            System.out.println("4 - Emitir um pedido");
            
            opcMenu = input.nextShort();
            
            switch(opcMenu){
                
                case 1: {
                    
                    
                    
                }break;
                case 2: {
                    
                }break;
                case 3: {
                    
                }break;
                
            }
            
        }while(opcMenu!= 0);
        
    }
    
}
