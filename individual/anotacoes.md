# Enunciado da questão

- Sistema que simula um gerenciador de despesas. Dusa classes: *GerenciadorDespesas* e *Despesas*

**Despesa** guarda as informações de **nome**, **valor** e **recorrência**, como parâmetros obrigatórios para criação do objeto.
**valor** e **recorrência** têm setters, acho que tudo tem getter.

**GerenciadorDespesas** tem um ArrayList<Despesas>
Ele vai ter os seguintes métodos:
- **adicionarDespesa(Despesa)**: void
- **removerDespesas(String)**: void - remove com base no nome
- **limparDespesas()**: void - remove tudo
- **calcularCustoMensal()**: double - calcula a soma de tudo, com base no valor e na recorrência
- **getMaiorDespesa()**: Despesa - retorna a despesa de maior custo mensal
- **descreveDespesas()**: String - retorna um toString da coisa

- Se preocupe em encapsular os campos e criar métodos apropriados
- Criar um menu que permita o uso das funções
