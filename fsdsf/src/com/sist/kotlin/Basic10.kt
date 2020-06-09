package com.sist.kotlin

interface A
{
	// interface는 항상  open 함수를 가지고 있음
	fun a()
}
interface B
{
	fun b()
}

open class C
{
	open fun c()
	{
		println("C:c() Call...")
	}
}

open class D
{
	// 수정 하지 않고 그대로 사용
	fun d(){
		println("D:d() Call...")
	}
}

// 단일 상속만 적용됨 --> 인터페이스는 다중 상속이 가능하지만 클래스는 단일 상속만 가능
/*
 	형식 : C++
 	개념 : java
 	
 	모바일 : flutter(아이폰+안드로이드)
 		=> 안드로이드(Java => Kotlin)
 		=> 아이폰(Object c=> swift)
 	OTT
 */
// 클래스 단일 상속 => 인터페이스 다중 상속
class E:C(),A,B
{
	override fun c() {
		println("E:c() Call")
	}
	override fun a() {
		println("E:a() Call")
	}
	override fun b() {
		println("E:b() Call")
	}
}

fun main(args:Array<String>){
	var a = E()
	a.a();
	a.b();
	a.c()
}

