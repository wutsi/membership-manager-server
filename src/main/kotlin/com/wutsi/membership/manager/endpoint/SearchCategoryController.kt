package com.wutsi.membership.manager.endpoint

import com.wutsi.membership.manager.`delegate`.SearchCategoryDelegate
import com.wutsi.membership.manager.dto.SearchCategoryRequest
import com.wutsi.membership.manager.dto.SearchCategoryResponse
import org.springframework.web.bind.`annotation`.PostMapping
import org.springframework.web.bind.`annotation`.RequestBody
import org.springframework.web.bind.`annotation`.RestController
import javax.validation.Valid

@RestController
public class SearchCategoryController(
    public val `delegate`: SearchCategoryDelegate,
) {
    @PostMapping("/v1/categories/search")
    public fun invoke(
        @Valid @RequestBody
        request: SearchCategoryRequest,
    ): SearchCategoryResponse =
        delegate.invoke(request)
}
