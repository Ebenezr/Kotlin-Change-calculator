import kotlin.math.floor
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val changeDue = 15.96
    pennies(nickels(dimes(quarters(dollars(changeDue)))))
}
fun dollars(myChange: Double): Double{
    val dollars = floor(myChange / 1.0)
    val changeDue0 = myChange - (dollars * 1.00)
    print((dollars * 1).roundToInt() / 1)
    if (dollars >= 2)
        println(" Dollars")
    else if (dollars < 2)
        println(" Dollar")
    return changeDue0
}

fun quarters(myChange: Double): Double{
    val quarters = floor(myChange / 0.25)
    val changeDue1 = myChange - (quarters * 0.25)
    print((quarters * 4).roundToInt() / 4)
    if (quarters >= 2)
        println(" Quarters")
    else if (quarters < 2)
        println(" Quarter")
    return changeDue1
}
fun dimes(myChange: Double): Double{
    val dimes = floor(myChange / 0.10)
    val changeDue2 = myChange - (dimes * 0.10)
    print((dimes * 10).roundToInt() / 10)
    if (dimes >= 2)
        println(" Dimes")
    else if (dimes < 2)
        println(" Dime")
    return changeDue2
}
fun nickels(myChange: Double): Double{
    val nickels = floor(myChange / 0.05)
    val changeDue3 = myChange - (nickels * 0.05)
    print((nickels * 20).roundToInt() / 20)
    if (nickels >= 2)
        println(" Nickels")
    else if (nickels < 2)
        println(" Nickel")
    return changeDue3
    }
fun pennies(myChange: Double){
    val penny = floor(myChange * 100);
    print((penny * 100).roundToInt() / 100)
    if (penny >= 2)
        println(" Pennies")
    else if (penny < 2)
        println(" Penny")
    }