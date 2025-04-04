package sudokuChecker


fun main(){

    check(
        name = "when board has invalid dimensions it should return false",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5')
        )),
        correctResult = false
    )


    check(
        name = "when board has less than 17 clues, it should return false",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '-', '-', '-', '-', '-'),
            charArrayOf('-', '9', '-', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '-', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '-', '-', '-', '-', '-', '-'),
            charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '6'),
            charArrayOf('-', '-', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '-', '-', '-', '-'),
            charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '9')
        )),
        correctResult = false
    )

    check(
        name = "when board contains non-digit characters, it should return false",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', 'a', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )




    check(
        name = "when board contains numbers less than 1 or greater than 9, it should return false",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('0', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )

    check(
        name = "when board is a valid and complete sudoku, it should return true",
        result = isValidSudoku(board = arrayOf(
                charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )),
        correctResult = true
    )

    check(
        name = "when board is a valid and incomplete sudoku, it should return true",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = true
    )

    check(
        name = "when board has duplicate in a row, it should return false",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', '3', '5', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )

    check(
        name = "when board has duplicate in a column, it should return false",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('5', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )

    check(
        name = "when board has duplicate in a subgrid, it should return false",
        result = isValidSudoku(board = arrayOf(
            charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
            charArrayOf('6', '5', '-', '1', '9', '5', '-', '-', '-'),
            charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
            charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
            charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
            charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
            charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
            charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
            charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
        )),
        correctResult = false
    )



}

fun check(name:String,result: Boolean,correctResult:Boolean) {
    if (result == correctResult){
        println("Success - $name")
    }else{
        println("Failed - $name")
    }
}