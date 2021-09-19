import java.lang.Exception
import kotlin.random.Random

fun main(){
    var num = Random.nextInt(10)
    var firstNumber = 0
    var secondNumber = 0
    println("Enter your first number: ")
    try {
        firstNumber = readLine()!!.toInt()
    }catch (e: Exception){}

    println("Enter your second number: ")
    try {
        secondNumber = readLine()!!.toInt()
    }catch (e: Exception){}

    println("$firstNumber * X + $secondNumber = ${firstNumber * num + secondNumber}")
    println("What is X? >>")
    try {
        var answer = readLine()!!.toInt()
        when(answer){
            num -> print("You get it!")
            else -> print("Wrong answer ")
        }
    }catch (e: Exception){}
}