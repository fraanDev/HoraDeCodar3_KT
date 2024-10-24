fun main() {
    var soma = 0 // Inicializa a variável para armazenar a soma
    val quantidade = 100 - 15 + 1 // Total de números entre 15 e 100 (inclusive)

    // Loop para somar os números de 15 a 100
    for (i in 15..100) {
        soma += i // Adiciona o número atual à soma
    }

    // Calcula a média aritmética
    val media = soma.toDouble() / quantidade // Converte a soma para Double para evitar truncamento

    // Exibe o resultado
    println("A média aritmética dos números inteiros entre 15 e 100 é: $media")
}
