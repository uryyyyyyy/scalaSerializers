package com.github.uryyyyyyy.serializer.messagepack


import org.msgpack.ScalaMessagePack
import org.msgpack.annotation.Message

object Hello {
	def main(args: Array[String]): Unit = {
		//		val obj = new YourClass("hoge", 22)
		val obj = new YourClass()
		obj.age = 22
		obj.name = "heb"
		val serialized : Array[Byte] = ScalaMessagePack.write(obj)
		println(serialized)

		val deserialized : YourClass = ScalaMessagePack.read[YourClass](serialized)
		println(deserialized)
	}
}



@Message // Don't forget to add Message annotation.
class YourClass{
	var name : String = ""
	var age : Int = 2

	override def toString() = s"name: $name, age: $age"

}

@Message // Don't forget to add Message annotation.
case class YourClass2(name : String, age : Int){
	def this() = this("",0)
}