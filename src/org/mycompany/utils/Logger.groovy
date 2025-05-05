package org.mycompany.utils

class Logger implements Serializable {

    def steps

    Logger(steps) {
        this.steps = steps
    }

    def info(String msg) {
        steps.echo "INFO: ${msg}"
    }

    def error(String msg) {
        steps.echo "ERROR: ${msg}"
    }
}
