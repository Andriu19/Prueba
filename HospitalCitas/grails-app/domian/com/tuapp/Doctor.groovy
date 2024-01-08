// Doctor.groovy
package com.tuapp

class Doctor {
    String nombre
    String apellidoPaterno
    String apellidoMaterno
    String especialidad

    static constraints = {
        nombre nullable: false, blank: false
        apellidoPaterno nullable: false, blank: false
        apellidoMaterno nullable: false, blank: false
        especialidad nullable: false, blank: false
    }

    String toString() {
        return "Doctor[nombre: ${nombre}, apellidoPaterno: ${apellidoPaterno}, apellidoMaterno: ${apellidoMaterno}, especialidad: ${especialidad}]"
    }
}
