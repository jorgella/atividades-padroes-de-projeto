package edu.ifma.dcomp.padroesdesoftware.atividade2.etapa1.questao11.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Database {

    private final List<Conta> contas = new ArrayList<>();

    public List<Conta> findAll() {
        return Collections.unmodifiableList(contas);
    }

    public void add(Conta conta) {
        if (conta != null) this.contas.add(conta);
    }

}
