# Questão 11

No pacote `cenarioimplementacaoprocedural` temos a implementção base
do Realizador de investimentos. Temos as classes:

- `Conta`: Conta para acrescentar o saldo do resgate do investimento no saldo.
- `TipoDeInvestmento`: possui os tipos de investimento `CONSERVADOR`, `MODERADO` e `ARROJADO`. 
- `RealizadorDeInvestimentos`: Possui a lógica para realização do investimento e retornos possíveis.

A classe `RealizadorDeInvestimentos` possui acoplamento alto com os tipos de investimento, dado que
ela implementa todos os tipos de investimento possíveis. Ao alterar as regras de negócio
dos retornos do investimento e/ou adicionar novos tipos de investimento (Ex: Piramide) essa classe deve
ser alterada.

No pacote `refatoracao1` temos a criação de uma nova interface `EstrategiaDeInvestimento` que pode fazer 
os cálculos de rentabilidade dos investimentos. Esta possui três implementações: `InvestimentoConsevador`, 
`InvestimentoModerado` e `InvestimentoArrojado`, cada uma com a mesma implementação anterior. Com isso podemos
isolar as possíveis alterações e novas implementações de `EstrategiaDeInvestimento` para as classes responsáveis
por cada tipo.

Tambem ganhamos em cenários de teste. Na primeira implementação temos uma classe difícil or diversos motivos:

1. Classe faz muitas tarefas (calculo de lucro, deduz impostos, adiciona saldo a conta), 
assim os testes perdem coesão, e torna-se muito difícil de testar muitos casos de uso.
2. o método tem complexidade ciclomática maior e leva a testes mais complexos.
3. A implementação está fortemente acoplada à classe `Random`, impossibilitando testes de unidade bem sucedidos,
devido às suas características de geração de números pseudo aleatórios.
   
Os itens 1 e 2 são resolvidos com a separação dos tipos de investimento. 
O item 3 foi reslvido com a inversão da dependencia da classe `Random`, possibilitando que os cenários
de testes facilitados. Agora podemos fazer _mock_ do *Random* e passar os cenários necessários para os testes.
