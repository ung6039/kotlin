package com.sist.kotlin

/*
 	��Ʋ������ ����ϴ� ��������
 		1) ������
 			(�빮�� ����)
 			������ : Byte(1byte ->8bit), Short(2byte-> 16bit) , Int(4byte-> 32bit),Long(8byte ->64bit)
 			�Ǽ���
 				Double(64bit)
 				Float(32bit)
 		2) ������
 			���� : Char => '' 
 			���ڿ� : String => ""
 		3) ����
 			Boolean : true/false
 	���� ���� ���
 		=> ��� (���� ������)
 			val
 		=> ���� 
 			var
 		ex) �ڹ�
 			int a =10;
 			final int b =20;
 			================
 			kotlin
 			var a = 10;
 			var a:Int =10; ( ���������� �ڿ� ǥ������ �� ���� )
 			val b:Int =20;
 			val b = 20
 			var b = false;
 			var a = 10.5
 			��Ʋ�� => front (javascript)
 			var, val ==> �ڵ� ��ȯ ����
 		#### �迭
 		String[] names = {"","",""};
 		val numbers:Array<Int> = arrayOf(1,2,3,4,5)
 		=> numbers[0]....
 	������
 		��������� (+,-,*,/,%)
 		�������� ( && , || )
 		���Կ����� ( = )
 		�񱳿����� ( ==, !=, <, >, <=, >=) 		
 	��� :
 	�Լ�
 	Ŭ����
 	�������̽�
 */

// �Լ�
// public static void main(String[] args) --> �ڹ� �����Լ�

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

