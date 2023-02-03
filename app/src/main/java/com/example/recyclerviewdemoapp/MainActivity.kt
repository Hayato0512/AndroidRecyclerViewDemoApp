package com.example.recyclerviewdemoapp

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {
//	@BindView(R.id.recyclerview)
//	val recyclerView: RecyclerView = RecyclerView(this)
	@BindView(R.id.textView1)
	lateinit var title: TextView
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		ButterKnife.bind(this)
	title = TextView(this)
		title.text = "Hello from Butterknife"
		// getting the recyclerview by its id

		// this creates a vertical layout Manager

//		recyclerView.layoutManager = LinearLayoutManager(this)

		// ArrayList of class ItemsViewModel
		val data = ArrayList<String>()

		// This loop will create 20 Views containing
		// the image with the count of view
		for (i in 1..80) {
			data.add( "Item  + ${i.toString()}")
		}

		// This will pass the ArrayList to our Adapter
		val adapter = CustomAdapter(data)

		val firstBike = Bike("Yae", "2023", "Brodie")
		firstBike.let{
			println("debug: ${it.name} " )
		}
		// Setting the Adapter with the recyclerview
//		recyclerView.adapter = adapter

		}
	}



