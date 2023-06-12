package com.zerobase.api.loan.review

import com.zerobase.domain.com.zerobase.api.domain.LoanReview


interface LoanReviewService {
    fun loanReviewMain(userKey: String): LoanReviewDto.LoanReviewResponseDto

    fun getLoanResult(userKey: String) : LoanReview?
}