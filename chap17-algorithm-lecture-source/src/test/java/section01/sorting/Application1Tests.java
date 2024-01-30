package section01.sorting;

import chap01.section01.sorting.Application1;
import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Application1Tests {

    private static int input1, input2;
    private static int[] act1,act2;
    private static int[] exp1,exp2;


    @BeforeAll  // 모든 테스트케이스 시작 전 세팅
    public static void set(){
        /*설명. 예시1*/
        input1 = 7;
        act1 = new int[]{34,24,5,23,1,9,12};
        exp1 = new int[]{1,5,9,12,23,24,34};
        /*설명. 예시2*/
        input2 = 6;
        act2 = new int[]{40,47,38,8,33,35};
        exp2 = new int[]{8,33,35,38,40,47};
    }

    public static Stream<Arguments> provideAscendingSource(){
        return Stream.of(Arguments.of(input1,act1,exp1),
                Arguments.of(input2,act2,exp2));
    }

    @DisplayName("버블 정렬 테스트")
    @Timeout(value =  1000, unit = TimeUnit.MILLISECONDS)
    @ParameterizedTest
    @MethodSource("provideAscendingSource")
    public void bubbleSortTests(int length, int[] actual, int[] expected){
        Application1.solution(actual);
        Assertions.assertArrayEquals(expected,actual);
    }
}
