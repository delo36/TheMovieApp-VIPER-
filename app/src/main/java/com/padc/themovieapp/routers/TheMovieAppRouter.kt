package com.padc.themovieapp.routers

import android.app.Activity
import com.padc.themovieapp.activities.MovieDetailsActivity
import com.padc.themovieapp.activities.MovieSearchActivity

fun Activity.navigateToMovieDetailActivity(movieId: Int) {
    startActivity(MovieDetailsActivity.newIntent(this,movieId = movieId))
}

fun Activity.navigateToMovieSearchActivity(){
    startActivity(MovieSearchActivity.newIntent(this))
}