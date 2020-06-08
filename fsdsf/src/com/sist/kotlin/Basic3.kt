package com.sist.kotlin

// switch => when
fun main(args:Array<String>){
	var c = sexCheck(1)
	println("성별 =$c")
	var i = 3;
	numberSelect(i)
}
fun sexCheck(sex:Int):String{
	var s:String=" "
	when(sex){
		1->s="남성"
		2->s="여성"
		3->s="남성"
		4->s="여성"
	}
	return s;
}

fun numberSelect(a:Int)
{
	when(a){
		1->println("1을 선택함..")
		2,3->println("2와 3을 선택..")
		in 4..7->println("4~7까지 선택됨")
		// 4,5,6,7 => 4..7 => 1..10
		8,9->println("8,9 선택됨..")
//		in 10,20,90...95-> print("ddd")
		!in 1..7-> println("NoNoNo")
	}
}

