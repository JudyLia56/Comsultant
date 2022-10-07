# README.md

## 1. 서비스 소개💻

빅데이터 기반 조립 컴퓨터 견적 추천 서비스

## 2. 팀 소개

| 팀원 | 고나령 | 김진회 | 신성은 | 유지태 | 윤주경 | 이예찬 |
| --- | --- | --- | --- | --- | --- | --- |
| 역할 | 팀장 / Back-end | Back-end / Front-end | Hadoop | Kafka / Back-end | Back-end / Front-end | Front-end |

## 3. 기술 스택🛠

**Front-end**

- React 18.2.0
- JavaScript ES6+
- SCSS / HTML5
- Chrome / Edge
- Axios 0.27.2
- Node.js 16.16.0
- Npm 8.11.0
- Redux 4.2.0
- React Router Dom 6.3.0
- ESLint 8.20.0
- Webpack 5.74.0
- Ant Design 4.23.1

**Back-end**

- JAVA 11
- Spring Boot 2.7.3
- Spring Security
- Hibernate
- JPA
- Gradle 7.5
- JWT 0.9.1
- MapStruct 1.5.2

**Database**

- Redis 7.0.4
- MongoDB 5.0.12
- MySQL

**Distributed System**

- Hadoop 3.2.2
- HDFS
- MapReduce
- Zookeeper 3.6.3
- Kafka 3.2.0

**Infra**

- NginX
- AWS EC2 Ubuntu 20.04 LTS
- Docker 20.10.18
- Docker Compose 1.29.2
- Jenkins

**Crawling**

- Selenium
- Scrapy

---

## 4. 서비스 아키텍처

![Service Architecture](/uploads/5e1fda2a7bb2b87b92f8b1d4759d42dc/KakaoTalk_20221007_114215696.png)

---

## 5. 기능 소개🔍

### 5-1-1 메인 화면 - 인기 견적

인기 견적들의 부품 정보와 총 가격을 확인할 수 있습니다. 

원하는 인기 견적을 클릭하면 견적 상세 화면(5-8-1)으로 이동할 수 있습니다.

맞춤 견적 버튼을 클릭해 맞춤 견적 화면으로 이동할 수 있습니다.

### 5-1-2 메인 화면 - 신상품

신상품을 확인할 수 있습니다.

부품 검색 버튼을 클릭해 부품 검색 화면으로 이동할 수 있습니다.

제품을 클릭하면 부품 상세 화면(5-6-1)으로 이동할 수 있습니다.

### 5-1-2 메인 화면 - 상단 캐러셀

자세히 버튼을 클릭하여 부품 검색 / 맞춤 견적 화면으로 이동할 수 있습니다.

### 5-2-1 내비게이션 바

로고를 클릭하면 메인 화면으로 이동할 수 있습니다.

부품 검색 / 맞춤 견적 / 회원가입 / 로그인 버튼을 클릭하면 해당 화면으로 이동할 수 있습니다.

로그인한 경우 로그인 버튼이 있던 위치에 로그아웃 버튼을 확인할 수 있고 로그아웃 버튼을 클릭하면  로그아웃과 동시에 메인 화면으로 이동합니다.

로그인한 경우 회원가입 버튼이 있던 위치에 마이페이지 버튼을 확인할 수 있고 마이페이지 버튼을 클릭하여 마이페이지 화면으로 이동할 수 있습니다.

스크롤을 내리면 내비게이션 바가 상단에 고정되어 사이트 하단의 내용을 확인하면서도 언제든지 내비게이션 바의 기능을 사용할 수 있습니다.

### 5-3-1 회원가입 - 일반

모든 항목은 필수이며 이메일은 이메일의 형식을 지켜야 합니다.

기존에 가입되어 있던 이메일로는 회원 가입할 수 없습니다.

이메일을 작성한 후 인증번호 전송 버튼을 클릭하면 해당 이메일로 이메일 인증번호가 전송됩니다.

이메일 인증번호를 작성한 후 인증번호 확인 버튼을 클릭하면 이메일 인증을 완료할 수 있습니다.

비밀번호는  8~16자 사이의 길이로 최소 하나의 문자, 숫자, 특수문자를 포함해야 합니다.

비밀번호 확인란의 값은 비밀번호란의 값과 일치해야 합니다.

비밀번호와 비밀번호 확인란 안의 값은 눈 모양 아이콘을 클릭하여 공개 / 비공개 상태로 전환할 수 있습니다.

닉네임은 2~15자 사이의 길이로 영어 / 숫자/ 한글로만 가능합니다. 초성은 불가능합니다.

출생연도의 달력 버튼을 클릭하면 연도를 선택하여 값을 입력할 수 있습니다.

모든 칸을 형식에 맞춰 입력하면 가입하기 버튼이 활성화되고 가입하기 버튼을 클릭해 가입을 완료할 수 있습니다.

회원 가입을 완료하면 로그인 화면으로 이동합니다.

돌아가기 버튼을 클릭하면 메인 화면으로 이동할 수 있습니다.

### 5-4-1 로그인 화면

중간에 위치한 회원가입 / 비밀번호 찾기 버튼을 클릭하면 해당 화면으로 이동합니다.

### 5-4-2 로그인 화면 - 일반 로그인

가입한 이메일과 비밀번호를 입력하여 로그인할 수 있습니다.

비밀번호 입력란의 눈 모양 아이콘을 클릭하여 입력한 비밀번호를 공개/비공개 전환할 수 있습니다.

로그인에 성공하면 메인 화면으로 이동합니다.

### 5-4-3 로그인 화면 - 소셜 로그인

구글, 카카오, 네이버 계정으로 가입 / 로그인할 수 있습니다.

### 5-5-1 부품 검색 화면

상단에서 부품 종류를 선택해 부품을 검색할 수 있습니다.

스크롤을 내리면 화면의 너비가 충분한 경우 내비게이션 바에 고정되어 사이트 하단의 내용을 확인하면서도 언제든지 부품 종류 선택이 가능합니다.

부품 종류 선택에 따라 상세 필터의 내용이 달라집니다.

선택한 필터에 따라 관련된 부품 목록 조회가 가능하고 필터는 수정이 가능합니다.

가격 슬라이더 범위를 조정해 원하는 가격대의 부품을 찾아볼 수 있습니다.

부품은 신상품순, 낮은 가격순, 높은 가격순으로 조회할 수 있으며 회원인 경우 원하는 부품의 하트를 클릭하면 마이페이지의 찜한 목록에서 해당 제품을 확인할 수 있습니다.

부품을 클릭하면 해당 부품의 상세 화면으로 이동할 수 있습니다.

### 5-5-2 부품 검색 화면 - 견적

회원의 경우 우측 상단에 PC추가하기 옆 +버튼을 클릭해 나만의 견적을 생성할 수 있습니다.

화면의 너비가 충분하지 않은 경우 필터와 제품 목록 사이에서 확인할 수 있습니다.

화면의 너비가 충분한 경우 스크롤을 내리면 우측에 고정되어 사이트 하단의 내용을 확인하면서도 언제든지 견적을 생성 / 조회 / 수정 / 삭제할 수 있습니다.

생성된 견적은 PC추가하기 하단에 목록으로 표시되고 X버튼을 클릭해 삭제할 수 있습니다.

목록에서 견적 이름을 클릭하면 견적 탭에 해당 견적 내용이 표시됩니다.

검색한 제품 목록을 더 자세히 보기 위해 견적 탭은 닫아둘 수 있습니다.

견적 탭을 누르면 선택된 견적의 이름, 해당 견적의 제품들을 확인할 수 있고 제품 검색 목록에서 견적담기 버튼을 클릭하면 견적 탭에 해당 제품이 추가됩니다.

기존에 입력된 제품들과 호환성이 맞지 않는 제품을 입력하려는 경우 호환되지 않음을 알립니다.

수량을 조절할 수 있고 제품 가격을 확인할 수 있습니다.

담긴 제품 우측 하단의 X버튼을 클릭하면 해당 제품이 견적에서 삭제됩니다.

### 5-6-1 제품 상세 화면

상단에서 제품의 이미지, 시세, 가격을 확인할 수 있으며 네이버 쇼핑검색 버튼을 클릭하면 해당 제품을 검색한 네이버 쇼핑 화면으로 이동할 수 있습니다.

제품의 이미지를 클릭하면 회전 / 확대해서 자세히 볼 수 있습니다.

회원인 경우 제품을 찜하거나 자신의 견적에 추가할 수 있습니다.

하단에서 제품의 상세 정보를 확인할 수 있고 회원인 경우 댓글을 작성 / 수정 / 삭제할 수 있습니다. 

비회원인 경우 댓글은 조회만 가능합니다. 

### 5-7-1 맞춤 견적 화면

용도, 사용 프로그램, 가격 범위, 추천 받기 원하는 부품 조합을 지정하여 견적을 추천 받을 수 있습니다.

용도에 따라 선택할 수 있는 사용 프로그램 종류가 달라집니다.

가격 슬라이더 범위를 조정해 원하는 가격대의 조합을 추천 받을 수 있습니다.

회원이라면 견적 선택하기 버튼을 클릭해 기존에 저장해둔 견적을 반영할 수 있고 견적 저장하기 버튼을 클릭해 현재의 조합을 저장할 수 있습니다.

회원이라면 우측 상단의 견적 초기화 버튼을 통해 입력된 값들을 초기화할 수 있습니다.

제품 종류에서 추천 받기를 원하는 부품만 체크해서 견적을 추천 받을 수 있고  원하는 제품이 있는 경우 직접 입력하여 해당 제품에 호환되는 견적도 추천 받을 수 있습니다.

직접 제품을 입력하는 경우 해당 제품 종류의 제품 선택란을 클릭하여 제품을 검색할 수도 있고 조회 기준을 설정해 원하는 제품을 고를 수도 있습니다. 

기존에 입력된 제품들과 호환성이 맞지 않는 제품을 입력하려는 경우 호환되지 않음을 알립니다.

제품 선택란에 제품이 입력된 경우 우측 상세보기 버튼을 클릭해 해당 부품 상세 화면으로 이동할 수 있습니다.

제품 종류와 제품 선택란 사이의 + 버튼을 클릭해 원하는 부품의 개수를 늘릴 수 있습니다.

추천받기 버튼을 클릭하면 지정한 조건에 맞춰 추천되는 견적과 가격 합을 하단에서 확인할 수 있습니다.

원하는 견적을 클릭하면  견적 상세 화면으로 이동합니다.

### 5-8-1 견적 상세 화면

하단의 이미지로 저장하기 버튼을 클릭해 견적을 이미지로 저장할 수 있습니다.

회원인 경우 하단의 견적 저장하기 버튼을 클릭해 견적을 저장할 수 있습니다.

직접 제품을 입력할 수 있으며 직접 제품을 입력하는 경우 해당 제품 종류의 제품 선택란을 클릭하여 제품을 검색할 수도 있고 조회 기준을 설정해 원하는 제품을 고를 수도 있습니다. 

같은 제품을 여러 개 사용하고 싶다면 수량 증가도 가능합니다.

### 5-8-1 마이페이지 화면 - 마이페이지

회원 정보 중 닉네임, 출생년도를 수정할 수 있습니다.

비밀번호를 틀린 경우 정보를 수정할 수 없습니다.

돌아가기 버튼을 클릭해 메인 화면으로 이동할 수 있습니다.

### 5-8-2 마이페이지 화면 - 댓글

작성한 댓글의 내용, 해당 제품의 이름과 사진, 댓글 작성일을 확인할 수 있습니다.

작성한 댓글 목록을 최신 순 / 오래된 순으로 확인할 수 있습니다.

제품의 이름을 클릭하면 해당 제품 상세 화면(5-6-1)으로 이동합니다.

### 5-8-3 마이페이지 화면 - 찜한 목록

찜한 제품의 이름과 사진, 찜한 날짜를 확인할 수 있습니다.

찜한 제품 목록을 최신 순 / 오래된 순으로 확인할 수 있습니다.

제품의 이름을 클릭하면 해당 제품 상세 화면(5-6-1)으로 이동합니다.

 

### 5-8-4 마이페이지 화면 - 견적

저장한 견적 목록을 한 페이지에 10개씩 확인할 수 있습니다. 

견적 목록은 저장했던 제품의 종류, 이름, 개당 가격, 개수를 보여줍니다

저장한 견적의 제품명을 클릭하면 해당 제품의 상세 화면으로 이동합니다.

삭제 버튼 클릭 시 해당 견적이 저장한 견적 목록에서 삭제됩니다.
