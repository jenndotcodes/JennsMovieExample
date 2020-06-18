package codes.jenn.jennsmovieexample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.movie_list_item.view.*

class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

   var posterImageView = itemView.posterImageView
   var textTitle = itemView.titleTextView

}