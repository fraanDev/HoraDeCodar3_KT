fun main(){
    var continueCalculator : String = "s"
    var grade1 : Double = 0.0
    var grade2 : Double = 0.0
    var finalGrade : Double = 0.0
    println("calculadora de média para aluno")

    while (continueCalculator == "s" || continueCalculator == "sim"){
        print("Digite a primeira nota: ")
        grade1 = readln().toDouble()

        print("Digite a segunda nota: ")
        grade2 = readln().toDouble()

        println("A média é " + ((grade1 + grade2) / 2) + " e ele foi " +
                if (((grade1 + grade2) / 2) > 9.5) "Aprovado" else "Reprovado")

        print("Calcular a média de outro aluno Sim/Não?\nResposta: ")
        continueCalculator = readln().lowercase()
    }
}


