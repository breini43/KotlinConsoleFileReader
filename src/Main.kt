import java.io.File

fun main() {
    val filePath = "D:\\1.txt"
    val file = File(filePath)

    // Чтение содержимого файла
    if (!file.exists()) {
        println("Файл не найден, создается новый файл.")
        file.createNewFile()
    }

    val initialContent = file.readText()
    println("Содержимое файла:")
    println(initialContent)

    // Предложить пользователю добавить текст
    println("Введите текст для добавления в файл (или оставьте строку пустой для выхода):")
    val userInput = readLine().orEmpty()

    if (userInput.isNotEmpty()) {
        // Добавить новый текст к существующему содержимому
        val updatedContent = "$initialContent\n$userInput"

        // Записать обновленное содержимое обратно в файл
        file.writeText(updatedContent)
        println("Текст успешно добавлен и сохранен в файл.")
    } else {
        println("Никакой текст не был введен. Выход без изменений.")
    }
}
