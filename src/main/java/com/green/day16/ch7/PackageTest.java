package com.green.day16.ch7;

import static com.green.day13.ch6.MyMath2.staticAbs; //static 메소드를 쓰고싶을때 import 뒤에 static 입력.
import static com.green.day13.ch6.MyMath2.staticNum; //import를 하고싶을때는 그 메소드에 public이 붙어 있어야 한다.
import com.green.day15.ch7.Parent;
//패키지를 전부 다 쓰고 싶을때는  ex) com.green.day15.ch7.*;  뒤에 .*를 붙여주면 된다
public class PackageTest {
    public static void main(String[] args) {
        // com.green.day15.ch7.Parent parent; 풀네임을 적여야 할때는 똑같은 이름의 class를 가져올때
        Parent parent;

       staticAbs(10);

       staticNum = 10;
    }
}

//private 맴버필드에 값을 넣는 방법 : 메소드 이용,생성자 이용.
//private 맴버필드에 값을 빼는 방법 : 메소드 이용.