package org.example.sudokuChecker


fun main() {





    val board = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        charArrayOf('6', '-', '-', '1', '-', '-', '-', '-', '-'),
        charArrayOf('-', '9', '-', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '-', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '6'),
        charArrayOf('-', '-', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '9')
    )



    println(isValidSudoku(board))
    println()

}


fun isValidSudokuInit(board: Array<CharArray>, subgridSize: Int = 3): Boolean {

    return false
}


fun isValidSudoku(board: Array<CharArray>, subgridSize: Int = 3): Boolean {

    val n = board.size
    val clues = mutableListOf<Char>()

    val boardSize = subgridSize * subgridSize
    // Verify board dimensions
    if (board.size != boardSize) return false
    for (row in board) {
        if (row.size != boardSize) return false
    }


    // Validate board characters
    for (row in board) {

        for (char in row) {
            if (char != '-' && (char < '1' || char > '9')) {
                return false
            } else if (char != '-') {
    //          get the number of clues
                clues.add(char)
            }
        }

    }


    // check that there are more than 17 clues at a 9*9 board
    if (subgridSize == 3) {
        if (clues.size<17) {
            return false
        }
    }


    fun isValidGroup(group: List<Char>): Boolean {
        val seen = mutableListOf<Char>()
        for (char in group) {
            if (char != '-' && char in seen) return false
            seen.add(char)
        }
        return true
    }

    // Check rows
    for (row in board) {
        if (!isValidGroup(row.toList())) return false
    }

    // Check columns
    for (col in 0 until n) {
        val column = List(n) { row ->
            board[row][col]

        }
        if (!isValidGroup(column)) return false
    }

    // Check subgrids
    for (startRow in 0 until n step subgridSize) {
        for (startCol in 0 until n step subgridSize) {
            val subgrid = mutableListOf<Char>()
            for (i in 0 until subgridSize) {
                for (j in 0 until subgridSize) {
                    subgrid.add(board[startRow + i][startCol + j])
                }
            }
            if (!isValidGroup(subgrid)) return false
        }
    }

    return true
}


//5 3 - | - 7 - | - - -
//6 - - | 1 9 5 | - - -
//- 9 8 | - - - | - 6 -
//---------------------
//8 - - | - 6 - | - - 3
//4 - - | 8 - 3 | - - 1
//7 - - | - 2 - | - - 6
//---------------------
//- 6 - | - - - | 2 8 -
//- - - | 4 1 9 | - - 5
//- - - | - 8 - | - 7 9