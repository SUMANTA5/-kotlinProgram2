class Myclas {

    //StarPattern
    fun mirroredHalfDiamondStarPattern() {
        val rows = 9
        val column = 5
        var k = 0
        for (i in 1..rows) {
            if (i <= 5) k++ else k--
            for (j in 1..column) {
                if (j >=6-k)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

}