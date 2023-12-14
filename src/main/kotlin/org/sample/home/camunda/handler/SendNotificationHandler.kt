package org.sample.home.camunda.handler

import org.apache.logging.log4j.kotlin.Logging
import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription
import org.camunda.bpm.client.task.ExternalTask
import org.camunda.bpm.client.task.ExternalTaskHandler
import org.camunda.bpm.client.task.ExternalTaskService
import org.sample.home.camunda.SEND_NOTIFICATION_TOPIC_NAME
import org.springframework.stereotype.Component

@Component
@ExternalTaskSubscription(SEND_NOTIFICATION_TOPIC_NAME)
class SendNotificationHandler : ExternalTaskHandler {

    override fun execute(externalTask: ExternalTask, externalTaskService: ExternalTaskService) {
        val busKey = externalTask.businessKey
        logger.info("SendNotificationDelegate: $busKey")
    }

    companion object : Logging
}