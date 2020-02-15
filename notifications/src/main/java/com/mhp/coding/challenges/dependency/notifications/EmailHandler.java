package com.mhp.coding.challenges.dependency.notifications;

import com.mhp.coding.challenges.dependency.inquiry.EmailHandlerInterface;
import com.mhp.coding.challenges.dependency.inquiry.Inquiry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmailHandler implements EmailHandlerInterface {

    private static final Logger LOG = LoggerFactory.getLogger(EmailHandler.class);

    @Override
    public void sendEmail(final Inquiry inquiry) {
        LOG.info("Sending email for: {}", inquiry);
    }

}
