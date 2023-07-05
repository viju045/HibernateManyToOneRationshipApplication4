package org.mahagan.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link User}
     *   <li>{@link User#setUserId(int)}
     *   <li>{@link User#setUserName(String)}
     *   <li>{@link User#getUserId()}
     *   <li>{@link User#getUserName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        User actualUser = new User();
        actualUser.setUserId(1);
        actualUser.setUserName("janedoe");
        assertEquals(1, actualUser.getUserId());
        assertEquals("janedoe", actualUser.getUserName());
    }
}

