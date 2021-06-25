package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao13.cenario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContaRepository {

    private final List<Conta> contas = new ArrayList<>();

    public Optional<Conta> findById(Integer index) {
        if (contas.size() <= index) return Optional.empty();
        return Optional.of(contas.get(index));
    }

    public void addConta(Conta conta) {
        if (conta != null) contas.add(conta);
    }

}
