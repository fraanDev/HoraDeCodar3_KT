fun main(){
    var inRangeCounter : Int = 0
    var outRangeCounter : Int = 0
    var read : Double = 0.0

    for(i in 0..9){
        print("Digite um número: ")
        read = readln().toDouble()
        if(read in 24.0..42.0) inRangeCounter++
        else outRangeCounter++
    }

    println("$inRangeCounter estavam dentro do valor e $outRangeCounter estavam fora")
}