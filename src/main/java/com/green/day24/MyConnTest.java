package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MyConnTest {
    public static void main(String[] args) {
        Connection conn = MyConn.getConn();
        String sql = "INSERT INTO country (country_id, country) " +
                "VALUES (111, '동하나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class MyConnTest2 {
    public static void main(String[] args) {
        //title : 처음작성
        //ctnts : 처음 작성하는 내용
        //wirter : 홍길동
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle("오늘 Insert배운");
        boardEntity.setCtnts("java를 통해 board테이블에 값 넣어봄");
        boardEntity.setWriter("신난다");

        BoardDao.insBoard(boardEntity);

    }
}
