package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class VehiclesTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Vehicles}
     *   <li>{@link Vehicles#setUser(User)}
     *   <li>{@link Vehicles#setVehicalId(int)}
     *   <li>{@link Vehicles#setVehicalName(String)}
     *   <li>{@link Vehicles#setVehicalNumber(int)}
     *   <li>{@link Vehicles#setVehicalType(String)}
     *   <li>{@link Vehicles#getUser()}
     *   <li>{@link Vehicles#getVehicalId()}
     *   <li>{@link Vehicles#getVehicalName()}
     *   <li>{@link Vehicles#getVehicalNumber()}
     *   <li>{@link Vehicles#getVehicalType()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Vehicles actualVehicles = new Vehicles();
        User user = new User();
        user.setUserId(1);
        user.setUserName("janedoe");
        actualVehicles.setUser(user);
        actualVehicles.setVehicalId(1);
        actualVehicles.setVehicalName("Vehical Name");
        actualVehicles.setVehicalNumber(10);
        actualVehicles.setVehicalType("Vehical Type");
        assertSame(user, actualVehicles.getUser());
        assertEquals(1, actualVehicles.getVehicalId());
        assertEquals("Vehical Name", actualVehicles.getVehicalName());
        assertEquals(10, actualVehicles.getVehicalNumber());
        assertEquals("Vehical Type", actualVehicles.getVehicalType());
    }
}

