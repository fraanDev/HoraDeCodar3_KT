fun main() {
    val totalNotas = 6 // Número total de notas
    var soma = 0.0 // Inicializa a soma das notas
    var notasLidas = 0 // Inicializa a contagem de notas lidas

    while (notasLidas < totalNotas) {
        println("Informe a nota ${notasLidas + 1} (de 0 a 10):")
        val nota = readLine()?.toDoubleOrNull() // Lê a nota e tenta convertê-la para Double

        // Verifica se a nota é válida
        if (nota != null && nota in 0.0..10.0) {
            soma += nota // Adiciona a nota à soma
            notasLidas++ // Incrementa a contagem de notas lidas
        } else {
            println("Nota inválida! Por favor, insira um valor entre 0 e 10.")
        }
    }

    // Calcula a média
    val media = soma / totalNotas

    // Exibe a média final
    println("A média das notas do aluno é: $media")
}

