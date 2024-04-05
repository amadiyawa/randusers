package com.amadiyawa.feature_users.domain.repository

import com.amadiyawa.feature_users.domain.model.User
import com.amadiyawa.feature_base.domain.result.Result

internal interface UserRepository {
    suspend fun getUsers(page: Int = 1, results: Int = 10): Result<List<User>>
}