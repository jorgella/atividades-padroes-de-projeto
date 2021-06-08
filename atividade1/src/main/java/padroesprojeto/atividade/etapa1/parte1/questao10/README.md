# Questão 10

No pacote `cenariobase` temos a implementação do Pagador de Funcionario, que tem diversos possiveis problemas, entre eles:

1. Ao adicionar um outro tipo de funcionário (Ex. trainee, Jovem aprendiz, Funcionario em período de experiência) deve 
adicionar método para este novo tipo.

2. A classe `PagadorDeFuncionario` está altamente acoplado com a implementação do `Chefe`, `Funcionário` e `Estagiario`, 
sendo que ambas tem interfaces similares. 
   
No pacote `refatoracao1` foi feita a generalização dos métodos de `Chefe`, `Funcionário` e `Estagiario` para a interface
`Recebedor`, com os seus métodos semelhantes:

```java
public interface Recebedor {

    Double getGratificacaoBase();

    Double getBonificacoes();

    void depositaNaConta(Double valor);

}
```

Todas ações semelhantes foram extraidas para a interface e implementadas pelas classes `Chefe`, `Funcionário` e `Estagiario`.
Assim podemos variar os tipos pasados em `PagadorDeFuncionario` com uma implementação mais simples.

```java
public class PagadorDeFuncionario {

    public void pagar(Recebedor recebedor) {
        recebedor.depositaNaConta(recebedor.getGratificacaoBase() + recebedor.getBonificacoes());
    }

}
```

Dessa forma, `PagadorDeFuncionario` paga qualquer tipo de funcionário, mas não conhece a implamentação de 
nenhum deles podendo criar novos tipos de funcionário sem mudar a implementação da classe.

Uma melhoria que pode ser feita vendo a implementação é criar uma interface `CalculadoraDeSalario`, assim 
teriamos um método `Double calcularSalario()` nas classes `Chefe`, `Funcionário` e `Estagiario`, assim o 
`PagadorDeFuncionario`, com um novo método `void pagar(CalculadoraDeSalario calculadoraDeSalario)` não saberia como 
calcular salario e apenas delegaria essa responsabilidade para as entidades.

Outra melhoria seria extrair o método `void depositaNaConta(Double valor)` para outra interface e passar ao `PagadorDeFuncionario`
a `FormaDeposito`, assim o `Recebedor` não mais deve saber como depositar.
