package com.cognizant;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class Exercise6Test {

    @Test
    public void testOrder() {

        ExternalApi api = mock(ExternalApi.class);

        api.getData();

        api.sendData("Java");

        InOrder order = inOrder(api);

        order.verify(api).getData();

        order.verify(api).sendData("Java");

    }

}