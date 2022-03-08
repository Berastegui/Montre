package watch.cadran.mods

import watch.cadran.Cadran
import watch.imod.IMod

class DoNothingMod : IMod {
    override fun increment(cadran: Cadran) {}
    override fun nextMod(): IMod {
        return IncrHourMod()
    }
}