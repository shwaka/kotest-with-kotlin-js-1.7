## Usage
1. Run `./gradlew jsTest`.
    - Tests should be run correctly and a test should fail (since it contains `1 shouldBe 2`).
2. Replace `val kotlinVersion` and/or `val kotestVersion` in `build.gradle.kts`.
    - `kotlinVersion`: `1.6.21` → `1.7.21` (or higher)
    - `kotestVersion`: `5.4.1` → `5.4.2` (or higher)
3. Run `./graldew jsTest` again.
    - Then compile error occurs.

## References
- [Quick Start | Kotest](https://kotest.io/docs/quickstart/)
- [Maven Central artifacts of multiplatform-plugin-* moved to “legacy”? · Issue #3321 · kotest/kotest](https://github.com/kotest/kotest/issues/3321)
- [Compilation fails for Kotlin/Native targets with Kotlin 1.7 · Issue #3060 · kotest/kotest](https://github.com/kotest/kotest/issues/3060)
- [Maven Central: Search](https://central.sonatype.com/search?q=kotest+framework+multiplatform+plugin&smo=true)
- [kotest/kotest-examples-javascript](https://github.com/kotest/kotest-examples-javascript)
