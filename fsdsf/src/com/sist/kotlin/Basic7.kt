//package com.sist.kotlin
//
///*
// 	������ ��� ( Function )==> ��ü ���� (class) ==>
//
// 	1) Ŭ���� ����
// 		= �Ű� ������ ���� ���
// 			public class A{
//				public A(){} --> �⺻���� �����ڸ� ����
//			}
// 			A a = new A()
// 			
// 			class A{
// 				
//			}
// 			val a = A()
// 		�ڹٴ� ��ü �����ÿ� new�� ����Ѵ�
// 		kotlin�� new�� ������� �ʴ´�.
// 		List<String> list = new ArrayList<String>
// 		var list = ArrayList<String>()
// 		
// 		������(Contstructor) �����
// 		= �Ű������� ����
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
// 	2) ��ü ����
// 		var a = A("")
// 	3) ��������� �ʱ�ȭ
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
// 		var s:Sawon("ȫ�浿","���ߺ�","���")
// 		s.name = "��û��";
// 		s.dept = " ";
// 		s.job = " ";
// 		
// 		���� ������
// 			public : ��� Ŭ������ ������ ���� ( ������ ���� )
// 				var a :String=" " (public�� ������)
// 			private : �ڽ��� Ŭ���������� ����� ����
// 			protected : ��ӹ��� Ŭ���������� ����� ����
// 			internal : (default) ���� ���(����)�ȿ� �����ϴ� ��� Ŭ�������� ����� ����
// 	4) VO����� ���
// 	5) �������̵� , ����� �޴� ���
//*/
//
//class Sawon
//{
//	constructor(var name:String,var dept:String,var job:String) // ��������
//	{
//		println("�̸�  :"+name)
//		println("�μ� :$dept" )
//		println("����:$job")
//	}
//}
//fun main(args:Array<String>){
//	var sa:Sawon = Sawon("ȫ�浿","���ߺ�","���")
//	println("�̸� : "+sa.name);
//	var sa2:Sawon = Sawon("��û��","���ߺ�","����")
//	sa2.name = "������";
//	sa2.dept ="���ߺ�"
//	sa2.job="���"
//	println("�̸� : "+sa3.name);
//	println("�μ� : "+sa3.dept);
//	println("���� : "+sa3.job);
//	
//	sa.name="��û��"
//}
//
//class Sawon3{
//	var name:String= ""
//	var dept:String= ""
//	var job:String= ""
//}
