import org.mycompany.utils.Logger

def call(String status = "SUCCESS") {
    def logger = new Logger(this)

    if (status == "SUCCESS") {
        logger.info("Build completed successfully.")
    } else {
        logger.error("Build failed.")
    }
}
