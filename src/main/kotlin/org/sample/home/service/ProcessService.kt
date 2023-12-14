package org.sample.home.service

import org.apache.commons.lang3.RandomStringUtils
import org.apache.logging.log4j.kotlin.Logging

import org.sample.home.feign.WorkflowFeignClient
import org.springframework.stereotype.Service

@Service
class ProcessService(
    private val workflowFeignClient: WorkflowFeignClient
) {

    fun startProcess() {
        val businessKey = "BUSINESS_KEY_${RandomStringUtils.randomNumeric(100)}"
        workflowFeignClient.startProcess(businessKey)
        logger.info("Process with business key: $businessKey is started")
    }

    companion object : Logging

}