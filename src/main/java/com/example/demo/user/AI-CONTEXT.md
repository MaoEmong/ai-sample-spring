<!-- Parent: ../AI-CONTEXT.md -->

# src/main/java/com/example/demo/user

## 목적

사용자 인증 및 회원 관리 도메인 로직을 담당.

## 주요 파일

| 파일명 | 설명 |
| --- | --- |
| User.java | 사용자 엔티티 |
| UserController.java | 사용자 관련 SSR 컨트롤러 (로그인, 회원가입) |
| UserService.java | 사용자 비즈니스 로직 |
| UserRepository.java | JPA 레포지토리 |
| UserRequest.java | 요청 DTO (Login, Join 등) |
| UserResponse.java | 응답 DTO |

## 하위 디렉토리

- 없음

## AI 작업 지침

- 세션 관리는 `HttpSession`을 사용한다.
- 비밀번호 등 민감 정보는 DTO를 통해 필터링하여 응답한다.

## 테스트

- 회원가입 및 로그인 테스트

## 의존성

- 내부: Spring Boot Session 지원
