package ProjetoBanco;

import ProjetoBanco.Conta.ContaPF;

public class CriacaoConta {
    // atributos
    int cont;

    ContaPF contaspf[] = new ContaPF[10];

    // criar conta
    public void criarconta() {
        contaspf[cont] = new ContaPF();
        cont++;
    }
}
