import java.util.*;

fun main(args:Array<String>){
//	whileTest()
//	whileTest2()
	doWhileTest()
}
fun whileTest(){
	var i = 1
	while(i<=10){
		println("i=$i")
		i++;
	}
}

fun whileTest2(){
	var scan = Scanner(System.`in`)
	println("���� �Է�: ")
	var j = scan.nextInt()
	var i =1;
	while(i<=9){
		println("$j * $i = "+(i*j))
		i++
	}
}

fun doWhileTest(){
	
	var i =1
	println("do While ��")
	do{
		println("i=$i")
		i++;
	}while(i<=10)
}