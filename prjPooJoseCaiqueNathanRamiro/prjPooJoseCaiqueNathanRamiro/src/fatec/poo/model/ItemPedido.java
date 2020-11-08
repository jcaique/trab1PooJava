package fatec.poo.model;

public class ItemPedido {

    private int sequencia;
    private double qtdeVendida;
    private Pedido pedido;
    private Produto produto;
    
    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
        if(produto.getQtdeEstoque()>= qtdeVendida){
            
            produto.subQtdeEstoque(qtdeVendida);
            
        }
        else{
            
            System.out.println("");
            System.out.println("A quantidade que esta a ser vendida é acima da disponivel");
            System.out.println("APENAS "+ produto.getQtdeEstoque() +" SERÃO INCLUSAS NO PEDIDO");
            System.out.println("");
            
            produto.subQtdeEstoque(produto.getQtdeEstoque());
            
        }
        
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Produto getProduto(){
        return produto;
    }
}
