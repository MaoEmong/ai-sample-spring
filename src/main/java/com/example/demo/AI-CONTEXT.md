<!-- Parent: ../AI-CONTEXT.md -->

# src/main/java/com/example/demo

## 목적
프로젝트의 핵심 자바 소스 코드가 위치하는 루트 패키지.

## 주요 파일
| 파일명 | 설명 |
| --- | --- |
| DemoApplication.java | Spring Boot 애플리케이션 시작점 |

## 하위 디렉토리
- `_core/` - 공통 유틸리티 및 예외 처리
- `board/` - 게시판 관련 도메인 로직
- `reply/` - 댓글 관련 도메인 로직
- `user/` - 사용자 관련 도메인 로직

## AI 작업 지침
- 도메인 기반 플랫 구조를 준수한다.
- `@Controller` (SSR)와 `@RestController` (API)를 구분한다.
- 모든 API 응답은 `_core/utils/Resp.java`를 사용한다.

## 테스트
- 도메인별 단위 테스트 및 통합 테스트 수행

## 의존성
- 내부: `_core` 패키지의 유틸리티 활용
