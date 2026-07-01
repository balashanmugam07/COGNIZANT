package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Exercise4Test {

    @Test
    public void testVoidMethod() {

        ExternalApi api = mock(ExternalApi.class);

        doNothing().when(api).sendData("Mockito");

        MyService service = new MyService(api);

        service.saveData("Mockito");

        verify(api).sendData("Mockito");

    }

}