<!-- Parent: ../AI-CONTEXT.md -->

# src/main/java/com/example/demo/reply

## 목적

댓글 관련 도메인 로직 (작성, 삭제)을 담당.

## 주요 파일

| 파일명 | 설명 |
| --- | --- |
| Reply.java | 댓글 엔티티 |
| ReplyController.java | 댓글 API 컨트롤러 |
| ReplyService.java | 댓글 비즈니스 로직 |
| ReplyRepository.java | JPA 레포지토리 |
| ReplyRequest.java | 요청 DTO |
| ReplyResponse.java | 응답 DTO |

## 하위 디렉토리

- 없음

## AI 작업 지침

- 게시글(Board)과 연관관계를 `LAZY` 로딩으로 설정한다.
- API 응답 시 반드시 `Resp.ok()` 또는 `Resp.fail()`을 사용한다.

## 테스트

- 댓글 작성 및 삭제 테스트

## 의존성

- 내부: `Board`, `User` 엔티티와 연관관계
