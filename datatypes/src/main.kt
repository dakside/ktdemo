import org.dakside.ValueException
import org.dakside.convertCtoF
import org.dakside.convertFtoC

val CONVERT_TYPE = arrayOf("C", "F")
fun main(args: Array<String>) {
    while (true) {
        print("What to convert (C or F, enter nothing to exit)? ")
        val mode = readLine()!!.toUpperCase()
        if (CONVERT_TYPE.contains(mode)) {
            print("Enter ${mode}: ")
            val numString = readLine()!!
            try {
                val number = numString.toDouble()
                val answerMode = if (mode == "C") "F" else "C"
                val answer = if (mode == "C") convertCtoF(number) else convertFtoC(number)
                println("$number ${mode} = $answer $answerMode")
            } catch (ve: ValueException) {
                println("$numString is too small, not valid.")
            } catch (e: Exception) {
                println("$numString is not a number.")
            }
        }
        else if (mode == ""){
            println("Bye!")
            break
        }
        else{
            println("$mode is an invalid mode")
        }
    }
}