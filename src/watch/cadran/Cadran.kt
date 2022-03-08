package watch.cadran

import watch.imod.IMod
import java.time.LocalTime

class Cadran(
    private var mod: IMod,
    private var minutes: Long = 0,
    private var hours: Long = 0,
    private var light: Boolean = false
) {
    fun increment()  {
        mod.increment(this)
    }

    fun changeMod() {
        mod = mod.nextMod()
    }

    fun light() {
        light = !light
    }



    internal fun incrementMin() {
        minutes++
        if (minutes == 60L) {
            incrementHour()
            minutes = 0
        }
    }

    internal fun incrementHour() {
        hours++
        if (hours == 24L) {
            hours = 0
        }
    }

    fun getTime(): LocalTime {
        return LocalTime.now().plusHours(hours).plusMinutes(minutes)
    }

    fun getLight(): Boolean {
        return light
    }
}