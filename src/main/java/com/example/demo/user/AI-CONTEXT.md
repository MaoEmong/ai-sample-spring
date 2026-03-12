<!-- Parent: ../AI-CONTEXT.md -->

# user

## 목적

사용자 인증 및 회원 관리(도메인) 로직을 담당한다.

## 주요 파일

| 파일명 | 설명 |
| --- | --- |
| User.java | 사용자 엔티티 (JPA) |
| UserApiController.java | 사용자 관련 REST API 컨트롤러 (`/api` 엔드포인트) |
| UserController.java | 사용자 관련 SSR 컨트롤러 (회원가입, 로그인 뷰 등) |
| UserRepository.java | 사용자 관련 JPA 데이터 접근 레포지토리 |
| UserRequest.java | 사용자 도메인 관련 요청 DTO 모음 (Login, Join 등) |
| UserResponse.java | 사용자 도메인 관련 응답 DTO 모음 |
| UserService.java | 사용자 도메인 비즈니스 로직 및 트랜잭션 처리 |

## 하위 디렉토리

- 없음

## AI 작업 지침

- 세션 관리는 `HttpSession`을 사용한다.
- 비밀번호 등 민감 정보는 DTO를 통해 필터링하여 응답한다.
- REST API(`UserApiController`) 응답 시에는 반드시 `_core/utils/Resp` 래퍼를 사용한다.
- DTO는 `UserService` 내부에서 생성하여 반환하며, Controller로 엔티티를 직접 전달하지 않는다.

## 테스트

- 회원가입 및 로그인 테스트

## 의존성

- 내부: `_core/utils/Resp` (API 응답용)
- 외부: Spring Boot Session 지원