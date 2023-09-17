package programa;

import javax.swing.JOptionPane;

import utilitarios.utils;

public class Conta {

	private static int contadorDeContas = 1;

	private int numeroConta;
	private Pessoa pessoa;
	private Double saldo = 0.0;

	public Conta(Pessoa pessoa) {
		this.numeroConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;

	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "\nNome>" + this.getNumeroConta() + "\nNome> " + this.pessoa.getNome() + "\nCPF> " + this.pessoa.getCpf()
				+ "\nemail> " + this.pessoa.getEmail() + "\nSaldo: " + utils.doubleToString(this.getSaldo()) + "\n";
	}

	public void depositar(Double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			JOptionPane.showMessageDialog(null,"Seu depósito foi realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null,"Nao foi possivel realizar o depósito!");
		}
	}

	public void sacar(Double valor) {
		if (valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null,"Nao foi possivel realizar saque!");
		}
	}

	public void transferir(Conta contaParaDeposito, Double valor) {
		if (valor >= 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			
			contaParaDeposito.saldo = contaParaDeposito.getSaldo()+valor;
			JOptionPane.showMessageDialog(null,"transferencia realizada com sucesso!");			
		} else {
			JOptionPane.showMessageDialog(null,"Nao foi possivel realizar a transferencia!");
		}
	}

}
