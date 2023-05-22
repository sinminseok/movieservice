package view;

import java.util.Scanner;



public class InputView {
    private static final Scanner scanner = new Scanner(System.in);


    public static int inputMovieId() {
        try {
            System.out.println("## 예약할 영화를 선택하세요.");
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputMovieId();
        }
    }

    public static int inputMovieTimeId() {
        try {
            System.out.println("## 예약할 영화 시간을 선택하세요.");
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputMovieTimeId();
        }
    }

    public static int inputCapacity() {
        try {
            System.out.println("## 예매 인원을 입력해주세요.");
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputCapacity();
        }
    }

    public static int inputRestart(){
        try {
            System.out.println("다시 시작하겠습니까? 0 종료 1 다시시작");
            return Integer.parseInt(scanner.nextLine().trim());
        }catch (IllegalArgumentException e){
            System.out.println("올바리자 않은 입력입니다.");
            return inputRestart();
        }
    }


}