<!-- Parent: ../AI-CONTEXT.md -->

# src/main/java/com/example/demo/board

## 목적

게시판 관련 도메인 로직 (조회, 작성, 수정, 삭제)을 담당.

## 주요 파일

| 파일명 | 설명 |
| --- | --- |
| Board.java | 게시판 엔티티 |
| BoardController.java | 게시판 SSR 컨트롤러 |
| BoardService.java | 게시판 비즈니스 로직 |
| BoardRepository.java | JPA 레포지토리 |
| BoardRequest.java | 요청 DTO (Save, Update 등) |
| BoardResponse.java | 응답 DTO (Max, Min, Detail 등) |

## 하위 디렉토리

- 없음

## AI 작업 지침

- `common-rule.md`의 엔티티 및 DTO 컨벤션을 준수한다.
- SSR 방식은 Mustache 템플릿을 사용하여 `String`을 반환한다.

## 테스트

- 게시글 저장 및 조회 테스트

## 의존성

- 내부: `User` 엔티티와 연관관계 (작성자)
- 외부: `Resp.java` (API 응답 시)
