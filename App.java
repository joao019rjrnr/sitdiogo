package ProjetoBanco;

import javax.swing.JOptionPane;

import ProjetoBanco.Conta.ContaPF;
import ProjetoBanco.Conta.ContaPJ;

public class App {
    private static int cont;

    public static void main(String[] args) {

        ContaPF contasPf[] = new ContaPF[10];
        ContaPJ contasPj[] = new ContaPJ[10];
        boolean agenciaAberta = true;
        int cont = 0;
        int contaAtual = 0;
        while (agenciaAberta) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação desejada:"
                    + "\n 1 - Criar Conta Pessoal Física;"
                    + "\n 2 - Acessar Conta Pessoal Jurídica;"
                    + "\n 3 - Acessar Conta Física;"
                    + "\n 4 - Acessar Conta Jurídica;"));
            if (acao1 == 1) {
                // criar conta PF
                contasPf[cont] = new ContaPF();// obj criado
                // atribuir infos da conta criada
                contasPf[cont].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPf[cont].setNumeroConta(1000 + cont + 1);
                contasPf[cont].setSaldo(0);
                contasPf[cont].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                cont++;

                // criar conta PJ
                if (acao1 == 2) {
                    // criar conta(vou fazer primeiro da PF)
                    contasPf[cont] = new ContaPF();// obj criado
                    // atribuir infos da conta criada
                    contasPf[cont].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                    contasPf[cont].setNumeroConta(1000 + cont + 1);
                    contasPf[cont].setSaldo(0);
                    contasPf[cont].setnCpf(JOptionPane.showInputDialog("Informe o CNPJ:"));
                    cont++;
                }

            } else if (acao1 == 2) {
                // acessar conta - percorrer o vetor criado eprocurar um valor ou nº da conta ou
                // nome
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da Conta"));
                for (int i = 0; i < contasPf.length; i++) {
                    if (nContaBuscada == contasPf[i].getNumeroConta()) {
                        contaAtual = i;
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                    }
                }
                boolean acessar = true;
                //
                while (acessar) {
                    // opções dos métodos da conta PF
                    int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Opção Desejada"));
                    if (opcao == 1) {
                        contasPf[contaAtual].getSaldo();
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Digite uma ação válida");
            }
        }
    }
}
