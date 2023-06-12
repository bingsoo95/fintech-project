package com.zerobase.api.exception

import org.springframework.http.HttpStatus

enum class CustomErrorCode (
    val statusCode: HttpStatus,
    val errorCode: String,
    val errorMessage: String
) {
    // userKey에 해당하는 유저가 없을 때
    RESULT_NOT_FOUND(HttpStatus.BAD_REQUEST, "E001", "Result Not Found")
}