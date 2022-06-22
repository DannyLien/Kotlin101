package db

import java.sql.DriverManager

fun main() {
    val conn = DriverManager.getConnection("jdbc:mariadb://localhost/", "root", "abc123")
    val stmt = conn.createStatement()

//    println("-------show databases------------")
//    val rs = stmt.executeQuery("show databases")
//    while (rs.next()) {
//        println(rs.getString("Database"))
//    }

//    println("------show tables-----------")
//    stmt.executeQuery("use demo")
//    val rs = stmt.executeQuery("show tables")
//    var i = 0
//    while (rs.next()) {
//        i++
//        println(rs.getString(i))
//    }

    println("--------show item--------")
    stmt.executeQuery("use demo")
    val rs = stmt.executeQuery("select * from cars")
    println("id\t\t\tenter\t\tbb")
    while (rs.next()) {
        val id = rs.getString("id")
        val enter = rs.getString("enter")
        val bb = rs.getString("bb")
        println("$id\t$enter\t$bb")
    }
    rs.close()
    stmt.close()
    conn.close()

}

