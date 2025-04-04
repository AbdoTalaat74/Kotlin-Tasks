package ipv4Checker


fun main() {
    check(
        name = "given a valid IP address when validated then it should return true",
        result = isValidIPv4("192.168.1.1"),
        correctResult = true
    )

    /*
        "192.168.1.256",  // Last segment > 255
        "256.168.1.1",    // First segment > 255
        "192.256.1.1",    // Second segment > 255
        "192.168.256.1",  // Third segment > 255
        "192.168.1.-1",   // Negative number
        "-1.168.1.1"      // Negative number
    */

    check(
        name = "given an IP with a segment outside the range 0..255 when validated then it should return false",
        result = isValidIPv4("192.168.1.256"),
        correctResult = false
    )
    /*
        "192.168.01.1",   // Leading zero in third segment
        "192.168.1.01",   // Leading zero in fourth segment
        "192.068.1.1",    // Leading zero in second segment
        "092.168.1.1",    // Leading zero in first segment
        "00.168.1.1",     // Multiple leading zeros
        "001.002.003.004" // Leading zeros in all segments
     */
    check(
        name = "given an IP with leading zeros in segments when validated then it should return false",
        result = isValidIPv4("192.168.01.1"),
        correctResult = false
    )

    /*
        "0.0.0.0",
        "192.0.1.1",
        "192.168.0.1",
        "192.168.1.0"
     */
    check(
        name = "given an IP with single zero segments when validated then it should return true",
        result = isValidIPv4("192.0.1.1"),
        correctResult = true
    )


    /*
        "192.168.1",      // Only 3 segments
        "192.168.1.1.1",  // 5 segments
        "192.168",        // Only 2 segments
        "192",            // Only 1 segment
        ""
     */
    check(
        name = "given an IP with fewer than 4 segments when validated then it should return false",
        result = isValidIPv4("192.168.1"),
        correctResult = false
    )

    check(
        name = "given an IP with more than 4 segments when validated then it should return false",
        result = isValidIPv4("192.168.1.1.1"),
        correctResult = false
    )

    /*
        "192.168.1.a",     // Letter in segment
        "a.168.1.1",       // Letter in segment
        "192.a.1.1",       // Letter in segment
        "192.168.a.1",     // Letter in segment
        "192.168.1.1a",    // Letter at end
        "a192.168.1.1",    // Letter at beginning
        "192.168.1.1.",    // Extra dot at end
        ".192.168.1.1",    // Extra dot at beginning
        "192..168.1.1",    // Double dot
        "192.168.1.1 ",    // Space at end
        " 192.168.1.1",    // Space at beginning
        "192.168.1.#"
     */
    check(
        name = "given an IP with non-numeric characters when validated then it should return false",
        result = isValidIPv4("192.168.1.*"),
        correctResult = false
    )

    /*
        "192.168..1",     // Empty third segment
        "192..168.1",     // Empty second segment
        "..168.1",        // Multiple empty segments
        "192.168.1.",     // Empty segment at end
        ".192.168.1"      // Empty segment at beginning

     */
    check(
        name = "given an IP with empty segments when validated then it should return false",
        result = isValidIPv4("192.168.."),
        correctResult = false
    )



}

fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}