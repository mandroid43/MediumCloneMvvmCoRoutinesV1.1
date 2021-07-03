package com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.repository

import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.utils.safeApiCall
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.api.ApiService
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.models.request.CreateArticleRequest

class CreateArticlesRepository(val apiService: ApiService) {
    suspend fun sendCreateArticleRequest(createArticleRequest: CreateArticleRequest) = safeApiCall {
        apiService.sendCreateArticleRequest(createArticleRequest)
    }

}