// Em JS nativo não há uma estrtura de fila
//É utilizado ArrayList para copiar esse comportamento

//declarando uma fila vazia
let veiculo = []

//adicionando elementos
veiculo.push('Corsa')
veiculo.push('Astra')
veiculo.push('Uno')

//exibindo a fila
console.log(veiculo)

//primeiro elemento da fila
console.log(veiculo[0])

//removendo elemento da fila
veiculo.shift()
console.log(veiculo)

//tamanho da fila
console.log(veiculo.length)

//fila esta vazia?
console.log(veiculo.length==0)
