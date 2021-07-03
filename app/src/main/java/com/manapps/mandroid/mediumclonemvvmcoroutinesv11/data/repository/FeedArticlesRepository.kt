package com.manapps.mandroid.mediumclonemvckotlin.data.repository

import android.content.Context
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.utils.safeApiCall
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.api.ApiService
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.ui.profile.ProfileActivity
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.utils.SharedPref
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.utils.Utils

class FeedArticlesRepository(private val apiService: ApiService) {
    suspend fun getAuthorsArticles() = safeApiCall {
        apiService.getAuthorsArticles()
    }
   fun logoutSession(context:Context){
       SharedPref.logoutSessionAndGoToLogin(context)
   }

    fun gotoProfile(context:Context){
        Utils.moveTo(context, ProfileActivity::class.java)
    }
}