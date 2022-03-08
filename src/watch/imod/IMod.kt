package watch.imod

import watch.cadran.Cadran

interface IMod {
    public fun increment(cadran: Cadran);
    public fun nextMod(): IMod;
}