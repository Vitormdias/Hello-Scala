object ClienteFlickr extends App {
    val apiKey = "393b8f57fd2c6f1a442ef7d87343b543"
    val method = "flickr.photos.search"
    val tags = "scala"

    val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"

    scala.io.Source.fromURL(url).getLines().foreach(println)
}
