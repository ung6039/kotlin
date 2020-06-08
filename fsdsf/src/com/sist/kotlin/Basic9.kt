package com.sist.kotlin

// interface는 자동 open함수들임
interface Runable{
	fun run()
	
	// default :: 구현 할 수 있도 있고 않할 수 도 있는 함수
	// java에서도 default를 삽입해서 구현하지 않는 함수를 구분할 수 있도록 처리
	fun test(){
		println("Runable test() Call...")
	}
}
class Human2:Runable{
	override fun run(){
		println("Human2:Run() Call")
	}
}

class Human:Runable{

	override fun run(){
		println("Human:run() Call");
	}	
}

fun main(args:Array<String>){
	var h=Human();
	h.run()
	h.test()
	
}