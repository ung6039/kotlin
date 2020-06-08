package com.sist.kotlin

/*
 	1) 정적 타입 지정 언어
 		var a:Int , var a = 10
 	2) 간결성, 실용성, 안정성  ==> 자바 ( JVM )
 	3) 상호운영성 	
*/
//import java.util.*;
// if, when(switch case) , for, while
//fun max(a:Int,b:Int):Int
//{	
//	var c:Int;
//	if(a>b)
//		c=a
//	else
//		c=b
//	return c;
//}
//fun max1(a:Int,b:Int):Int= if(a>b) a else b
//함수를 -> 변수와 같은 역할
//fun max2(a:Int,b:Int)= if(a>b) a else b
fun hakjum(ee:Int):Char
{
	var c:Char='A'
	if(ee>=90)
		c='A'
	else if(ee>=80)
		c='B'
	else if(ee>=70)
		c='C'
	else if(ee>=60)
		c='D'
	else
		c='F'
	return c;
}
fun main(args:Array<String>){
	var a =10
	var b =20
//	var c=max(a,b)
//	print("max=$c")
	
	var d = 30
	var e = 56
//	var k = max1(d,e)
//	println("max=$k")
	var score:Int = 80;
	var jumsu = hakjum(score)
	println("score=$score,jumsu=$jumsu 학점")
}
/*
 	fun 함수명 (매개변수...) ==> void 함수명(매개변수)
 	fun 함수명(매개변수.. ) : 데이터형 리턴형이 존재
 	
 	if 조건문
 	= if(조건)
 	= if(조건) ~ else
  	= if(조건)~ else if(조건) ~~~ else
 */









