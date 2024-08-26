package appointment.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import appointment.main.Appointment;
import appointment.main.AppointmentService;

import java.util.Date;

public class AppointmentServiceTest {

    private AppointmentService appointmentService;

    @BeforeEach
    public void setUp() {
        appointmentService = new AppointmentService();
    }

    @Test
    public void testAddAppointment() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Appointment appointment = new Appointment("12345", futureDate, "Description");
        appointmentService.addAppointment(appointment);
        assertNotNull(appointmentService.getAppointment("12345"));
    }

    @Test
    public void testDeleteAppointment() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Appointment appointment = new Appointment("12345", futureDate, "Description");
        appointmentService.addAppointment(appointment);
        appointmentService.deleteAppointment("12345");
        assertNull(appointmentService.getAppointment("12345"));
    }

    
}

