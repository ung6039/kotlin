package com.sist.kotlin

// switch => when
fun main(args:Array<String>){
	var c = sexCheck(1)
	println("���� =$c")
	var i = 3;
	numberSelect(i)
}
fun sexCheck(sex:Int):String{
	var s:String=" "
	when(sex){
		1->s="����"
		2->s="����"
		3->s="����"
		4->s="����"
	}
	return s;
}

fun numberSelect(a:Int)
{
	when(a){
		1->println("1�� ������..")
		2,3->println("2�� 3�� ����..")
		in 4..7->println("4~7���� ���õ�")
		// 4,5,6,7 => 4..7 => 1..10
		8,9->println("8,9 ���õ�..")
//		in 10,20,90...95-> print("ddd")
		!in 1..7-> println("NoNoNo")
	}
}

