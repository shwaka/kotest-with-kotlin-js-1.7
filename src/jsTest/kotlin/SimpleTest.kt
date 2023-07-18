import kotlin.test.Test
import kotlin.test.assertEquals

class TestClient {
    @Test
    fun testGreet() {
        assertEquals("world", greet())
    }

    @Test
    fun failingTest() {
        assertEquals(1, 2)
    }
}
