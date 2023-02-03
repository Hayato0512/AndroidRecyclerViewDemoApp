package com.example.recyclerviewdemoapp

data class Bike(
	val  name:String,
	val year:String,
	val brand:String,
){
companion object{
	fun printBikeName(bike:Bike):String{
		return bike.name;
	}

}
}
