package codes.jenn.jennsmovieexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_detail.*
import kotlinx.android.synthetic.main.movie_list_item.*

class MovieDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        titleDetailTextView.text = intent.getStringExtra(MainActivity.MOVIE_TITLE_KEY)
        summaryDetailTextView.text = intent.getStringExtra(MainActivity.MOVIE_SUMMARY_KEY)
        releaseDateTextView.text = "Release Date: ${intent.getStringExtra(MainActivity.MOVIE_RELEASE_DATE_KEY)}"
        detailImageView.setImageResource(intent.getIntExtra(MainActivity.MOVIE_POSTER_KEY,0))
    }
}