package com.sist.kotlin

import java.util.*

class AA{
	// val�� ����̱� ������ �ʱⰪ�� �־���� :: �ʱⰪ���� null�� �ֱ� ���ؼ��� String? =null ?�� �Է��ؾ���
	val bb:String =""
	val a:String? =null
	// Ŭ���� ��ü�� ������ ������ �ʱⰪ�� null�� �־����
	val c:BB?=null
	val d:String =""
	
}

class BB
{
	
}

fun main(args:Array<String>){
	
	val a:String
	
	// >= ( '>'�� '='�� ���� ��쿡 '>='�� ���е��� ���� )
	println("--food--")
	val foods:List<String> = listOf("���","��","����")
	for(f in foods){
		println(f)
	}
	
	println("--food2--")
	val foods2 = mutableListOf("�޷�","���ξ���","���ø���")
	foods2.add("�θ���")
	foods2.removeAt(0)
	foods2[1] ="����丶��"
	for(f in foods2){
		println(f)
	}
	
	
}



