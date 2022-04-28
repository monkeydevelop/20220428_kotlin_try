package lib_learning

//2_19 関数の利用 のサンプルソース
fun list2_19(){
    println("List2_19:関数の利用")
    hello("Taichi")
    hello("Hiroko")
}

//list2_19で呼び出される関数
fun hello(name:String){
    println("hello, " + name + "!!")
}

//戻り値のある関数　サンプルソース
fun List2_20(){
    println("List2_20：戻り値のある関数")
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
fun List2_21(){
    println("List2_21：関数は値")
    val list2 = arrayOf(1000,2500,4780)
    val totalA = list2[0] + list2[1] + list2[2]
    val totalB = tax_cal2(list2[0])+ tax_cal2(list2[1]) + tax_cal2(list2[2])
    println("total: " + totalA + ", with Tax: " +totalB)
    println(tax_cal2)
}

val tax_cal2 = fun(price:Int):Int{
    return (price * 1.1).toInt()
}

//名前付き引数とデフォルト値
fun List2_22(){
    println("List2_22:名前付き引数とデフォルト値")
    val price =12500
    val priceA = tax_cal3(price)
    val priceB = tax_cal3(price,15)
    val priceC = tax_cal3(rate=20, price=price)
    println("price: " + price + ", 10%: " + priceA + ", 15%: " + priceB + ", 20%: " + priceC)
}

fun tax_cal3(price:Int, rate:Int = 10):Int{
    return (price *((100.0 +rate) / 100.0)).toInt()
}