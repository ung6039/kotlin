//package com.sist.kotlin
//
//
///*
// 	상속을 내리는 클래스 ==> open class
// 		=> 상속을 받아서 함수를 재정의 => 상속 내린 클래스의 open fun ~ 해야함
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
//	// 멤버변수 설정 (Saram)
//	var name:String=""
//	var sex:String=""
//	var addr:String =""
//	
//	open fun myData(){
//		println("Saram:myData() Call")
//	}
//	fun myData2(){
//		println("함수 overrding 하기 위해서는 open이 필요 ?")
//	}
//}
//// 상속 : 상속을 내리는 클래스가 open을 해주어야함
//class Member:Saram
//{
//	fun dataPrint(){
//		name="홍길동"
//		sex="남자"
//		addr="서울"
//	}
//	// 상속 , override를 할 때에도 open이 붙어 있어야 재정의가 가능함
//	override fun myData(){
//		println("Member:myData 호출")
//	}
//	
//}
//fun main(args:Array<String>){
//
//	// 객체 생성 Member Mmem = new Member();
//	var mem:Member=Member();
//	mem.dataPrint()
//	println(mem.name)
//	println(mem.sex)
//	println(mem.addr)
//	mem.myData()
//}