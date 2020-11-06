package fatec.poo.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa {

    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;

    public Vendedor(String nome, String cpf, double salarioBase) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao / 100;
    }

    public void setPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.setVendedor(this); //associando um pedido a um vendedor
    }
}
