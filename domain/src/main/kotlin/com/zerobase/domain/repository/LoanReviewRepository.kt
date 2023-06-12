package com.zerobase.domain.com.zerobase.api.repository

import com.zerobase.domain.com.zerobase.api.domain.LoanReview
import org.springframework.data.jpa.repository.JpaRepository

interface LoanReviewRepository : JpaRepository<LoanReview,Long> {
    fun findByUserKey(userKey: String): LoanReview?
}