fun main() {
    // Loop para imprimir os números de 10 a 1
    for (i in 10 downTo 1) {
        print("$i") // Imprime o número atual

        // Verifica se não é o último número para adicionar uma vírgula
        if (i > 1) {
            print(", ") // Adiciona vírgula e espaço
        }
    }
}
