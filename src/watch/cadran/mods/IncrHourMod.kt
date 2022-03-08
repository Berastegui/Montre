package watch.cadran.mods

import watch.cadran.Cadran
import watch.imod.IMod

class IncrHourMod : IMod {
    override fun increment(cadran: Cadran) {
        cadran.incrementHour()
    }

    override fun nextMod(): IMod {
        return IncrMinMod()
    }
}