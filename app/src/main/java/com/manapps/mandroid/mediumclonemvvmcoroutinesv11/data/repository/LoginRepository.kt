package com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.repository

import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.utils.safeApiCall
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.api.ApiService
import com.manapps.mandroid.mediumclonemvvmcoroutinesv11.data.models.request.LoginRequest

class LoginRepository(val apiService: ApiService) {
    suspend fun sendLoginRequest(loginRequest: LoginRequest) = safeApiCall {
        apiService.sendLoginRequest(loginRequest)
    }
}