package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class Exercise3Test {

    @Test
    public void testArgumentMatching() {

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.saveData("Java");

        verify(api).sendData(anyString());

    }

}