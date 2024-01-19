package com.ohgiraffers.section02.string;

public class Application1 {
/**
 * 목표<br><br>
 * 1. String 클래스의 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다.<br>
 */

    public static void main(String[] args) {
        /*필기.
            * CharAt(): 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다. - 0부터 시작 */

        String str1 = "apple";
        for(int i=0; i< str1.length();i++){
            System.out.printf("CharAt(%d): %c\n",i,str1.charAt(i));
        }

        /*필기.
            * compareTo(): 인자로 전달된 문자열과 사전 순으로 비교 */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "mariaDB";
        System.out.println(str2.compareTo(str3));       // 0
        System.out.println(str2.compareTo(str4));       // 32
        System.out.println(str4.compareTo(str2));       // -32
        System.out.println(str2.compareTo(str5));       // -3
        System.out.println(str5.compareTo(str2));       // 3

        /*필기.
         * concat(): 문자열에 인자로 전달된 문자열을 합쳐서 새로운 문자열 반환 */
        System.out.println("concat(): " + str2.concat(str5));
        System.out.println("str2: "+ str2);

        /*필기.
         * indexOf(): 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환(불일치:-1) */
        String indexOf = "java mariaDB";
        System.out.println("indexOf('a'): "+indexOf.indexOf('a'));
        System.out.println("indexOf('z'): "+indexOf.indexOf('z'));
        /*필기.
         * lastIndexOf(): 문자열 탐색을 뒤부터 시작, 처음 일치하는 위치의 인덱스 반환(불일치:-1)*/
        System.out.println("indexOf('a'): "+indexOf.lastIndexOf('a'));
        System.out.println("indexOf('z'): "+indexOf.lastIndexOf('z'));
        /*필기.
         * trim(): 문자열 앞 뒤 공백 제거한 문자열 반환*/
        String trimStr = "     java    ";
        System.out.println("trimStr: #"+trimStr+"#");
        System.out.println("trim() : #"+trimStr.trim()+"#");
        /*필기.
         * toLowerCase(): 소문자로 변환
         * toUpperCase(): 대문자로 변환
         * */
        String caseStr = "javamariaDB";
        System.out.println("toLowerCasse():"+ caseStr.toLowerCase());
        System.out.println("toUpperCasse():"+ caseStr.toUpperCase());
        System.out.println("caseStr: "+ caseStr);
        /*필기.
         * substring(): 문자열 일부분 잘라 새로운 문자열 반환
         * */
        String javamariaDB = "javamariaDB";
        System.out.println("substring(3,6): "+javamariaDB.substring(3,6));
        System.out.println("substring(3): "+ javamariaDB.substring(3));
        /*필기.
         * replace(): 문자열에 대체할 문자열로 기존 문자열을 변경하여 반환
         * */
        System.out.println("replace(): "+ javamariaDB.replace("java","python"));
        System.out.println("javamariaDB: " +javamariaDB);
        /*필기.
         * length(): 문자열 길이를 정수형으로 반환
         * */
        System.out.println("length(): "+ javamariaDB.length());
        System.out.println("빈 문자열 길이: "+ "".length());

        /*필기.
         * isEmpty(): 문자열 길이가 0이면 참, 아니면 거짓
         * */
        System.out.println("isEmpty()"+ "".isEmpty());
        System.out.println("isEmpty()"+ "abc".isEmpty());

    }
}
