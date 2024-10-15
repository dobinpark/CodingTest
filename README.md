<정수값을 결과값으로 줄 때>

    1.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    - 이 코드는 한 줄의 입력을 BufferedReader로 읽고, Integer.parseInt를 사용하여 문자열을 정수로 변환합니다.
    - 입력을 받을 때마다 br.readLine()을 호출하므로, 입력 줄마다 별도로 처리됩니다.
    - 장점: 한 줄 입력을 받고 이를 정수로 변환하는 데 최적화되어 있습니다.
    - 단점: 여러 개의 정수나 값을 입력받을 때는 매번 readLine()을 호출하고 파싱해야 하므로 비효율적일 수 있습니다.

    2.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.readLine());

    - StringTokenizer는 BufferedReader로 입력받은 한 줄을 공백 단위로 분리하여 여러 값을 쉽게 파싱할 수 있도록 도와줍니다.
    - 예를 들어, "10 20 30"과 같은 여러 개의 값을 한 줄로 입력받고 이를 정수로 변환해야 할 때 유리합니다.
    - 장점: 여러 개의 값을 한 줄로 입력받고 이를 파싱해야 할 때 성능이 더 좋습니다.
    - 단점: 단일 값을 받을 때는 StringTokenizer가 필요 없고, 불필요한 작업이 추가될 수 있습니다.

    속도 차이 요약
    - 두 코드 모두 입력을 처리하는 데 있어서 큰 차이가 나지는 않지만,
    일반적으로 StringTokenizer는 여러 개의 값을 공백 기준으로 쉽게 파싱할 수 있어, 여러 값을 한 번에 처리할 때 더 효율적입니다.
    - 단일 값을 입력받는 상황이라면 첫 번째 코드가 더 간단하고 적합합니다.
    StringTokenizer를 사용할 필요가 없기 때문에, 불필요한 오버헤드가 줄어듭니다.

    따라서, 단일 값을 입력받을 때는 첫 번째 방식이 낫고, 여러 값을 한 줄로 입력받을 때는 두 번째 방식이 더 효율적일 수 있습니다.

    <문자열값을 결과값으로 줄 때>

    1. 문자열 입력을 받을 때는 BufferedReader로 한 줄을 읽고 그대로 사용하면 됩니다.
    readLine() 메서드는 입력된 문자열을 그대로 반환하므로 별도의 파싱 작업이 필요 없습니다.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    - 이 코드는 한 줄의 문자열을 읽어서 str 변수에 저장합니다.
    - 예를 들어, 사용자가 "Hello World"라고 입력하면, str 변수에는 그대로 "Hello World"가 저장됩니다.

    2. 만약 공백으로 구분된 여러 문자열을 입력받아 각각의 단어로 나누어야 하는 경우 StringTokenizer를 사용할 수 있습니다.

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    String str1 = st.nextToken(); // 첫 번째 문자열
    String str2 = st.nextToken(); // 두 번째 문자열

    - 예를 들어, 사용자가 "Hello World"라고 입력하면, str1에는 "Hello"가, str2에는 "World"가 저장됩니다.
    - StringTokenizer는 입력된 문자열을 공백 단위로 분리할 때 유용합니다.
    - 여러 단어를 공백 단위로 나눠서 사용할 경우 효율적으로 처리할 수 있습니다.

    요약
    - 단일 문자열을 입력받을 때는 BufferedReader로 readLine()을 사용하여 바로 입력받는 것이 좋습니다.
    - 공백으로 구분된 여러 문자열을 한 줄로 입력받아 각각의 단어를 분리하고 싶을 때는 StringTokenizer를 활용하면 효율적입니다.
