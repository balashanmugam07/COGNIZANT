package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class Exercise7Test {

    @Test
    public void testException() {

        ExternalApi api = mock(ExternalApi.class);

        doThrow(new RuntimeException("Error"))
                .when(api)
                .sendData("Java");

        MyService service = new MyService(api);

        assertThrows(RuntimeException.class, () -> {

            service.saveData("Java");

        });

    }

}