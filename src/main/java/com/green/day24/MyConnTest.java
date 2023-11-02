package com.green.day24;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;

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
        boardEntity.setTitle("오늘의 점심");
        boardEntity.setCtnts("뭐먹지");
        boardEntity.setWriter("흠냠냠");
        int row = BoardDao.insBoard(boardEntity);


    }
}

class MyConnTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(2);

        int row = BoardDao.delBoard(entity);
    }
}

class MyConnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(3);
        entity.setTitle("수정 제목");
        entity.setCtnts("수정 내용");
        entity.setWriter("수정자");

        int row = BoardDao.udpBoard(entity);
        System.out.println("row: " + row);
    }
}

class MyConnTest5 {
   // BoardEntity entity = new BoardEntity();
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();
        for(BoardEntity entity : list) {
            System.out.println(entity);
        }
    }
}

class MyConnTest6 {
    public static void main(String[] args) {
        BoardEntity result = BoardDao.selBoardById(3);
        System.out.println(result);
    }
}
