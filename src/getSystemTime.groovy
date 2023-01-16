import java.time.LocalTime

new File("Path_to_file_in_diode").withWriter {
    it.write(LocalTime.now().withNano(0).toString())
}