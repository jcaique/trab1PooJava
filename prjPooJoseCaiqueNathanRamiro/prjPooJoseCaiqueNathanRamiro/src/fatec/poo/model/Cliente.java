package fatec.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;//ligacao 1..*

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = this.limiteCred;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.setCliente(this);
    }

    public void subLimite(double valor) {
        this.limiteDisp -= valor;
    }
}
