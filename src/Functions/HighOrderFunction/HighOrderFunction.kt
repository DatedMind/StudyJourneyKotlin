package Functions.HighOrderFunction

fun main(){
    println(altaordem(3, 4, ::soma))
}

fun soma(a: Int, b: Int) = a + b
fun altaordem(x: Int, y: Int, ordem: (Int, Int) -> Int) = ordem(x,y)