//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    val yes: Boolean = true // better practice, code more readable
    val no = false
    val alsoTrue = !(1 == 2) // evaluates to not false or true

    println("alsoTrue = $alsoTrue")

    val andTrue = 1 < 2 && 4 > 3 // both true
    println("andTrue = $andTrue") // true
    val andFalse = 1 < 2 && 3 > 4 // one true one false
    println("andFalse = $andFalse") // false
    val orTrue = 1 < 2 || 3 > 4 //one true one false
    println("orTrue = $orTrue") // true
    val orFalse = 1 == 2 || 3 == 4 // both false
    println("orFalse = $orFalse") // false

    var sum: Int = 1

    while (true) {
        sum = sum + (sum + 1)
        println("sum = $sum")
        if (sum >= 100) {
            break
        }
    }
    val count = 10

    var total: Int = 0
    for (i in 1..count) {
        total += i // equivalent to total = total + i
        println("total = $total")
    }

    println("Final total = $total")

printMyName("Daffy Duck")
printMyName()

println(fullName("Daffy", "Duck"))
    var result: Int? = 30
    println(result)

    var nullableResult: Int?
    var nonNullableResult: Int = 0

    if (result != null)
    {
        nonNullableResult = result
    }
    else
    {
        nullableResult = result
    }

    println(nonNullableResult + 1)

    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24

    var nonNullableAuthor: String
    var nullableAuthor: String?

    if (authorName != null) {
        nonNullableAuthor = authorName
    } else {
        nullableAuthor = authorName
    }

    var nameLength = authorName?.length
    println("Author's name has length $nameLength.")
// > Author's name has length 10.

    val nameLengthPlus5 = authorName?.length?.plus(5)
    println("Author's name length plus 5 is $nameLengthPlus5.")
// > Author's name length plus 5 is 15.

    authorName?.let {
        nonNullableAuthor = authorName
    }

    authorName?.let {
        nameLength = authorName.length
    }

    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0

    println(mustHaveResult)

}

fun printMyName(name: String = "Bugs Bunny") {
    println("My name is $name.")
}

fun fullName(firstName: String = "Bugs", lastName: String = "Bunny"): String
{
    return firstName + " " +  lastName
}

