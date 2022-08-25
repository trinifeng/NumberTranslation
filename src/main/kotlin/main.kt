fun main() {
    print("Enter a number between 1 and 10: ")
    var number = readln()!!.toInt()
    var frenchNumber: String = ""

    when(number){
        1 -> frenchNumber = "un"
        2 -> frenchNumber = "deux"
        3 -> frenchNumber = "trois"
        4 -> frenchNumber = "quatre"
        5 -> frenchNumber = "cinq"
        6 -> frenchNumber = "six"
        7 -> frenchNumber = "sept"
        8 -> frenchNumber = "huit"
        9 -> frenchNumber = "neuf"
        10 -> frenchNumber = "dix"
        else -> frenchNumber = "out of range- your number is not between 1 and 10"
    }

    println("$number in French is $frenchNumber.")
}