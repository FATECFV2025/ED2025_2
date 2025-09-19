// Criando uma Array e inicializando com valores com []
let carro = ['Gol', 'Corsa', 'Palio', 'Kwid', 'Mobi', 'HB20', 'Onix', 'KA']

//Criando uma Array e inicializando com valores com Array()
let marcas = new Array('Fiat', 'Ford', 'Jeep')

//Criando um Array vazio
let acessorios = []
//ou
let categoria = new Array();

//Criar uma Array com um valor fixo
let cor = Array(5)


console.log(carro)
console.log(marcas)
console.log(acessorios)
console.log(categoria)
console.log(cor)

//adicionar um novo elemento no final da Array ->PUSH
carro.push('Logan')
console.log(carro)

//adicionar um novo elemento no inicio da Array ->UNSHIFT
carro.unshift('Compass')
console.log(carro)

//remover um elemento no final da Array -> POP
carro.pop()
console.log('pop: ' + carro)

//remover um elemento no inicio da Array -> SHIFT
carro.shift()
console.log('shift: ' + carro)

//remover um elemento através da sua posicação ->SPLICE
carro.splice(1, 1) // remove 1 elemento a partir do index 1
console.log('splice: ' + carro)


//remover um elementro através de um valor especifico-> FILTER
carro = carro.filter(f => f != 'HB20')
// tudo que for diferente de HB20 permanece
console.log('filter: ' + carro)


//substituir um elemento ->SPLICE
carro.splice(0, 1, 'Gol')
console.log('splice: ' + carro)

//convertendo um Array para uma String->JOIN
let texto = carro.join(';')
console.log('join: ' + texto)

//localizar um elemento na Array->FIND
let localiza = carro.find(x => x == 'GOL')
console.log('find: ' + localiza) // quando não localiza -> Undefined

localiza = carro.find(x => x == 'Gol')
console.log('find: ' + localiza) // quando localiza -> Retorna o valor procurado


//localizar um elemento na Array->INCLUDES
let existe = carro.includes('Gol')
console.log('include: ' + existe) //quando localiza é TRUE, contrário é FALSE

//ordenar uma array em crescente (A-Z ou 0-N) ->SORT
carro.sort()
console.log('sort: ' + carro)

//ordenar uma array em decrescente (Z-A ou N-0) ->Reverse
carro.reverse()
console.log('reverse: ' + carro)

console.log(carro)

let numero =[1,2,3,4,5,6,7,8,9]
let dobra = numero.map(x=> x*2)
console.log(dobra)

//Array mesclada => com conteúdos de tipos diferentes
let mesclada = ['Ford','Ka', 123,true, null, false, {cor:'vermelho'}]
console.log(mesclada)

//Array de Objetos
let aluno = [
    {nome: 'Giovana', idade:22},
    {nome: 'Yago',idade:21},
    {nome: 'Tayna', idade:20}
]
console.log(aluno)

//Acesso direto com array simples
console.log(carro[1])
console.log(carro[2])
let veiculo = carro[3]
console.log(veiculo)

console.log(aluno[0])// recuperando o objeto por completo
console.log(aluno[0].nome)//recuperando o valor do atributo que esta dentro do objeto

//O tamanho do vetor é verificado com ->LENGHT
console.log('Qtd de carros: '+carro.length)

//Percorrendo uma Array
//for tradicional
for(let i=0; i< carro.length;i++){
    console.log(carro[i])
}
//forEach
for(let c of carro){
    console.log(c)
    
}
