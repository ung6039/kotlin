package com.sist.kotlin

fun add(x:Int,y:Int):Int
{
	return x+y
}


fun add2(x:Int,y:Int) = x+y

// ���ٽ�
/*
 	const a=()=>{}
 	const a = function(){}
 */
var add3 = {x:Int,y:Int->x+y}

fun main(args:Array<String>)
{
	var a = add(10,20)
	var b = add2(100,200)
	var c = add3(1000,2000)
	
	println("a = $a, b=$b, C=$c")
}