// Pilha Vazia
let pilha = []


//Pilha Preenchida
let pilha_dados = ['Prato Azul', 'Prato Verde', 'Prato Vermelho']

//Empilhando elementos: PUSH
pilha_dados.push('Prato Branco')
pilha_dados.push('Prato Amarelo')

//Exibir dados da Pilha
console.log(pilha_dados)

//Visualizar elemento do topo: 
console.log(pilha_dados[pilha_dados.length-1])

//Verificar se a pilha esta vazia: precisa verificar o length
console.log(pilha_dados.length === 0)

//Verificar o tamanho da pilha: propriedade length
console.log(pilha_dados.length)

//Percorrendo uma pilha
for (let i = pilha_dados.length-1; i>=0;i-- ){
     console.log(pilha_dados[i]);
}