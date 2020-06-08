package com.sist.kotlin

import java.util.*

class AA{
	// val는 상수이기 때문에 초기값을 주어야함 :: 초기값으로 null을 주기 위해서는 String? =null ?를 입력해야함
	val bb:String =""
	val a:String? =null
	// 클래스 객체를 가져올 때에는 초기값은 null을 주어야함
	val c:BB?=null
	val d:String =""
	
}

class BB
{
	
}

fun main(args:Array<String>){
	
	val a:String
	
	// >= ( '>'과 '='이 붙을 경우에 '>='와 구분되지 못함 )
	println("--food--")
	val foods:List<String> = listOf("사과","배","딸기")
	for(f in foods){
		println(f)
	}
	
	println("--food2--")
	val foods2 = mutableListOf("메론","파인애플","애플망고")
	foods2.add("두리안")
	foods2.removeAt(0)
	foods2[1] ="방울토마토"
	for(f in foods2){
		println(f)
	}
	
	
}



