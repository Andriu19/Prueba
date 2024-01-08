// DoctorController.groovy
package com.tuapp

class DoctorController {
    def index() {
        def doctors = Doctor.list()
        [doctors: doctors]
    }

    def create() {
        // Lógica para crear un nuevo doctor
        def doctor = new Doctor(params)
        if (doctor.save()) {
            redirect(action: 'index')
        } else {
            render(view: 'index', model: [doctors: Doctor.list(), error: 'Error al crear el doctor'])
        }
    }
}
