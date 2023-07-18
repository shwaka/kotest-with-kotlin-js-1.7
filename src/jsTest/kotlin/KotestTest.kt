import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class KotestTest : StringSpec({
    "1 should be 1" {
        1 shouldBe 1
    }

    "failing test" {
        1 shouldBe 2
    }
})
