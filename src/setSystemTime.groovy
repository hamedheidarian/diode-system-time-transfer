new File("Path_to_file_in_diode").eachLine {
    ('sudo date +%T -s '+it).execute()
}