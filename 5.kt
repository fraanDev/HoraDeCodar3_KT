fun main() {
    // Leitura dos dois números inteiros
    print("Informe o primeiro número inteiro (menor): ")
    val num1 = readLine()?.toIntOrNull() ?: return println("Valor inválido!")

    print("Informe o segundo número inteiro (maior): ")
    val num2 = readLine()?.toIntOrNull() ?: return println("Valor inválido!")

    // Verifica se o primeiro número é menor que o segundo
    if (num1 >= num2) {
        println("O primeiro número deve ser menor que o segundo.")
        return
    }

    var soma = 0 // Inicializa a variável para armazenar a soma
    var quantidade = 0 // Inicializa a variável para contar os números

    // Loop para somar os números entre num1 e num2 (inclusive)
    for (i in num1..num2) {
        soma += i // Adiciona o número atual à soma
        quantidade++ // Conta o número atual
    }

    // Calcula a média aritmética
    val media = soma.toDouble() / quantidade // Converte a soma para Double para evitar truncamento

    // Exibe o resultado
    println("A média aritmética dos números entre $num1 e $num2 é: $media")
}
