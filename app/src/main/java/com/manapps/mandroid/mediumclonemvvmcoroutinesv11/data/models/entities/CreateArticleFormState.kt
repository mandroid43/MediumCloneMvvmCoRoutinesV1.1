package com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.models.entities

class CreateArticleFormState (val titleError: Int? = null,
                              val descError: Int? = null,
                              val bodyError: Int? = null,
                              val isDataValid: Boolean = false)