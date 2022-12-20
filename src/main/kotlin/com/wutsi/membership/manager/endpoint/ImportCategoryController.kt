package com.wutsi.membership.manager.endpoint

import com.wutsi.membership.manager.`delegate`.ImportCategoryDelegate
import org.springframework.web.bind.`annotation`.GetMapping
import org.springframework.web.bind.`annotation`.RequestParam
import org.springframework.web.bind.`annotation`.RestController
import kotlin.String

@RestController
public class ImportCategoryController(
    public val `delegate`: ImportCategoryDelegate,
) {
    @GetMapping("/v1/categories/import")
    public fun invoke(@RequestParam(name = "language", required = false) language: String) {
        delegate.invoke(language)
    }
}
