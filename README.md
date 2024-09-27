# Calculadora Polonesa
> Programa para calcular expressões escritas com notação inversa polonesa.

---
### Inputs:
 o programa recebe expressões com a notação polonesa escritas em um arquivo txt

 ### Output:
  Printa no terminal a expressão reescrita em notação convencional e o seu resultado

---
### *Explicando o algoritmo:*

    Tomando como fato, qualquer operação matemática ter imperativamente dois operandos e um operador, e que podemos fazer um
    calculo se e somente se, estes 3 elementos existirem. Dito isso, afirma-se que toda notação polonesa inicia com pelo menos
    dois valores numéricos quaiquer, seguidos de um operador, este operador irá sempre se referir aos dois valores que o antecedem,
    e nada além deles.
Nos casos onde temos mais de um operador consecutivo, podemos afirmar que os operadores que foram adicionados por ultimo,
irão se referir ao resultado (valor númerico) da operação de quem vem mais a frente (indicando uma lógica semelhante a uma
fila, onde o primeiro elemento adicionado será o primeirio elemento a ser calculado). Assim, sustentamos duas afirmações:

    1º: Para toda notação polonesa, operamos somente 3 elementos por vez (2 operandos, 1 operador).

    2º: Para um número N de operandos, haverão sempre um número N - 1 de operadores.

Com estas duas afirmações, fica clara a solução computacional do problema.

O método "traduzir" da classe, implementa a lógica discutida da seguinte forma:
- Adicionamos números em uma pilha ate encontrarmos um operador.
- Ao encontrar o operador, usamos da natureza da pilha para extrairmos os dois valores que antecem o operador (desempilhando).
- Concatenamos os operandos com o operador e salvamos o resultado para posteriormente criamos uma nova celula que recebe a concatenação (chamaremos de celula composta).
- Feito isso, chamamos o método "calcular" que usa um switch case para descobrir qual operação será feita entre os dois elementos desempilhados.
- Salvamos o resultado desta operação e criamos uma nova celula, que guarda o valor da String concatenada e o resultado da operação.
- Esta nova celula é adicionada a pilha, e o loop completa sua iteração.

Usando o campo "resultado" da celula, nós garantimos que quando uma celula composta for chamada para uma operação, teremos o resultado
de sua expressão e tomaremos este resultado como parâmetro para próxima operação.
