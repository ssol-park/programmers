## 배열
 - 메모리의 연속 공간에 값이 채워져 있는 형태의 자료구조
 - 인덱스를 통해 참조할 수 있다. (인덱스를 사용하여 값에 바로 접근 가능)
 - 선언한 자료형의 값만 저장할 수 있다.
 - 배열의 크기는 선언 시 지정할 수 있고, 한 번 지정된 크기를 변경할 수 없다.
 - 새로운 값을 삽입하거나, 특정 인덱스의 값을 삭제하기 어렵다. 삽입/삭제 시 해당 인덱스 주변에 있는 값을 이동시키는 과정이 필요하다.
## 리스트
 - 값과 포인터를 묶는 '노드'를 포인터로 연결한 자료구조
 - 인덱스가 없으므로 값에 접근하기 위해 Head 포인터부터 순서대로 접근해야 한다. (= 값에 접근하는 속도가 느림)
 - 포인터로 연결되어 있으므로 데이터 삽입/삭제 연산이 빠르다.
 - 선언 시 크기를 지정하지 않아도된다. (=가변적임)
 - 포인터를 저장할 공간이 필요하므로 배열보다 구조가 복잡하다.
