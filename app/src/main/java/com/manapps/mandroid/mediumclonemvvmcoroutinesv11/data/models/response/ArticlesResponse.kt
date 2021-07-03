package com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.models.response

import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.models.entities.Article

data class ArticlesResponse(
    val articles: List<Article>,
    val articlesCount: Int
)