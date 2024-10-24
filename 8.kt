fun main() {
    // Lê um valor N do usuário
    println("Informe um valor N (maior que ZERO):")
    val n = readLine()?.toIntOrNull()

    // Verifica se N é válido
    if (n != null && n > 0) {
        println("Os valores inteiros entre 1 e $n são:")
        for (i in 1..n) {
            println(i) // Imprime cada valor de 1 até N
        }
    } else {
        println("Valor inválido! Por favor, insira um número maior que ZERO.")
    }
}
