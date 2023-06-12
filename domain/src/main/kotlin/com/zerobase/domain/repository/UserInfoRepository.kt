package com.zerobase.domain.com.zerobase.api.repository

import com.zerobase.domain.com.zerobase.api.domain.UserInfo
import org.springframework.data.jpa.repository.JpaRepository

interface UserInfoRepository : JpaRepository<UserInfo,Long>