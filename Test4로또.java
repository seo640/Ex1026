package pm;

public class Test4로또 {

    public static void main(String[] args) {
        // 로또 번호를 저장할 배열 생성 (6개의 번호)
        int[] lotto = new int[6]; 

        // 로또 번호를 6개 뽑기 위한 반복문
        for (int i = 0; i < lotto.length; ) { // i를 조건문에서 증가시키지 않고 중복 시 다시 생성
            // 1부터 45까지의 난수를 생성
            int random = (int)(Math.random() * 45 + 1); 
            // 중복 여부를 판단하기 위한 변수 (초기값은 false)
            boolean isDuplicate = false; 

            // 이미 뽑은 번호와 중복되는지 확인하는 반복문
            for (int j = 0; j < i; j++) {
                // 현재 생성한 난수(random)와 기존에 뽑은 번호(lotto[j])를 비교
                if (lotto[j] == random) { 
                    isDuplicate = true; // 중복이 발견되면 true로 변경
                    break; // 중복이 발견되었으므로 더 이상 확인할 필요가 없으므로 탈출
                }
            }

            // 중복이 아닐 경우에만 배열에 저장
            if (!isDuplicate) {
                lotto[i] = random; // 중복이 없으면 배열에 난수 저장
                i++; // 다음 번호를 뽑기 위해 i 증가
            }
            // 중복인 경우에는 i를 증가시키지 않고 루프가 계속 진행됨
        }

        // 뽑힌 로또 번호 출력
        System.out.println("생성된 로또 번호: ");
        for (int i = 0; i < lotto.length; i++) {
            // 각 로또 번호를 출력
            System.out.printf("%d ", lotto[i]); 
        }
    }
}