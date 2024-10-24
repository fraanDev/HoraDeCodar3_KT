fun main() {
    // Lê o primeiro valor inteiro
    print("Informe o primeiro valor inteiro: ")
    val valor1 = readLine()?.toInt() // Lê e tenta converter para Int

    // Inicializa o segundo valor
    var valor2: Int?

    // Loop para garantir que o segundo valor seja maior que zero
    do {
        print("Informe o segundo valor inteiro (maior que zero): ")
        valor2 = readLine()?.toInt() // Lê e tenta converter para Int

        // Verifica se o valor2 é maior que zero
        if (valor2 != null && valor2 <= 0) {
            println("Valor inválido! O segundo valor deve ser maior que zero.")
        }
    } while (valor2 == null || valor2 <= 0) // Repete até que valor2 seja válido

    // Calcula e imprime o resultado da divisão
    val resultado = valor1?.toDouble()!! / valor2!! // Converte valor1 para Double para evitar truncamento
    println("Resultado da divisão de $valor1 por $valor2 é: $resultado")
}
