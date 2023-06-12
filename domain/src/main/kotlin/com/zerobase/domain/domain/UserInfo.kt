package com.zerobase.domain.com.zerobase.api.domain

import javax.persistence.*

@Entity
@Table(name = "USER_INFO")
class UserInfo (
    @Column(name = "usr_key")
    val userkey : String,

    @Column(name = "usr_reg_num")
    val userRegisterationNumber: String,

    @Column(name = "usr_nm")
    val userName: String,

    @Column(name = "user_icn_ant")
    val userIncomeAmount: Long

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}