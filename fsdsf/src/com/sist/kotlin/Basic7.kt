//package com.sist.kotlin
//
///*
// 	절차적 언어 ( Function )==> 객체 지향 (class) ==>
//
// 	1) 클래스 선언
// 		= 매개 변수가 없는 경우
// 			public class A{
//				public A(){} --> 기본적인 생성자를 생성
//			}
// 			A a = new A()
// 			
// 			class A{
// 				
//			}
// 			val a = A()
// 		자바는 객체 생성시에 new를 사용한다
// 		kotlin은 new를 사용하지 않는다.
// 		List<String> list = new ArrayList<String>
// 		var list = ArrayList<String>()
// 		
// 		생성자(Contstructor) 만들기
// 		= 매개변수가 존재
// 			class A(var name: String){
//				var a =A("")
//			}
// 		= class A
// 			{
//				constructor(name:String)
// 				{
//					
//				}
//			}
// 	2) 객체 생성
// 		var a = A("")
// 	3) 멤버변수의 초기화
// 		public class Sawon
// 		{
//			private String name;
// 			private String dept;
// 			private String job;
// 			public Sawon(String name,String dept,String job){
//				this.name=name;
// 				this.dept=dept;
// 				this.job=job;
//			}
// 			=> getter/setter
//		}
// 		class Sawon(var name:String,var dept:String,var job:String){
//			
//		}
// 		var s:Sawon("홍길동","개발부","사원")
// 		s.name = "심청이";
// 		s.dept = " ";
// 		s.job = " ";
// 		
// 		접근 지정어
// 			public : 모든 클래스의 접근이 가능 ( 생략이 가능 )
// 				var a :String=" " (public이 생략됨)
// 			private : 자신의 클래스에서만 사용이 가능
// 			protected : 상속받은 클래스에서만 사용이 가능
// 			internal : (default) 같은 모듈(폴더)안에 존재하는 모든 클래스에서 사용이 가능
// 	4) VO만드는 방법
// 	5) 오버라이딩 , 상속을 받는 방법
//*/
//
//class Sawon
//{
//	constructor(var name:String,var dept:String,var job:String) // 지역변수
//	{
//		println("이름  :"+name)
//		println("부서 :$dept" )
//		println("직위:$job")
//	}
//}
//fun main(args:Array<String>){
//	var sa:Sawon = Sawon("홍길동","개발부","사원")
//	println("이름 : "+sa.name);
//	var sa2:Sawon = Sawon("심청이","개발부","과장")
//	sa2.name = "춘향이";
//	sa2.dept ="개발부"
//	sa2.job="사원"
//	println("이름 : "+sa3.name);
//	println("부서 : "+sa3.dept);
//	println("직위 : "+sa3.job);
//	
//	sa.name="심청이"
//}
//
//class Sawon3{
//	var name:String= ""
//	var dept:String= ""
//	var job:String= ""
//}
