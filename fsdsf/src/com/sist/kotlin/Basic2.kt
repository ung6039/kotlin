package com.sist.kotlin

/*
 	1) ���� Ÿ�� ���� ���
 		var a:Int , var a = 10
 	2) ���Ἲ, �ǿ뼺, ������  ==> �ڹ� ( JVM )
 	3) ��ȣ��� 	
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
//�Լ��� -> ������ ���� ����
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
	println("score=$score,jumsu=$jumsu ����")
}
/*
 	fun �Լ��� (�Ű�����...) ==> void �Լ���(�Ű�����)
 	fun �Լ���(�Ű�����.. ) : �������� �������� ����
 	
 	if ���ǹ�
 	= if(����)
 	= if(����) ~ else
  	= if(����)~ else if(����) ~~~ else
 */









