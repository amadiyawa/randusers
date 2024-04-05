package com.amadiyawa.feature_users.domain.usecase

import com.amadiyawa.feature_base.domain.result.Result
import com.amadiyawa.feature_users.domain.model.User
import com.amadiyawa.feature_users.domain.repository.UserRepository

internal class GetUserListUseCase(
    private val userRepository: UserRepository,
) {
    suspend operator fun invoke(page: Int = 1, results: Int = 10): Result<List<User>> {
        return userRepository
            .getUsers(page, results)
    }
}