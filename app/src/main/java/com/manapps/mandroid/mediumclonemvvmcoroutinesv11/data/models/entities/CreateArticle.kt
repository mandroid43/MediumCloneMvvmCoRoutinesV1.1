package com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.models.entities

data class CreateArticle (
    val title: String,
    val description: String,
    val body: String,
    val tagList: List<String>?,
    )