//package com.sist.kotlin
//
//
///*
// 	����� ������ Ŭ���� ==> open class
// 		=> ����� �޾Ƽ� �Լ��� ������ => ��� ���� Ŭ������ open fun ~ �ؾ���
// 	
// 	@Controller
// 	class WelcomController{
//		
// 		@GetMapping("/welcome"){
//		fun welcome():String{
//				return "welcome"
//			}
//		}
//	}
// */
//open class Saram{
//	// ������� ���� (Saram)
//	var name:String=""
//	var sex:String=""
//	var addr:String =""
//	
//	open fun myData(){
//		println("Saram:myData() Call")
//	}
//	fun myData2(){
//		println("�Լ� overrding �ϱ� ���ؼ��� open�� �ʿ� ?")
//	}
//}
//// ��� : ����� ������ Ŭ������ open�� ���־����
//class Member:Saram
//{
//	fun dataPrint(){
//		name="ȫ�浿"
//		sex="����"
//		addr="����"
//	}
//	// ��� , override�� �� ������ open�� �پ� �־�� �����ǰ� ������
//	override fun myData(){
//		println("Member:myData ȣ��")
//	}
//	
//}
//fun main(args:Array<String>){
//
//	// ��ü ���� Member Mmem = new Member();
//	var mem:Member=Member();
//	mem.dataPrint()
//	println(mem.name)
//	println(mem.sex)
//	println(mem.addr)
//	mem.myData()
//}