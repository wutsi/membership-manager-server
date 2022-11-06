package com.wutsi.membership.manager.rule.impl

import com.wutsi.membership.access.dto.Account
import com.wutsi.membership.access.enums.AccountStatus
import com.wutsi.membership.manager.error.ErrorURN
import com.wutsi.membership.manager.rule.Rule
import com.wutsi.platform.core.error.Error
import com.wutsi.platform.core.error.exception.ConflictException

class AccountShouldNotBeSuspendedRule(private val account: Account) : Rule {
    override fun check() {
        if (account.status == AccountStatus.SUSPENDED.name) {
            throw ConflictException(
                error = Error(
                    code = ErrorURN.MEMBER_ALREADY_SUSPENDED.urn
                )
            )
        }
    }
}
