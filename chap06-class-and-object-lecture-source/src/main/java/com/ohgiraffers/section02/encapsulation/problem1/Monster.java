package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    // 참고. 이 변수들은 필드이자 전역변수이자 속성이다.

    private String name;
    private int hp;
    Monster(){
        name = null;
        hp = 0;
        printMonster();
    };

    Monster(String name, int hp){
        System.out.printf("%s 몬스터 생성",name);
        setName(name);         // 참고, this는 메소드 호출 당시의 monster 객체를 의미한다.\
        setHp(hp);
        printMonster();
    };

    void printMonster(){
        System.out.println("\n===================================");
        System.out.println("\n    몬스터 정보      ");
        System.out.println(" 이름: "+getName());
        System.out.println(" HP: "+getHp()+'\n');
        System.out.println("===================================\n");
    }
    void Heal(int val){
        System.out.println(getName()+" HP +"+val);
        setHp(hp+val);
        System.out.println("현재 HP = " + hp);
    }
    void damaged(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp<0) {
            System.out.println("HP가 0보다 작습니다.");
            this.hp=0;
            return;
        }
        this.hp = hp;
    }
}
