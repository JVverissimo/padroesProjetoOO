# Padrão de Projeto: Factory Method (Método Fábrica)

## O que é?
O **Factory Method** é um padrão de projeto criacional (voltado para a construção de objetos) definido pelo *Gang of Four (GoF)*. Sua principal intenção é definir uma interface genérica para a criação de objetos, mas permitir que as subclasses decidam quais classes concretas serão instanciadas. Em resumo, ele delega a responsabilidade de instanciação para as subclasses.

## O Problema que Resolve
Imagine que você está desenvolvendo um aplicativo de logística. Na primeira versão, o seu aplicativo só consegue transportar cargas usando caminhões. Todo o seu código fica fortemente acoplado à classe `Caminhao`. 

Se mais tarde você precisar adicionar transporte marítimo (usando a classe `Navio`), terá que modificar uma grande parte do código para incluir condicionais (`if/else`) toda vez que for criar um novo transporte. Isso viola o princípio do **Aberto/Fechado (OCP)**, pois o seu código central precisa ser constantemente modificado (aberto para modificação) em vez de apenas estendido.

## A Solução
O padrão sugere substituir as chamadas diretas de construção de objetos (usando o operador `new`) por chamadas a um método especial: o *método fábrica*.

Os objetos ainda são criados através da palavra-chave `new`, mas isso ocorre de forma encapsulada dentro do método fábrica. Dessa forma, a classe principal (o Cliente/Criador) passa a lidar apenas com uma interface ou classe abstrata do produto, não se importando com qual objeto concreto está sendo criado, desde que ele respeite o contrato estabelecido.

## Estrutura e Participantes
1. **Produto (Product):** Interface comum para todos os objetos que podem ser produzidos pela fábrica.
2. **Produto Concreto (Concrete Product):** Implementações específicas da interface do produto (ex: `Caminhao`, `Navio`).
3. **Criador (Creator):** Declara o método fábrica que retorna um objeto do tipo Produto. Pode também fornecer uma implementação padrão.
4. **Criador Concreto (Concrete Creator):** Sobrescreve o método fábrica base para retornar um Produto Concreto diferente.

## Vantagens
* **Desacoplamento:** Evita o acoplamento forte entre a classe criadora e os produtos concretos.
* **Princípio de Responsabilidade Única (SRP):** Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção.
* **Princípio Aberto/Fechado (OCP):** Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.

---

## Referências e Leitura Adicional
Para se aprofundar mais no funcionamento, exemplos de código em várias linguagens e diagramas visuais, consulte o guia completo no Refactoring Guru:

🔗 **[Refactoring Guru - Factory Method](https://refactoring.guru/pt-br/design-patterns/factory-method)**