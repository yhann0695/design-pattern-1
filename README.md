# DESIGN PATTERN

CHAIN OF RESPONSABILITY: é um padrão de projeto
comportamental que permite que você passe pedidos por uma
corrente de handlers. Ao receber um pedido, cada handler
decide se processa o pedido ou o passa adiante para o próximo
handler na corrente.

STRATEGY: é um padrão de projeto comportamental que
permite que você defina uma família de algoritmos,
coloque-os em classes separadas, e faça os objetos
deles intercambiáveis.

COMMAND: é um padrão de projeto comportamental que
transforma um pedido em um objeto independente que
contém toda a informação sobre o pedido. Essa transformação
permite que você parametrize métodos com diferentes
pedidos, atrase ou coloque a execução do pedido em uma fila,
e suporte operações que não podem ser feitas.

OBSERVER: é um padrão de projeto comportamental que
permite que você defina um mecanismo de assinatura para
notificar múltiplos objetos sobre quaisquer eventos que
aconteçam com o objeto que eles estão observando.

STATE: é um padrão de projeto comportamental que permite
que um objeto altere seu comportamento quando seu estado
interno muda. Parece como se o objeto mudasse de classe.
