import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

fun main(){

    var connection : Connection? = null
    try{
        val url = "jdbc:mysql://localhost:3306/newdb"
        val user = "developer"
        val password = "developerpassword"

        connection = DriverManager.getConnection(url, user, password)

    }catch (e: SQLException){
        println(e.message)
    } finally {
        try {
            connection?.close()
        }catch (ex: SQLException) {
            println(ex.message)
        }
    }
}