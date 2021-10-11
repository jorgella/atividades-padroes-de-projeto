package br.edu.ifma.padroessoftware.etapa3.atv1.questao3.pt1;

import java.text.MessageFormat;
import java.time.LocalDateTime;

public final class Logger {

    private static final String PATTERN = "[%s-%d %s] %s";

    private boolean ativo = false;

    public Logger() {

    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void log(String s) {
        String message =  String.format(PATTERN, Thread.currentThread().getName(), Thread.currentThread().getId(), LocalDateTime.now().toString(), s);
        if (this.isAtivo()) System.out.println(message);
    }

    public void log(String s, String ... args) {
        String message =  String.format(PATTERN, Thread.currentThread().getName(), Thread.currentThread().getId(), LocalDateTime.now().toString(), MessageFormat.format(s, args));
        if (this.isAtivo()) System.out.println(message);
    }

}
