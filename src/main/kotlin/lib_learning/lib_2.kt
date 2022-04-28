package lib_learning

//2_19 関数の利用 のサンプルソース
fun list2_19(){

    hello("Taichi")
    hello("Hiroko")
}

//list2_19で呼び出される関数
fun hello(name:String){
    println("hello, " + name + "!!")
}

//戻り値のある関数　サンプルソース
fun List2_20(){
    val list = arrayOf(1000,2500,4780)
    val totalA = list[0] + list[1] + list [2]
    val totalB = tax_cal(list[0]) + tax_cal(list[1]) + tax_cal(list[2])
    println("total:" + totalA + " with tax: " + totalB)
}

//List2_20で呼び出される関数
fun tax_cal(price:Int):Int{
    return (price * 1.1).toInt()
}

//関数は値　サンプルソース
