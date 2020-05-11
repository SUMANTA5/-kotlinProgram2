class Myclass {

    //StarPattern
    fun mirroredHalfDiamondStarPattern() {
        val rows = 9
        val column = 5
        var k = 0
        for (i in 1..rows) {
            if (i <= 5) k++ else k--
            for (j in 1..column) {
                if (j >= 6 - k)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun diamondStarPattern() {
        val rows = 9
        val column = 9
        var k = 0
        for (i in 1..rows) {
            if (i <= 5) k++ else k--
            for (j in 1..column) {
                if (j >= 6 - k && j <= 4 + k)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun hollowDiamondStarPattern() {
        val rows = 9
        val column = 9
        var k = 0
        for (i in 1..rows) {
            if (i < 6) k++ else k--
            for (j in 1..column) {
                if (j<=6-k||j>=4+k)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun xStarPattern() {
        val rows = 9
        val column = 9
        var k = 0
        for (i in 1..rows) {
            for (j in 1..column) {
                if ((i==j)||(i+j==10))
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun plusStarPattern() {
        val rows = 9
        val column = 9
        var k = 0
        for (i in 1..rows) {
            for (j in 1..column) {
                if ((i==5)||(j==5))
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun rhombusStarPattern() {
        val rows = 5
        val column = 9
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j>=6-i&&j<=10-i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun mirroredRhombusStarPattern() {
        val rows = 5
        val column = 9
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j>=i&&j<=4+i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun hollowMirroredRhombusStarPattern() {
        val rows = 5
        val column = 9
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j==i||j==4+i||i==1||i==5)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }














}
class HeartStarPattern{

    fun heartS1StarPattern() {
        val rows = 4
        val column = 19
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j >= 4 - i && j <= 6 + i || j >= 14 - i && j <= 16 + i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }
    fun heartS2StarPattern(){
        val rows = 10
        val column = 19
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j >= 0 + i && j <= 20 - i )
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

}