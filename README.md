# Sistema de Descontos com Padrão Strategy

Este projeto implementa um sistema de descontos usando o padrão de projeto Strategy. O sistema permite a aplicação de diferentes tipos de descontos em vendas, como descontos percentuais, descontos progressivos e descontos de aniversário.

## Estrutura do Projeto

- `Cliente.java`: Representa um cliente da loja.
- `Venda.java`: Representa uma venda realizada para um cliente.
- `DescontoStrategy.java`: Interface que define o contrato para os algoritmos de desconto.
- `DescontoPercentual.java`: Implementação de desconto percentual.
- `DescontoProgressivo.java`: Implementação de desconto progressivo.
- `DescontoAniversario.java`: Implementação de desconto de aniversário.
- `Main.java`: Classe principal para testar a aplicação.

## Como Executar

1. Clone o repositório.
2. Abra o projeto em sua IDE favorita.
3. Execute a classe `Main.java` para ver os diferentes tipos de descontos sendo aplicados.

## Respostas às Perguntas

1. **Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?**
   - O padrão Strategy é o mais adequado para essa situação.

2. **Como podemos implementar esses tipos de desconto sem usar Padrões de Projetos?**
   - Sem usar padrões de projeto, você poderia implementar os descontos diretamente na classe `Venda` usando condicionais.

3. **Quais são os problemas que tal implementação traria?**
   - Falta de flexibilidade, código difícil de manter e dificuldade de teste.

## Contribuição

Sinta-se à vontade para contribuir com melhorias e novas funcionalidades. Abra uma issue ou envie um pull request.
