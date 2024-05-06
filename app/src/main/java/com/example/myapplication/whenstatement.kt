package com.example.myapplication

fun main(args: Array<String>) {
    print("enter the hike number you want to go next week ")
    var numberdays :Int= readln().toInt()
    var hike:String
    when(numberdays)
    {
        1 -> hike = "champadevi jau timi vai"
        2 -> hike = "jamacho jau vai timi"
        3  -> hike = " timi manichud jau vai"
        else  ->hike = "you are not for hike"
    }
print (hike
)
}
