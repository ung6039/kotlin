package com.sist.kotlin

/*
 	코틀린에서 사용하는 데이터형
 		1) 숫자형
 			(대문자 시작)
 			정수형 : Byte(1byte ->8bit), Short(2byte-> 16bit) , Int(4byte-> 32bit),Long(8byte ->64bit)
 			실수형
 				Double(64bit)
 				Float(32bit)
 		2) 문자형
 			문자 : Char => '' 
 			문자열 : String => ""
 		3) 논리형
 			Boolean : true/false
 	변수 설정 방법
 		=> 상수 (값이 고정됨)
 			val
 		=> 변수 
 			var
 		ex) 자바
 			int a =10;
 			final int b =20;
 			================
 			kotlin
 			var a = 10;
 			var a:Int =10; ( 데이터형을 뒤에 표시해줄 수 있음 )
 			val b:Int =20;
 			val b = 20
 			var b = false;
 			var a = 10.5
 			코틀린 => front (javascript)
 			var, val ==> 자동 변환 변수
 		#### 배열
 		String[] names = {"","",""};
 		val numbers:Array<Int> = arrayOf(1,2,3,4,5)
 		=> numbers[0]....
 	연산자
 		산술연산자 (+,-,*,/,%)
 		논리연산자 ( && , || )
 		대입연산자 ( = )
 		비교연산자 ( ==, !=, <, >, <=, >=) 		
 	제어문 :
 	함수
 	클래스
 	인터페이스
 */

// 함수
// public static void main(String[] args) --> 자바 메인함수

fun main(args:Array<String>){

	val a:Int = 100
	var b = 200

	println("a=$a,b=$b")
	var s:String="Hello Kotlin"
	var cc ='A'
	var d = 10.5
	var dd = 10/5
	var bb =true
	var f:Float = 10.5f
	
	println("cc=$cc,s=$s,d=$d,dd=$dd,bb=$bb,f=$f")
	
}

