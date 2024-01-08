package com.tuapp

class Consultorio {
    Integer numeroConsultorio
    Integer piso

    static hasMany = [citas: Cita]

    static constraints = {
        numeroConsultorio nullable: false
        piso nullable: false
    }

    String toString() {
        return "Consultorio[numeroConsultorio: ${numeroConsultorio}, piso: ${piso}]"
    }
}
