package com.example.recyclerviewdemoapp

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity(), Contract.View {
	// creating object of TextView class
	private var textView: TextView? = null

	// creating object of Button class
	private var button: Button? = null

	// creating object of ProgressBar class
	private var progressBar: ProgressBar? = null

	// creating object of Presenter interface in Contract
	var presenter: Presenter? = null
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// assigning ID of the TextView
		textView = findViewById(R.id.textView)

		// assigning ID of the Button
		button = findViewById(R.id.button)

		// assigning ID of the ProgressBar
		progressBar = findViewById(R.id.progressBar)

		// instantiating object of Presenter Interface
		presenter = Presenter(this, Model())

		// operations to be performed when
		// user clicks the button
		this.button!!.setOnClickListener(View.OnClickListener { presenter!!.onButtonClick() })
	}

	override fun onResume() {
		super.onResume()
	}

	override fun onDestroy() {
		super.onDestroy()
		presenter!!.onDestroy()
	}

	// method to display the Course Detail TextView
	override fun showProgress() {
		progressBar!!.visibility = View.VISIBLE
		textView!!.visibility = View.INVISIBLE
	}

	// method to hide the Course Detail TextView
	override fun hideProgress() {
		progressBar!!.visibility = View.GONE
		textView!!.visibility = View.VISIBLE
	}

	// method to set random string
	// in the Course Detail TextView
	override fun setString(string: String?) {
		textView!!.text = string
	}
	}

////	@BindView(R.id.recyclerview)
////	val recyclerView: RecyclerView = RecyclerView(this)
//override fun onCreate(savedInstanceState: Bundle?) {
//	super.onCreate(savedInstanceState)
//	setContentView(R.layout.activity_main)
//	ButterKnife.bind(this)
//	title = TextView(this)
//	title.text = "Hello from Butterknife"
//	// getting the recyclerview by its id
//
//	// this creates a vertical layout Manager
//
////		recyclerView.layoutManager = LinearLayoutManager(this)
//
//	// ArrayList of class ItemsViewModel
//	val data = ArrayList<String>()
//
//	// This loop will create 20 Views containing
//	// the image with the count of view
//	for (i in 1..80) {
//		data.add( "Item  + ${i.toString()}")
//	}
//
//	// This will pass the ArrayList to our Adapter
//	val adapter = CustomAdapter(data)
//
//	val firstBike = Bike("Yae", "2023", "Brodie")
//	firstBike.let{
//		println("debug: ${it.name} " )
//	}
//	// Setting the Adapter with the recyclerview
////		recyclerView.adapter = adapter
//
//}
//
//
//

