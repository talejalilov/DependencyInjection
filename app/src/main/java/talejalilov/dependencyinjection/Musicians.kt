package talejalilov.dependencyinjection

import javax.inject.Inject

//Constructor Injection

class Musicians
    @Inject
    constructor(instrument: Instrument, band: Band) {

    fun sing(){

    }
}