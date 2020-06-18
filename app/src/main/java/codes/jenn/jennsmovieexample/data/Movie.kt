package codes.jenn.jennsmovieexample.data

data class Movie(
    var id: Int? = null,
    var title: String? = null,
    var overview: String? = null,
    var releaseDate: String? = null,
    val image: Int
)
