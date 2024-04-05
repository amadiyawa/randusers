package com.amadiyawa.feature_users.domain

import com.amadiyawa.feature_users.domain.usecase.GetUserListUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val domainModule = module {
    singleOf(::GetUserListUseCase)
}