# Questão 12

A abordagem proposta no `cenariobase` é comoda, mas possui problamas de design
pois viola o _Princípio de substituição de Liskov_.

A violação ocorre na implementação de `Deposito` que herda todos os métodos e atributos
de `Movimento`. Ao chamar `getEncargos()`, uma exceção  que não era esperada
pela implementação de `Movimento`.

Isso limita o uso do polimorfismo nas dependentes pois não podem
substituir a implementação de `Movimento` por qualquer outra limitando seu uso
com operadores como o `ìnstanceof` e obrigando o usuário da classe a usar cast em alguns casos,
fazsndo conhecer o tipo. Logo perdemos os pontos positivos do polimorfismo.

No pacote `refatoracao1`, resolvemos isso com composição. Agora as 
instancias de `Deposito` e `Pagamento` não tem mais acesso direto aos métodos de `Movimento`, 
podendo evoluir de forma isolada, utilizando apenas o que realmente precisam
de `Movimentacao` e "ignorando" as demais funcionadlidades/aspectos da implementação de `Movimanto`.
