package br.com.cybercorp.main;

import br.com.cybercorp.model.Credencial;
import br.com.cybercorp.model.Departamento;
import br.com.cybercorp.model.Funcionario;
import br.com.cybercorp.model.SistemaSeguranca;
import br.com.cybercorp.model.Veiculo;

public class MainTeste {

    public static void main(String[] args) {

        // 1. Criando Departamento
        Departamento departamento = new Departamento(
                "TI",
                "Tecnologia da Informação",
                3
        );

        // 2. Criando Funcionário
        Funcionario func = new Funcionario(
                "001",
                "João",
                departamento
        );

        // 3. Criando Veículo
        Veiculo veiculo = new Veiculo(
                "ABC-1234",
                "Honda Civic",
                func
        );

        // 4. Sistema com apenas 2 vagas
        SistemaSeguranca sistema = new SistemaSeguranca(2);

        // 5. Credencial original
        Credencial c1 = new Credencial(
                "FFF-999",
                true,
                func
        );

        // 6. Credencial clonada
        Credencial clone = new Credencial(
                "FFF-999",
                true,
                func
        );

        // TESTE DA CATRACA
        sistema.registrarCatraca(func);
        sistema.registrarCatraca(func);

        // TESTE DO COFRE
        sistema.acessarCofre(c1);
        sistema.acessarCofre(clone);

        // TESTE DA GARAGEM
        sistema.estacionarVeiculo(veiculo, 0);

        // Forçando erro proposital
        sistema.estacionarVeiculo(veiculo, 5);
    }
}