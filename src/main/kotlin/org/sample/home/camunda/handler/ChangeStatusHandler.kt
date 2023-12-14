package org.sample.home.camunda.handler

import org.apache.logging.log4j.kotlin.Logging
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription
import org.camunda.bpm.client.task.ExternalTask
import org.camunda.bpm.client.task.ExternalTaskHandler
import org.camunda.bpm.client.task.ExternalTaskService
import org.sample.home.camunda.CHANGE_STATUS_TOPIC_NAME
import org.springframework.stereotype.Component

@Component
@ExternalTaskSubscription(CHANGE_STATUS_TOPIC_NAME)
class ChangeStatusHandler : ExternalTaskHandler {

    override fun execute(externalTask: ExternalTask, externalTaskService: ExternalTaskService) {
        val busKey = externalTask.businessKey
        logger.info("ChangeStatusDelegate: $busKey" )
    }

    companion object: Logging
}