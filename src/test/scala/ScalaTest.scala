import org.junit.jupiter.api.Assertions.{assertEquals, assertThrows}
import org.junit.jupiter.api.Test

class ScalaTest:
  @Test def testEquals(): Unit = assertEquals(2, 1 + 1)

  @Test def testException(): Unit =
    assertThrows(classOf[IllegalArgumentException], () => throw new IllegalArgumentException)
