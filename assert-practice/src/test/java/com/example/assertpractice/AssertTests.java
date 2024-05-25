package com.example.assertpractice;

import org.junit.jupiter.api.Test;

class AssertTests {

    @Test
    void assertTest() {
        try {
            assert false : "assert는 Error";
        } catch (Error error) {

        }
    }

}
