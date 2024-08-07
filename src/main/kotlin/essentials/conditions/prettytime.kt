package essentials.conditions.prettytime


fun secondsToPrettyTime(seconds: Int): String {
    when {
        seconds < 0 -> return "Invalid input"
        seconds == 0 -> return "Now"
        else -> {
            val hours = seconds / 3600
            val minutes = (seconds % 3600) / 60
            val sec = seconds % 60
            val time = mutableListOf<String>()
            if (hours > 0) time.add("$hours h")
            if (minutes > 0) time.add("$minutes min")
            if (sec > 0) time.add("$sec sec")
            return time.joinToString(" ")

        }
    }
    return ""
}

fun main() {
    println(secondsToPrettyTime(-1)) // Invalid input
    println(secondsToPrettyTime(0)) // Now
    println(secondsToPrettyTime(45)) // 45 sec
    println(secondsToPrettyTime(60)) // 1 min
    println(secondsToPrettyTime(150)) // 2 min 30 sec
    println(secondsToPrettyTime(1410)) // 23 min 30 sec
    println(secondsToPrettyTime(60 * 60)) // 1 h
    println(secondsToPrettyTime(3665)) // 1 h 1 min 5 sec
}