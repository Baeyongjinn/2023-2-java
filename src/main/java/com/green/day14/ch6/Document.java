package com.green.day14.ch6;

public class Document {
    String name;                        //전역변수는 객체가 살아있는동안 값이 저장.
    static int cnt = 1;



    public Document() {

       this(String.format("제목없음%d",cnt++));
    }



    public Document(String name) {
        this.name = name;              //지역변수는 값이 초기화.
        System.out.printf("문서 %s가 생성되었습니다.\n", this.name);

    }
}

class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document(); //문서 제목없음1가 생성되었습니다.
        Document d2 = new Document("자바.txt"); //문서 자바.txt가 생성되었습니다.
        Document d3 = new Document(); //문서 제목없음2가 생성되었습니다.
        Document d4 = new Document(); //문서 제목없음3가 생성되었습니다.
        Document d5 = new Document(); //문서 제목없음4가 생성되었습니다.
    }

}
