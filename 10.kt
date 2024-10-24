fun main() {
    // Lê um valor N do usuário
    println("Informe um valor N (maior que ZERO):")
    val n = readLine()?.toIntOrNull()

    // Verifica se N é válido
    if (n != null && n > 0) {
        // Loop para imprimir as tabuadas de 1 até N
        for (i in 1..n) {
            println("Tabuada do $i:")
            for (j in 1..10) {
                println("$i x $j = ${i * j}") // Imprime cada linha da tabuada
            }
            println() // Linha em branco para melhor formatação
        }
    } else {
        println("Valor inválido! Por favor, insira um número maior que ZERO.")
    }
}
