package com.sist.kotlin
// ��Ʋ�� => �ڹ��� ���̺귯���� �ʿ�ø��� ����� �����ϴ�.
import java.util.*;
// java ó�� (Int)�� ����� ����ȯ�� ����� �� ����
// com = temp.toInt()�� ����ؼ� ��ȯ�ؾ���
// toDouble(), toString()
/*
 	�Լ�
 	= �������� �ִ� ���
 		fun �Լ���(�Ű�����...):�������� {} =>  ():Int , ():String, ():Array
 	= �������� ���� ���
 		fun �Լ���(�Ű�����...){} => void
 		
 */
fun main(args:Array<String>){
	var temp=(Math.random()*100)+1
	var com = temp.toInt()
	println("���� = $com")
	
	var scan = Scanner(System.`in`);
	while(true){
		print("1~100������ ������ �Է��Ͻÿ� :")
		var i=scan.nextInt();
		if(i<0 || i>100){
			println("1~100������ ������ �Է��ض� ")
			continue;
		}
		if(i<com){
			println("�Է°����� ū���� �Է��Ͻÿ�")
		}
		else if(i>com){
			println("�Է°����� ���� ���� �Է��Ͻÿ�")
		}
		else{
			println("Game Over!!")
			break;
		}
	}
}