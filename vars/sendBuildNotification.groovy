def call(String status = "SUCCESS") {
    if (status == "SUCCESS") {
        echo "✅ Build completed successfully!"
    } else {
        echo "❌ Build failed!"
    }
}
