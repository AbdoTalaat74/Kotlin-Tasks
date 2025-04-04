package ipv4Checker

fun main() {


}

fun isValidIPv4(ip: String): Boolean {
    // Split the IP address by dots
    val segments = ip.split(".")

    // Check if there are exactly 4 segments
    if (segments.size != 4) {
        return false
    }

    // Validate each segment
    for (segment in segments) {
        // Check if segment is empty
        if (segment.isEmpty()) {
            return false
        }

        // Check if segment contains only digits
        if (!segment.all { it.isDigit() }) {
            return false
        }

        // Check for leading zeros (except for a single '0')
        if (segment.length > 1 && segment[0] == '0') {
            return false
        }

        // Parse segment as integer and check the range
        try {
            val value = segment.toInt()
            if (value !in 0.. 255) {
                return false
            }
        } catch (e: NumberFormatException) {
            return false
        }
    }

    // All validations passed
    return true
}