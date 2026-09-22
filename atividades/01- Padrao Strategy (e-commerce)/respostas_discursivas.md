# Respostas discursivas Exercício 01 -  Padrão Strategy (e-commerce)





### O que acontece com a classe Pedido toda vez que uma nova forma de frete precisa ser adicionada? Em outras palavras, qual o problema com esta solução?

**R:** Isso criaria a necessidade de novos blocos `else-if` serem adicionados, o que deixaria o código da classe Pedido enorme e com *bad smell*.



---

## Questões Principais

### 1.Qual problema o padrão Strategy resolve?

**R:** Ele resolve o problema de alto acoplamento, baixa coesão (o código estava indo em direção à virar uma *god class*) e códigos muito extensos devido à muitas dinâmicas de comportamentos distintos. No caso do exercício, esse comportamente seria no método`calcularFrete()`.

### 2.O que aconteceria se usássemos apenas if/else?

**R:** O código ficaria gigante a médio e longo prazo, dificultando sua manutenabilidade e, consequentemente, prejudicando sua expansão e refatoração.

### 3.Como o sistema fica aberto para extensão?

**R:** Após a implementação do Design Strategy, ele fica aberto por meio de novas classes que implementem a interface `CalculaFrete`, sem necessidade de mexer na classe Pedido (o Context).

### 4.O que acontece se cada país tiver uma regra de cálculo de frete diferente no caso de frete internacional?

**R:** Poderia ocorrer o mesmo problema de muitas subclasses ou blocos `if-else`, então eu excluiria a classe `FreteInternacional` e substituiria por novas estratégias concretas que tivesse implementações para cada país como `FreteInternacionalArgentina` ou `FreteInternacionalChina` por exemplo.

### 5.Em quais outros cenários Strategy poderia ser utilizado?

**R:** Pode ser utilizado em formas de pagamento desse e-commerce (cartão, Pix, boleto), sistemas de cálculo de nota (média simples, ponderada, final) ou no traçado de rotas em aplicativos de GPS (rota mais rápida, mais curta, com menos sinalização).



---

## Desafio Extra

### 1.Essas regras são novas estratégias de cálculo ou promoções?

**R:** Não são novas estratégias, uma vez que podem ser aplicadas a uma ou mais estratégias já existentes. Parecem mais uma funcionalidade adicional que poderia estar presente em todas as formas de frete.

### 2.Elas deveriam modificar Sedex, PAC, Internacional e demais regras de cálculo?

**R:** As estratégias concretas em si não deveriam ser modificadas porque quebraria o principio de fácil manutenção do código e da coesão (algumas classes se preocupariam com outra dinâmica de frete).

### 3.Como evitar alterar todas as classes já implementadas?

**R**: A opção mais simples que vejo, mas que fere o princípio da coesão e modificabilidade no Context (delegando uma responsabilidade extra), seria adicionar um único bloco `if-else` que checa o valor final do frete dependendo das estratégias escolhidas e, caso o valor ultrapasse R\$399, retornaria R\$0. Porém, pensando em outras possíveis soluções, não vejo nenhuma que, se eu fosse implementar agora, não modificaria o código das estratégias concretas. Pesquisando um pouco, percebi que essa dúvida é uma possível referência para o padrão *Decorator* que vamos estudar 😶‍🌫️😶‍🌫️😶‍🌫️
