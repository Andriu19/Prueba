// Cita.groovy
package com.tuapp

import java.util.Date

class Cita {
    Doctor doctor
    Date horarioConsulta
    String nombrePaciente
    String estado

    static constraints = {
        doctor nullable: false
        horarioConsulta nullable: false
        nombrePaciente nullable: false, blank: false
        estado nullable: false, blank: false
    }

    String toString() {
        return "Cita[doctor: ${doctor?.nombre}, horarioConsulta: ${horarioConsulta}, nombrePaciente: ${nombrePaciente}, estado: ${estado}]"
    }
}
