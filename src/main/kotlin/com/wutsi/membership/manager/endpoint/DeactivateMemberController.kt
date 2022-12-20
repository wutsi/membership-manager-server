package com.wutsi.membership.manager.endpoint

import com.wutsi.membership.manager.`delegate`.DeactivateMemberDelegate
import org.springframework.web.bind.`annotation`.DeleteMapping
import org.springframework.web.bind.`annotation`.RestController

@RestController
public class DeactivateMemberController(
    public val `delegate`: DeactivateMemberDelegate,
) {
    @DeleteMapping("/v1/members")
    public fun invoke() {
        delegate.invoke()
    }
}
