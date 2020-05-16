@Suppress("UNUSED_CHANGED_VALUE")
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
                if (j <= 6 - k || j >= 4 + k)
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
                if ((i == j) || (i + j == 10))
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
                if ((i == 5) || (j == 5))
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
                if (j >= 6 - i && j <= 10 - i)
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
                if (j >= i && j <= 4 + i)
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
                if (i == 1)
                    print("* ")
                else if (j == i || j == 4 + i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

    //11/5/20
    //Square number patterns

    fun numberPattern1() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                print("1 ")
            }
            println()
        }
    }

    fun numberPattern2() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i % 2 == 1)
                    print("1 ")
                else
                    print("0 ")
            }
            println()
        }
    }

    fun numberPattern3() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j % 2 == 0)
                    print("1 ")
                else
                    print("0 ")
            }
            println()
        }
    }

    fun numberPattern4() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i == 1 || j == 1 || i == 5 || j == 5)
                    print("1 ")
                else
                    print("0 ")
            }
            println()
        }
    }

    //12/5/20
    fun numberPattern6() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j % 2 == 1)
                    print("1 ")
                else
                    print("0 ")
            }
            println()
        }
    }

    fun numberPattern5() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if ((i == 1 || i == 2 || i == 5 || i == 4) || (j == 1 || j == 2 || j == 4 || j == 5))
                    print("1 ")
                else
                    print("0 ")
            }
            println()
        }
    }

    fun numberPattern7() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                when {
                    j == 3 -> print("0 ")
                    i == 1 || i == 2 || i == 5 || i == 4 -> print("1 ")
                    else -> print("0 ")
                }
            }
            println()
        }
    }

    fun numberPattern8() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if (i == j || j == 6 - i)
                    print("1 ")
                else
                    print("0 ")
            }
            println()
        }
    }

    fun numberPattern9() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                if ((i == 1 || i == 5) && (j == 1 || j == 5))
                    print("0 ")
                else if ((i == 1 || i == 5) || (j == 1 || j == 5))
                    print("1 ")
                else
                    print("0 ")


            }
            println()
        }
    }

    fun numberPattern10() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                print("$i ")
            }
            println()
        }
    }

    fun numberPattern11() {
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                print("$j ")
            }
            println()
        }
    }

    fun numberPattern12() {
        val rows = 5
        val column = 5

        for (i in 1..rows) {
            for (j in 1..column) {
                print("${(i - 1) + j} ")
                print(" ")
            }
            println()
        }
    }

    fun numberPattern13() {
        val rows = 5
        val column = 5
        var a = 1
        for (i in 1..rows) {
            for (j in 1..column) {
                print("$a ")
                a++
                print(" ")
            }
            println()
        }
    }

    fun numberPattern14() {//not
        val rows = 5
        val column = 5
        for (i in 1..rows) {
            for (j in 1..column) {
                print("${rows - j + 1} ")
            }
            println()
        }
    }

    //15:5:20
    fun numberPatternMY1() {
        val rows = 7
        val column = 7
        var k: Int
        for (i in 1..rows) {
            k = 7 - i
            for (j in 1..column) {
                if (j <= 8 - i) {
                    print("$k ")
                    k--
                } else
                    print(" ")
            }
            println()
        }
    }

    fun numberPatternMY2() {
        val rows = 9
        val column = 5
        var k = 0
        var x: Int
        for (i in 1..rows) {
            if (i <= 5) k++ else k--
            x = 1
            for (j in 1..column) {
                if (j >= 6 - k) {
                    print("$x ")
                    x++
                } else
                    print("  ")
            }
            println()
        }
    }

    //16:5:20
    fun numberPatternMY3() {
        val rows = 6
        val column = 6
        var k: Int
        for (i in 1..rows) {
            k = 1
            for (j in 1..column) {
                if (j <= i) {
                    print("$k ")
                    k = 1 - k

                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPatternMY4() {
        val rows = 4
        val column = 7
        var k: Int
        for (i in 1..rows) {
            k = i
            for (j in 1..column) {
                if (j >= 5 - i && j <= 3 + i) {
                    print("$k ")
                    if (j < 4) k-- else k++
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPatternMY5() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 0
            for (j in 1..column) {
                if (j <= i) {
                    print("$k ")
                    k = k + i - 1
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern20() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = i
            for (j in 1..column) {
                if (j <= i) {
                    print("$k ")
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern21() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 6 - i
            for (j in 1..column) {

                if (j <= 6 - i) {
                    print("$k ")

                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern22() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = i
            for (j in 1..column) {

                if (j <= 6 - i) {
                    print("$k ")

                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern23() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 6 - i
            for (j in 1..column) {
                if (j <= i) {
                    print("$k ")
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern24() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 1
            for (j in 1..column) {
                if (j <= i) {
                    print("$k ")
                    k++
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern25() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 1
            for (j in 1..column) {
                if (j <= 6 - i) {
                    print("$k ")
                    k++
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern26() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = i
            for (j in 1..column) {
                if (j <= i) {
                    print("$k ")
                    k--
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern27() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 6 - i
            for (j in 1..column) {
                if (j <= 6 - i) {
                    print("$k ")
                    k--
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern28() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {

            for (j in 1..column) {
                k = 6 - j
                if (j <= i) {
                    print("$k ")

                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern29() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            for (j in 1..column) {
                k = 6 - j
                if (j <= 6 - i) {
                    print("$k ")

                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern30() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 6 - i
            for (j in 1..column) {

                if (j <= i) {
                    print("$k ")
                    k++
                } else
                    print("  ")
            }
            println()
        }
    }

    fun numberPattern31() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = i
            for (j in 1..column) {

                if (j <= 6 - i) {
                    print("$k ")
                    k++
                } else
                    print("  ")
            }
            println()
        }
    }
    fun numberPattern32() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = i
            for (j in 1..column) {

                if (j <= i) {
                    print("$k ")
                    k++
                } else
                    print("  ")
            }
            println()
        }
    }
    fun numberPattern33() {
        val rows = 5
        val column = 5
        var k: Int
        for (i in 1..rows) {
            k = 6 - i
            for (j in 1..column) {

                if (j <= 6 - i) {
                    print("$k ")
                    k++
                } else
                    print("  ")
            }
            println()
        }
    }


}

class HeartStarPattern {

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

    fun heartS2StarPattern() {
        val rows = 10
        val column = 19
        for (i in 1..rows) {
            for (j in 1..column) {
                if (j >= 0 + i && j <= 20 - i)
                    print("* ")
                else
                    print("  ")
            }
            println()
        }
    }

}