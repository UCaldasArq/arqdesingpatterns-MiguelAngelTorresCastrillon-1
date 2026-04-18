package edu.ucaldas.creacionales.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    void shouldCreateEmailNotification() {
        Notification notification = NotificationFactory.createNotification("email");

        assertNotNull(notification);
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void shouldCreateSMSNotification() {
        Notification notification = NotificationFactory.createNotification("sms");

        assertNotNull(notification);
        assertTrue(notification instanceof SMSNotification);
    }

    @Test
    void shouldCreatePushNotification() {
        Notification notification = NotificationFactory.createNotification("push");

        assertNotNull(notification);
        assertTrue(notification instanceof PushNotification);
    }

    @Test
    void shouldThrowExceptionForUnknownType() {
        assertThrows(IllegalArgumentException.class, () -> {
            NotificationFactory.createNotification("unknown");
        });
    }
}
