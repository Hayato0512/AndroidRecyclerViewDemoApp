import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemoapp.R

class CustomAdapter(private val mList: List<String>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

	// create new views
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		// inflates the card_view_design view
		// that is used to hold list item
		val view = LayoutInflater.from(parent.context)
			.inflate(R.layout.list_view_design, parent, false)

		return ViewHolder(view)
	}

	// binds the list items to a view
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {

		val stringItem = mList[position]

		// sets the image to the imageview from our itemHolder class
//		holder.imageView.setImageResource(ItemsViewModel.image)

		// sets the text to the textview from our itemHolder class
		holder.textView.text = stringItem

	}

	// return the number of the items in the list
	override fun getItemCount(): Int {
		return mList.size
	}

	// Holds the views for adding it to image and text
	class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
		val textView: TextView = itemView.findViewById(R.id.textView)
	}
}