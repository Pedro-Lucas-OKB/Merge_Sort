# Merge Sort
O Merge Sort é um algoritmo de *ordenação por comparação* que utiliza a técnica de **Divisão e Conquista**. 
Seu tempo, no pior caso, é O(n *log₂*n), o que o torna um algortimo eficiente para grandes entradas.

## Como a *Divisão e Conquista* funciona no Merge Sort?
* **Dividir:** Dada uma sequência de *n* elementos, essa é dividida em duas subsequências de tamanho *n*/2 cada.
* **Conquistar:** As duas subsequências são ordenadas através da recursão utilizada no Merge Sort. Uma vez que 
temos as divisões, chegará um momento em que a sequêncida tem tamanho *n = 1*,onde esse único elemento está 
trivialmente ordenado, sendo esse o caso base da recursão
* **Combinar:** Dadas as subsequências ordenadas, basta juntá-las, através de comparações, para obter a resposta,
que é uma sequência ordenada. 