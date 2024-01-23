package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

/**
 * 목표<br><br>
 * properties 에 대해 이해하고 활용할 수 있다. <br>
 * <br>
 * @properties: HashMap과 유사하지만 key, value가 모두 String으로만 사용 가능한 자료구조이다. 주로 설정 파일 관련된 파일과의 입출력에 사용된다.(store,load 등)
 */
public class Application2 {
    public static void main(String[] args)  {
        // 참고. Map<String,String>과 같음
        Properties prop = new Properties();     // 참고. 제너릭 쓸 필요도 없다!
        prop.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url","jdbc:oracle:thin:@127.0.0.1:1521:xe");
        prop.setProperty("user","swcamp");
        prop.setProperty("password","swcamp");
        // 참고. hashmap보다 부가적인 기능이 있음. 파일 저장 관련 기능
        System.out.println("prop = " + prop);
    
        // 목차. 1. 예외 처리, 위 데이터를 담은 설정 파일 생성하기
        try {
            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
            prop.store(new FileWriter("driver.txt"),"jdbc driver2");
            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver3");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*설명. 저장한 파일에서 읽어온 데이터를 담을 프로퍼티 객체*/
        Properties prop2 = new Properties();
        try {
//            prop2.load(new FileInputStream("driver.dat"));
//            prop2.load(new FileReader("driver.txt"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prop2 = " + prop2);
        System.out.println("읽어온 후 ");
        System.out.println("driver: "+ prop2.getProperty("driver"));
        System.out.println("url: "+ prop2.getProperty("url"));
        System.out.println("user: "+ prop2.getProperty("user"));
        System.out.println("password: "+ prop2.getProperty("password"));
    }
}
