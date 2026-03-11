# Project Root

## 목적

Spring Boot 기반의 샘플 프로젝트 (Board, Reply, User 기능 포함).

## 주요 파일

| 파일명 | 설명 |
| --- | --- |
| build.gradle | 프로젝트 의존성 및 빌드 설정 |
| AI-GUIDE.md | AI 가이드 및 스킬 정의 |
| GEMINI.md | 프로젝트 초기화 및 협업 규칙 |

## 하위 디렉토리

- `src/main/java/com/example/demo/` - 핵심 자바 소스 코드
- `.ai/` - AI 관련 규칙, 스킬 및 에이전트(Agent) 정의
- `.person/` - 작업 히스토리 및 워크플로우

## AI 작업 지침

- `common-rule.md`의 컨벤션을 엄격히 준수한다.
- 새로운 기능을 추가할 때는 `deep-interview`를 통해 요구사항을 먼저 정의한다.
- 커밋 메시지 작성 시 `commit-agent`를 활용하여 상세한 변경 로그를 남긴다.
- 레이어 기반이 아닌 도메인 기반 플랫 구조를 유지한다.

## 테스트

- `./gradlew test` 실행으로 전체 테스트 수행

## 의존성

- 내부: Spring Boot, JPA, Mustache, H2
- 외부: `Resp.java` (공통 응답 포맷)
