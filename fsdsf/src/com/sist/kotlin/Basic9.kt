package com.sist.kotlin

// interface�� �ڵ� open�Լ�����
interface Runable{
	fun run()
	
	// default :: ���� �� �� �ֵ� �ְ� ���� �� �� �ִ� �Լ�
	// java������ default�� �����ؼ� �������� �ʴ� �Լ��� ������ �� �ֵ��� ó��
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