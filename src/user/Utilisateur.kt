package user

import watch.cadran.Cadran
import watch.cadran.mods.DoNothingMod

class Utilisateur {

    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            val cadran = Cadran(DoNothingMod())
            describe(cadran)
            cadran.changeMod()
            cadran.increment()
            describe(cadran)
            cadran.changeMod()
            cadran.increment()
            describe(cadran)
            cadran.changeMod()
            cadran.increment()
            describe(cadran)
            cadran.light()
            describe(cadran)
            cadran.light()
            describe(cadran)
            Thread.sleep(1000L)
            describe(cadran)

        }

        @JvmStatic
        private fun describe(cadran: Cadran) {
            println(cadran.getTime())
            println(cadran.getLight())
            println()
        }
    }
}