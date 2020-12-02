package fatec.poo.model;

import java.util.ArrayList;

public class Pedido {

    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagamento;
    private boolean situacao;
    private Cliente cliente; //definicao de ponteiro multiplicidade 1
    private Vendedor vendedor;

    private ArrayList<ItemPedido> itensPedidos;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.itensPedidos = new ArrayList<ItemPedido>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagamento(boolean formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean isFormaPagamento() {
        return formaPagamento;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente; //associando 1 cliente a 1 pedido
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setItemPedido(ItemPedido itemPedido) {

//        if (this.cliente.getLimiteDisp() >= itemPedido.getProduto().getPreco() * itemPedido.getQtdeVendida()) {
        this.itensPedidos.add(itemPedido);
        itemPedido.setPedido(this);
        this.cliente.subLimite(itemPedido.getProduto().getPreco() * itemPedido.getQtdeVendida());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public ArrayList<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }
    
    
}
