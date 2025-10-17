from collections import deque

#criando uma pilha utilizando o deque
pilha = deque()

#adicionando elementos na pilha
pilha.append('Prato Azul')
pilha.append('Prato Laranja')
pilha.append('Prato Vermelho')
pilha.append('Prato Verde')

print(pilha)

#removendo elementos: pop() remover no inicio LIFO

pilha.pop()

print(pilha)