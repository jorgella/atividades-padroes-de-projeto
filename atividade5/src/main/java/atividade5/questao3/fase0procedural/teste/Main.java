package atividade5.questao3.fase0procedural.teste;

import atividade5.questao3.fase0procedural.MudancaDeEstadoNaoMapeadaException;
import atividade5.questao3.fase0procedural.Processo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.print("\n\n\n\nCenário 1: Cancelamento de processo.\n\n");
        try {
            var processo = Processo.criarNovoProcesso();
            processo.validarProcesso();
            processo.cancalarProcesso();
            processo.transcorrerAte(LocalDate.now().plusDays(10));
        } catch (MudancaDeEstadoNaoMapeadaException e) {
            e.printStackTrace();
        }

        System.out.print("\n\n\n\nCenário 2: Processo deferido.\n\n");
        try {
            var processo = Processo.criarNovoProcesso();
            processo.validarProcesso();
            processo.designarProcesso();
            processo.deferirProcesso();
            processo.transcorrerAte(LocalDate.now().plusDays(10));
        } catch (MudancaDeEstadoNaoMapeadaException e) {
            e.printStackTrace();
        }

        System.out.print("\n\n\n\nCenário 3: Processo indeferido.\n\n");
        try {
            var processo = Processo.criarNovoProcesso();
            processo.validarProcesso();
            processo.designarProcesso();
            processo.indeferirProcesso();
            processo.transcorrerAte(LocalDate.now().plusDays(10));
        } catch (MudancaDeEstadoNaoMapeadaException e) {
            e.printStackTrace();
        }

        System.out.print("\n\n\n\nCenário 4:  Processo deferido após recurso.\n\n");
        try {
            var processo = Processo.criarNovoProcesso();
            processo.validarProcesso();
            processo.designarProcesso();
            processo.indeferirProcesso();
            processo.recorrerProcesso();
            processo.designarProcesso();
            processo.deferirProcesso();
            processo.transcorrerAte(LocalDate.now().plusDays(10));
        } catch (MudancaDeEstadoNaoMapeadaException e) {
            e.printStackTrace();
        }

        System.out.print("\n\n\n\nCenário 5:  Processo indeferido após recurso.\n\n");
        try {
            var processo = Processo.criarNovoProcesso();
            processo.validarProcesso();
            processo.designarProcesso();
            processo.indeferirProcesso();
            processo.recorrerProcesso();
            processo.designarProcesso();
            processo.indeferirProcesso();
            processo.transcorrerAte(LocalDate.now().plusDays(10));
        } catch (MudancaDeEstadoNaoMapeadaException e) {
            e.printStackTrace();
        }

        System.out.print("\n\n\n\nCenário 6: Alteração de status do processo não mapeada.\n\n");
        try {
            var processo = Processo.criarNovoProcesso();
            processo.validarProcesso();
            processo.deferirProcesso();
            processo.transcorrerAte(LocalDate.now().plusDays(10));
        } catch (MudancaDeEstadoNaoMapeadaException e) {
            e.printStackTrace();
        }

    }

}
