package com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.repository

import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.utils.safeApiCall
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.api.ApiService

class ArticlesDetailsRepository(val apiService: ApiService) {
    suspend fun getArticleBySlug(slugId: String) = safeApiCall {
        apiService.getArticleBySlug(slugId)
    }
}