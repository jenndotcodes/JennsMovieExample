package codes.jenn.jennsmovieexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MovieAdapter.MovieListClickListener  {

    companion object {
        const val MOVIE_TITLE_KEY = "movie_title"
        const val MOVIE_SUMMARY_KEY = "movie_summary"
        const val MOVIE_RELEASE_DATE_KEY = "move_release_date"
        const val MOVIE_POSTER_KEY = "movie_poster"
        const val LIST_DETAIL_REQUEST_CODE = 123
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create the layout manager
        moviesRecyclerView.layoutManager = GridLayoutManager(this,2)

        //Add the adapter to the recyclerview
        moviesRecyclerView.adapter = MovieAdapter(this)
    }


    override fun listItemClicked(movie: Movie) {
        val movieItem = Intent(this, MovieDetailActivity::class.java)
        movieItem.putExtra(MOVIE_TITLE_KEY, movie.title)
        movieItem.putExtra(MOVIE_SUMMARY_KEY, movie.summary)
        movieItem.putExtra(MOVIE_RELEASE_DATE_KEY,movie.releaseDate)
        movieItem.putExtra(MOVIE_POSTER_KEY, movie.image)
        startActivityForResult(movieItem, LIST_DETAIL_REQUEST_CODE)
    }
}