package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Exercise2Test {

    @Test
    public void testVerify() {

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.fetchData();

        verify(api).getData();

    }

}