package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO : data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) {
        int result = 0;
        /*
        String sql = "INSERT INTO board(title,ctnts,writer)" +
                "VALUES" +
                "(?, ?, ?) ";

         */
        String sql = "INSERT INTO board " +               //UPDATE문 처럼 SET을 쓸수도 있다.
                "SET title = ? " +
                ", ctnts = ? " +
                ", writer = ? ";

        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());


            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sql = "DELETE FROM board " +
                "WHERE iboard = ?";
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }

    public static List<BoardEntity> selBoardList() {
        List<BoardEntity> list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title, writer, created_at  FROM board";
        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // SELECT는 executeQuery()를 쓴다

            while (rs.next()) {
                int iboard = rs.getInt("iboard");
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");

                BoardEntity entity = new BoardEntity();
                entity.setIboard(iboard);
                entity.setTitle(title);
                entity.setWriter(writer);
                entity.setCreatedAT(createdAt);


                list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return list;
    }

    public static BoardEntity selBoardById(int pk) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * " +
                "FROM board " +
                "WHERE iboard = ?";

        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pk);
            rs = ps.executeQuery(); // SELECT는 executeQuery()를 쓴다


            if (rs.next()) {
                //  int iboard = rs.getInt("iboard");
                // String title = rs.getString("title");
                // String writer = rs.getString("writer");
                // String createdAt = rs.getString("created_at");
                BoardEntity entity = new BoardEntity();
                entity.setIboard(pk);
                entity.setTitle(rs.getString("title"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setWriter(rs.getString("writer"));
                entity.setCreatedAT(rs.getString("created_at"));
                entity.setUpdatedAT(rs.getString("updated_at"));

                return entity;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps, rs);
        }
        return null;
    }

    public static int udpBoard(BoardEntity entity) {
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE board " +
                "SET title = ? " +
                ", ctnts = ? " +
                ", writer = ? " +
                ", updated_at = now() " +
                "WHERE iboard = ?";

        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(con, ps);
        }
        return result;
    }
}
