package com.cristiandpt.healthy.database.converter

import com.cristiandpt.healthy.core.model.UserModel
import com.cristiandpt.healthy.database.entity.UserEntity
import java.util.*
import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class UserEntityToModelConverter : Converter<UserEntity, UserModel> {
    override fun convert(source: UserEntity): UserModel {
        return UserModel(
                id = source.id,
                accessFailedCount = source.accessFailedCount,
                email = source.email,
                emailConfirmed = source.emailConfirmed,
                lockoutEnabled = source.lockoutEnabled,
                lockoutEnd = source.lockoutEnd,
                normalizedEmail = source.normalizedEmail,
                normalizedUserName = source.normalizedUserName,
                phoneNumber = source.phoneNumber,
                phoneNumberConfirmed = source.phoneNumberConfirmed,
                twoFactorEnabled = source.twoFactorEnabled,
                userName = source.userName,
                displayName = source.displayName
        )
    }
}

@Component
class UserModelToEntityConverter : Converter<UserModel, UserEntity> {
    override fun convert(source: UserModel): UserEntity {
        return UserEntity(
                id = source.id,
                accessFailedCount = source.accessFailedCount,
                email = source.email,
                emailConfirmed = source.emailConfirmed,
                lockoutEnabled = source.lockoutEnabled,
                lockoutEnd = source.lockoutEnd,
                normalizedEmail = source.normalizedEmail,
                normalizedUserName = source.normalizedUserName,
                phoneNumber = source.phoneNumber,
                phoneNumberConfirmed = source.phoneNumberConfirmed,
                twoFactorEnabled = source.twoFactorEnabled,
                userName = source.userName,
                displayName = source.displayName,
                concurrencyStamp = UUID.randomUUID(),
                passwordHash = "",
                securityStamp = UUID.randomUUID(),
        )
    }
}
