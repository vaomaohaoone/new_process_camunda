package org.sample.home.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient("workflow-client", url = "feign.client.config.workflow-client.url")
interface WorkflowFeignClient {

    @PostMapping("/start")
    fun startProcess(@RequestParam("businessKey") businessKey: String)
}