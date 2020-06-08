package com.sist.kotlin

interface A
{
	// interface�� �׻�  open �Լ��� ������ ����
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
	// ���� ���� �ʰ� �״�� ���
	fun d(){
		println("D:d() Call...")
	}
}

// ���� ��Ӹ� ����� --> �������̽��� ���� ����� ���������� Ŭ������ ���� ��Ӹ� ����
/*
 	���� : C++
 	���� : java
 	
 	����� : flutter(������+�ȵ���̵�)
 		=> �ȵ���̵�(Java => Kotlin)
 		=> ������(Object c=> swift)
 	OTT
 */
// Ŭ���� ���� ��� => �������̽� ���� ���
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

