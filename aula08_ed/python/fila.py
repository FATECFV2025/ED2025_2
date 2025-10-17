from collections import deque

# criando uma fila vazia
fila = deque()

#adicionando elementos na fila
fila.append('Mobi')
fila.append('Kwid')
fila.append('Up')

#exibindo elementos da fila
print(fila)

#quantidade de elementos da fila
print(len(fila))

#removendo um elemento da fila
carro = fila.popleft()

print(fila)

#percorrendo uma fila

while fila:
        carro = fila.popleft()
        print(carro)