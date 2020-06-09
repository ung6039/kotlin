package com.sist.kotlin

fun main(args:Array<String>){
//	forTest1()
//	forTest2()
//	println("~~~~~")
	forTest3()
	println("--------------Test4 start")
	forTest4()
	println("!!!!Test2")
	forTest2()
	println("~~~Test5")
	forTest5()
}

// for
fun forTest1(){
	for(i in 1..10)
		println("i=$i")
}
// i<10 ==> until을 사용할 때
fun forTest2(){
	for(i in 1 until(10))
		println("i=$i")
}

fun forTest3(){
	for(i in 1..10 step 2)
		println("test3=$i")
}
fun forTest4(){
	for(i in 10 downTo(1))
		println("test4=$i")
}

///-- foreach

fun forTest5(){
	var names = arrayOf("홍길동","심청이","삼장법사","손오공","사오정","저팔계")
	for(item in names){
		println(item)
	}
			
}

