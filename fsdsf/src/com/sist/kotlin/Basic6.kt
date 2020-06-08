package com.sist.kotlin
// 코틀린 => 자바의 라이브러리를 필요시마다 사용이 가능하다.
import java.util.*;
// java 처럼 (Int)를 사용한 형변환은 사용할 수 없음
// com = temp.toInt()를 사용해서 변환해야함
// toDouble(), toString()
/*
 	함수
 	= 리턴형이 있는 경우
 		fun 함수명(매개변수...):데이터형 {} =>  ():Int , ():String, ():Array
 	= 리턴형이 없는 경우
 		fun 함수명(매개변수...){} => void
 		
 */
fun main(args:Array<String>){
	var temp=(Math.random()*100)+1
	var com = temp.toInt()
	println("랜덤 = $com")
	
	var scan = Scanner(System.`in`);
	while(true){
		print("1~100까지의 정수를 입력하시오 :")
		var i=scan.nextInt();
		if(i<0 || i>100){
			println("1~100사이의 정수를 입력해라 ")
			continue;
		}
		if(i<com){
			println("입력값보다 큰값을 입력하시오")
		}
		else if(i>com){
			println("입력값보다 작은 값을 입력하시오")
		}
		else{
			println("Game Over!!")
			break;
		}
	}
}