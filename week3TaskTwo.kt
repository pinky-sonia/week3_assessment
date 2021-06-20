fun main(){
    var str: String = "Good Food"
    revStr(str)
}

fun revStr(str: String){
    var chars = CharArray(str.length)
    str.indices.forEach{
        chars[str.length - it - 1] = str[it]
    }
    println (chars)
}