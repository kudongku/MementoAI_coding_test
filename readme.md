# MementoAI 인턴 코딩테스트 해설
- src/main/java/Question class에 solution method로 솔루션을 구현해놨습니다.
- src/main/java/Main class에 문제에서 제시된 예시와 제가 추가한 예시를 작성해놓고, 출력하였습니다.
---
## 1) 제일 작은 수 제거하기
```java
        int length = arr.length;

        if (length == 1) {
            return new int[]{-1};
        }
```
- 길이가 1인 arr에 한해서 {-1}을 리턴하는 과정입니다.
```java
        int minValue = arr[0];

        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }
```
- arr을 1차 순회하며 최솟값을 찾는 과정입니다.
```java
        int[] returnArray = new int[length - 1];

        for (int j = 0, pointer = 0; j < length; j++) {
            if (arr[j] != minValue) {
                returnArray[pointer++] = arr[j];
            }
        }
```
- 최솟값을 제회하고 리턴배열에 추가하는 과정입니다.
- pointer라는 변수는 리턴배열에 아직 추가되지 않은 인덱스 값을 저장하는 역할입니다.
---
## 2) 문자열 내림차순으로 정렬하기
```java
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
```
- 대문자는 소문자보다 낮은 char값을 가지기 때문에 Arrays.sort배열을 통해 대문자 -> 소문자, a -> z 순으로 정렬해주었습니다.
```java
    StringBuilder returnValue = new StringBuilder();

    for (int i = charArray.length - 1; i >= 0; i--) {
        returnValue.append(charArray[i]);
    }

    return returnValue.toString();
```
- 내림차순의 정렬을 요구했기 때문에 배열을 역순으로 순회하며 stringbuilder에 추가했습니다.
- String 대신에 StringBuilder를 사용해서 문자열을 합치는 성능을 개선했습니다.