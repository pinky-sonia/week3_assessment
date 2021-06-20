fun main(){
    var num: Int = 1
    while(num <= 100){
        if(num % 3 == 0 && num % 5 == 0){
            println("FizzBuzz")
        }else if(num % 3 == 0){
            println("Fizz")
        }else if(num % 5 == 0){
            println("Buzz")
        }
        else{
            println(num)
        }

        num++
    }
}