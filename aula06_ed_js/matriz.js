//criando uma Matriz com []

let matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
console.log(matriz)

//acessando uma Matriz diretamente
console.log(matriz[0][0])
console.log(matriz[0][1])
console.log(matriz[0][2])

//percorrendo uma Matriz com 2 FOR
//1º FOR -> LINHA
//2º FOR -> COLUNA

for (let l = 0; l < matriz.length; l++) {
    for (c = 0; c < matriz[l].length; c++) {
        console.log(matriz[l][c])
    }
}
//percorrenco uma Matriz com ForEach

// matriz.forEach((linha, i)=>{
//     linha.forEach((coluna, valor)=>{
//         console.log(valor)
//     })
// })
console.log('foreach')
matriz.forEach(linha => {
    linha.forEach(valor => {
        console.log(valor)
    })
})