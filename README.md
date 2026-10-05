# AtividadePetri2

As estruturas Lista, Fila e Pilha servem para organizar dados, mas cada uma funciona de um jeito diferente. A Lista é mais livre, porque da pra inserir, remover e acessar elementos em posições diferentes. Um exemplo seria uma lista de produtos cadastrados no ecommerce da KRY. O acesso pela posição pode ser bem rápido, mas dependendo de como a lista foi feita, inserir ou remover no meio pode dar mais trabalho.

A Fila funciona pelo princípio FIFO (First In, First Out), ou seja, o primeiro que entra é o primeiro que sai. É igual uma fila normal mesmo. Um exemplo seria os pedidos da KRY esperando para serem processados, quem chegou primeiro vai primeiro. A vantagem é que inserir no final e remover do começo é simples e mantém a ordem, mas não é boa quando precisa acessar qualquer elemento no meio da fila.

A Pilha funciona ao contrário da fila, usando o princípio LIFO (Last In, First Out), então o último que entra é o primeiro que sai. Um exemplo seria no sistema de confecção em uma função de desfazer, a última alteração feita seria a primeira a ser desfeita. Inserir e remover pelo topo é simples, porém para acessar algo que está no meio teria que passar pelos elementos que estão em cima.

Então a diferença principal é essa: a Lista deixa trabalhar com os elementos de forma mais livre, a Fila respeita a ordem de chegada e a Pilha trabalha primeiro com o último elemento inserido. Cada uma tem vantagem dependendo do que o sistema precisa fazer.
