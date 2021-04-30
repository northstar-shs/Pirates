# Pirates
Pirates Test

1. 설치 및 환경설정 가이드
  1-1. 개발환경
  -windows 10
  -jre 1.8.0-23 (java 1.8)
  -eclipse 2019-12 (4.14.0)
  -h2 database

  1-2. database
  -port: 8080
  -url: jdbc:h2:mem:testdb
  -driverClassName: org.h2.Driver
  -password : 

  1-3. project spec
  -spring boot 2.4.5.RELEASE
  -spring-boot-starter-tomcat
  -spring-boot-starter-web
 
 
 2.테이블 생성 SQL
 - SELECT * FROM STORE
 
 3.API 사용 가이드
 - POST : http://localhost:8080/api/store/
             BODY 에 점포 추가 API 담아 보내면 점포 관련 데이터가 STORE 테이블에 저장됨.
             
 - GET : http://localhost:8080/api/store/
             STORE 테이블에 저장된 모든 점포 정보를 RESPONSE BODY 에 담아 보내줌.
             
 - GET : http://localhost:8080/api/store/{ID}
             ID 값을 함께 요청하면 해당 ID 점포의 정보만을 RESPONSE BODY 에 담아 보내줌.
             
 - DELETE : http://localhost:8080/api/store/{ID}
             STORE 테이블의 해당 ID를 갖고 있는 ROW 삭제
