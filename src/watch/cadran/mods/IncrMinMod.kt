package watch.cadran.mods

import watch.cadran.Cadran
import watch.imod.IMod

class IncrMinMod : IMod {
    override fun increment(cadran: Cadran) {
        cadran.incrementMin()
    }

    override fun nextMod(): IMod {
        return DoNothingMod()
    }
}