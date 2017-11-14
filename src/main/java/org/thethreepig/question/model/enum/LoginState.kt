package org.thethreepig.question.model.enum

/**
 * Created by 王有名 on 2017/11/7.
 * 登录状态枚举
 */
enum class LoginState {
    /**
     * 账号不存在
     * */
    AccountNoExists,

    /**
     * 密码错误
     * */
    PasswordError,

    /**
     * 登录失败
     * */
    LoginFailed,

}