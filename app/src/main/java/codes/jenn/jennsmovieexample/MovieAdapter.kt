package codes.jenn.jennsmovieexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import codes.jenn.jennsmovieexample.data.Movie

class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {

    private var movieList = mutableListOf(
        Movie(2493,
            "The Princess Bride",
            "It's as real as the feelings you feel.",
            "10/09/1987",
            R.drawable.princess_bride),
        Movie(860,
        "WarGames",
        "Is it a game, or is it real?",
        "06/03/1983",
        R.drawable.war_games),
        Movie(10428,
        "Hackers",
        "Their crime is curiosity.",
        "09/14/1995",
        R.drawable.hackers),
    Movie(9570,
    "The Black Hole",
        "A journey that begins where everything ends!",
        "12/18/1979",
        R.drawable.the_black_hole),
        Movie(1642,
            "The Net",
            "No driver's license, no credit cards, no passport, no access to her " +
                    "bank accounts in a foreign country ... She finds her identity stolen.",
        "07/28/1995",
        R.drawable.the_net)
    )



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_item, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.posterImageView.setImageResource(movieList[position].image)
        holder.textTitle.text = movieList[position].title
    }

}