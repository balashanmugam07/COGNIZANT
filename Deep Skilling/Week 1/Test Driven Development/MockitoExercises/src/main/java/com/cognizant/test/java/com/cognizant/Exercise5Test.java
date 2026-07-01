package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class Exercise5Test {

    @Test
    public void testMultipleReturns() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData())
                .thenReturn("First")
                .thenReturn("Second");

        MyService service = new MyService(api);

        assertEquals("First", service.fetchData());

        assertEquals("Second", service.fetchData());

    }

}