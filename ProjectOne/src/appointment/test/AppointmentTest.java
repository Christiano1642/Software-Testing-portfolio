package appointment.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import appointment.main.Appointment;

import java.util.Date;

public class AppointmentTest {

    @Test
    public void testAppointmentCreation() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Appointment appointment = new Appointment("12345", futureDate, "Description");
        assertEquals("12345", appointment.getAppointmentId());
        assertEquals(futureDate, appointment.getAppointmentDate());
        assertEquals("Description", appointment.getDescription());
    }

    @Test
    public void testAppointmentCreationInvalidDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345", new Date(System.currentTimeMillis() - 100000), "Description");
        });
    }

    
}

