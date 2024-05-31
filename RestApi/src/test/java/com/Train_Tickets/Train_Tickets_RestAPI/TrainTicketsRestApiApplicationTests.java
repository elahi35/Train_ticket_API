package com.example.trainticket.service;

import com.example.trainticket.model.Ticket;
import com.example.trainticket.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicketServiceTest {

    private TicketService ticketService;

    @BeforeEach
    public void setUp() {
        ticketService = new TicketService();
    }

    @Test
    public void testPurchaseTicket() {
        User user = new User("John", "Doe", "john.doe@example.com", "A1");
        Ticket ticket = ticketService.purchaseTicket("London", "France", user);
        assertNotNull(ticket);
        assertEquals(20.0, ticket.getPrice());
        assertEquals("London", ticket.getFrom());
        assertEquals("France", ticket.getTo());
        assertEquals(user, ticket.getUser());
    }

    @Test
    public void testGetTicket() {
        User user = new User("John", "Doe", "john.doe@example.com", "A1");
        ticketService.purchaseTicket("London", "France", user);
        Ticket ticket = ticketService.getTicket("john.doe@example.com");
        assertNotNull(ticket);
        assertEquals("John", ticket.getUser().getFirstName());
    }
}

