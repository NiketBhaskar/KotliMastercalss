package files

import java.io.File

fun main(){
    val todoList = createFile("todo_list")
    while(true) {
        val operationCodes = OperationCode.entries
        println("Enter Operation Code - \n 0. ${operationCodes[0].title} \n 1. ${operationCodes[1].title} \n 2. ${operationCodes[2].title}")
        var operationCode = operationCodes[readln().toInt()]
        when (operationCode){
            OperationCode.SHUTDOWN -> break
            OperationCode.NEWTASK ->{
                while(true) {
                    println("Enter the task. To exit enter 0 : ")
                    var task = readln().toString()
                    if (task != "0") {
                        todoList.appendText(task)
                        todoList.appendText("\n")
                    } else {
                        break
                    }
                }
            }
            OperationCode.DISPLAYTASKS -> {
                var taskList = convertContentToList(todoList)
                for(task in taskList){
                    println("${taskList.indexOf(task)}. $task")
                }
            }
        }
    }
//    println(convertContentToList(todoList))
}
fun convertContentToList(fileName: File): List<String>{
    var taskList = mutableListOf<String>()
    val contentOfFile = fileName.readText()
    taskList = contentOfFile.split("\n").toMutableList()
    taskList.removeAt(taskList.lastIndex)
    return taskList
}

fun createFile(fileName: String): File{
    return File("$fileName.txt")
}
fun readFile(fileName: File): String{
    return fileName.readText()
}

