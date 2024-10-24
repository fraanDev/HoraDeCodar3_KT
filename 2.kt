fun main() {
    // Contagem regressiva de 30 a 0
    for (i in 30 downTo 0) {
        println(i) // Imprime o número atual da contagem
        Thread.sleep(1000) // Pausa por 1 segundo (1000 milissegundos)
    }
    println("EXPLOSÃO") // Mensagem final
}
