package Atividades.atividadeClass1

fun main(){
    println("Bem Vindo Castle Noble")
    val p : Personagem = Personagem("", 100, 100, 25)
    val i : Inimigo = Inimigo(100, 100, 10)
    val Pp : Porcao = Porcao(3)
    println("Escreva o nome do seu personagem: ")
    p.nome = readln()

    repeat(100) {println("")}

    println("Fase Final")
    while (i.vida > 0 && p.vida > 0){

        println("\nESCOLHA O QUE QUER FAZER:\n")
        println("Ataque[1]")
        println("Porcao[2]\n")

        println("Personagem")
        println("nome: ${p.nome}")
        println("vida: ${p.vida}")
        println("dano: ${p.dano}\n")

        println("Inimigo")
        println("vida: ${i.vida}")
        println("dano: ${i.dano}\n")

        var escolha = readln().toInt()
        when(escolha){
            1 -> p.ataque(i)
            2 -> {
                if(p.vida <= 90)
                    p.usarPorcao(Pp)
                else{ println("voce não pode usar porcao, entao clique enter para atacar")
                    p.ataque(i)
                    readLine()
                }
            }
        }
        println("Quantidade de porcao ${Pp.quantidade}")
        i.ataque(p)

        repeat(100) {println("")}
    }
    if(p.vida <= 0)
        println("DERROTA")
    else println("VITORIA")
}
public class Personagem(var nome: String, val vidaMax: Int, var vida: Int, val dano: Int) {
    fun ataque(inimigo: Inimigo) {
        inimigo.vida -= dano
    }
    fun usarPorcao(porcao: Porcao) {
        if (porcao.quantidade <= 0) {
            return
        }
        vida += 20
        porcao.quantidade--
    }
}
public class Inimigo(var vidaMax: Int, var vida: Int, var dano: Int){
    fun ataque(personagem: Personagem) { personagem.vida -= dano }
}
public class Porcao(var quantidade: Int)