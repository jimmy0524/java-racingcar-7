# 구현할 기능 목록

TDD 방식을 사용하여 실패하는 테스트 코드를 작성하고 → 테스트를 통과할 최소한의 기능 구현 → 기능 구현한 코드를 리팩토링 하는 순서로 진행하겠습니다.

- 입력
    - 경주할 자동차 이름
    - 시도할 횟수
- 출력
    - 차수별 실행 결과
    - 우승자 안내 문구 (단독 우승자 및 공동 우승자 판별)
- 자동차 경주
    - 입력받은 자동차 이름 구분하기(쉼표(,) 기준)
    - 각 자동차 위치 업데이트 (무작위 값이 4 이상일 경우 전진 아닐 경우 멈춤)
    - 우승자 판별
- 예외 처리
    - 자동차 이름 입력받는 상황
        - `,`와 `,` 사이에 아무 것도 입력되지 않았을 경우
        - 경계에 `,`가 존재할 경우
        - 이름이 5자 이하가 아닐 경우
        - 아무것도 입력되지 않았을 경우
    - 시도할 횟수 입력받는 상황
        - 아무것도 입력하지 않았을 경우
        - 문자가 포함되었을 경우
        - 범위를 벗어난 경우 (범위 : 1 이상 1000 이하로 설정)