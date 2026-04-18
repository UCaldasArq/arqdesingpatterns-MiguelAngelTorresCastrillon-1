package edu.ucaldas.creacionales.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void shouldReturnSameInstance() {
        DataBaseConnection instance1 = DataBaseConnection.getInstance();
        DataBaseConnection instance2 = DataBaseConnection.getInstance();

        assertSame(instance1, instance2);
    }
}
