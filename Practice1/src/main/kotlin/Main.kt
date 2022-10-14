import kotlin.concurrent.fixedRateTimer
import kotlin.math.sqrt

fun main(args: Array<String>) {

    //1
    val exercises=13
    var exercisesSolved=0
    exercisesSolved++
    //2
    val constOLD:Int //константа означает возраст
    exercisesSolved++
    //3
    var  nachOLD:Double=17.8
    //val  nachOLD:Double=(constOLD+30)/2
    // var nachOLD:Double=23.9
    nachOLD=23.9
    exercisesSolved++
    //4

    val testNumber:Int=5
    val evenOdd:Double= 5.0
    //val testNumber:Int=6
    exercisesSolved++
    //5
    var answer:Int=0
    answer++
    answer+10
    answer*10
    answer shr 3
    println("answer="+ answer)
    exercisesSolved++
    //6
    var age:Int
   // будете использовать ключевое слово var - переменная
    exercisesSolved++
     //7
    val a:Int = 46
    val b:Int = 10
    val answer1:Int =(a*100)+b
    val answer2:Int =(a*100)+(b*100)
    val answer3:Int =(a*100)+(b/10)
println("answer1 = "+answer)
    println("answer2 = "+answer)
    println("answer3 = "+answer)
    exercisesSolved++
    //8

    ((5*3)-(4/(2*2)))
    exercisesSolved++
    //9
    val average:Double
var a1 :Double=4.6  // a and b seen before
var b1 :Double=7.3
    average=(a1+b1)/2
    println("average="+average)
    exercisesSolved++

    //10
    val fahrenheit:Double=133.3
    val celcius:Double
    celcius=(fahrenheit-32)/1.8
    println("celcius = "+celcius)
    exercisesSolved++

    //11
    val position:Int = 45
   var x:Int=1//шаг
    var y:Int=0//столбец
    var z:Int=0//строкa
val coordinates: Pair<Int,Int> = Pair(7, 7)
    val row = coordinates.first
    val column= coordinates.second
    while (x<45)
    {
         y++
        x++
        if (y>7)
        {
            z++
            y = 0

        }
    }
   // y=column
   // z=row
    println(y)
    println(z)
    exercisesSolved++

    //12

    val degrees:Double=180.0


    //13

val x1:Double= 3.4
val y1:Double=6.7
val x2:Double=7.3
val y2:Double=2.1

   val distance:Double
    distance =  sqrt(((х1 – х2)* 2) + ((у1 – у2) *2))

   //


    println("кол-во решенных="+exercisesSolved)
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}