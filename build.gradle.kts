tasks.register<Exec>("startBackgroundProcessWithShellScript") {
    commandLine = listOf("$projectDir/start-background-process.sh")
}
