fun main() {

    println("JO")
    Thread.sleep(900)
    Thread.sleep(900)
    println("KEN")
    Thread.sleep(900)
    println("PO")
    Thread.sleep(800)
    println("----------------------------")
    println("1.Pedra | 2.Papel | 3.tesoura")
    print("Digite a opcão desejada: ")

    val jogador: Int = readLine()!!.toInt()

    // logica do jogador

    when (jogador) {
        1 -> {
            println("----------------------------")
            println("Jogador escolheu pedra")
        }
        2 -> {
            println("----------------------------")
            println("Jogador escolheu papel")
        }
        3 -> {
            println("----------------------------")
            println("Jogador escolheu tesoura")
        }
        else -> {
            println("----------------------------")
            println("ERROR KOTLIN")
        }
    }

    // logica do computador
    val computador: Int = (Math.random() * 3 + 1).toInt()
    when (computador) {
        1 -> {
            println("----------------------------")
            println("computador escolheu pedra")
        }
        2 -> {
            println("----------------------------")
            println("computador escolheu papel")
        }
        3 -> {
            println("----------------------------")
            println("computador escolheu tesoura")
        }
    }

    // logica para determinar o vencedor

    if (jogador == computador) {
        println("----------------------------")
        println("empate")
    } else if (
        (jogador == 1 && computador == 3) ||
        (jogador == 2 && computador == 1) ||
        (jogador == 3 && computador == 2)
    ) {
        println("----------------------------")
        println("jogador venceu")
    } else {
        println("----------------------------")
        println("computador venceu")
    }
}
