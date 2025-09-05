package function

fun main(){
    println(altaordem(3, 4, fun(a: Int, b: Int): Int{return a + b}))
}
fun altaordem(x: Int, y: Int, ordem: (Int, Int) -> Int) = ordem(x,y)