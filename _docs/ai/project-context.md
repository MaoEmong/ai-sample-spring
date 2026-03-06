# Project Context

## 1. 프로젝트 개요
- 프로젝트명: `demo` (Spring Boot 기반)
- 프로젝트 성격: 블로그 만들기 프로젝트
- 핵심 도메인: `user`, `board`, `reply`
- 목표: 사용자/게시글/댓글 중심의 블로그 기능을 점진적으로 완성

## 2. 전체 아키텍처
- 아키텍처 스타일: 도메인 기반 플랫 패키지 + MVC 계층 분리
- 요청 흐름: `Controller -> Service -> Repository(JPA) -> H2`
- 렌더링 방식: SSR 서버 렌더링 (`Mustache`)
- 공통 응답 모델: `_core/utils/Resp<T>` (REST 응답 표준화 용도)

### 패키지 구조
- `com.example.demo._core.utils`: 도메인 공통 유틸 (`Resp`)
- `com.example.demo.user`: 사용자 도메인 (Entity/Controller/Service/Repository/DTO)
- `com.example.demo.board`: 게시글 도메인 (Entity/Controller/Service/Repository/DTO)
- `com.example.demo.reply`: 댓글 도메인 (Entity/Controller/Service/Repository/DTO)

### 도메인 관계
- `Board` N:1 `User` (`@ManyToOne(fetch = LAZY)`)
- `Reply` N:1 `User` (`@ManyToOne(fetch = LAZY)`)
- `Reply` N:1 `Board` (`@ManyToOne(fetch = LAZY)`)

## 3. 기술 스택
- Language: `Java 21`
- Framework: `Spring Boot 3.4.3`
- Build Tool: `Gradle`
- Web: `spring-boot-starter-web`
- Template Engine: `Mustache`
- ORM/DB: `Spring Data JPA`, `Hibernate`, `H2(in-memory)`
- Boilerplate Reduction: `Lombok`
- Dev Convenience: `Spring Boot DevTools`
- Test: `spring-boot-starter-test` (JUnit 5)

## 4. 런타임/설정 포인트
- 기본 포트: `8080`
- DB: `jdbc:h2:mem:test`
- H2 Console: 활성화
- SQL 초기화: `src/main/resources/db/data.sql`
- JPA 옵션:
- `open-in-view=false` (OSIV 비활성)
- `hibernate.default_batch_fetch_size=10`
- `show-sql=true`, `format_sql=true`
- 세션:
- `HttpSession` 기반 처리
- 세션 타임아웃 `1m`

## 5. 현재 구현 상태
- 엔티티/리포지토리/서비스/DTO 기본 골격이 `user`, `board`, `reply`에 구성됨
- 더미 데이터(`user_tb`, `board_tb`, `reply_tb`) 초기화 스크립트 적용됨
- 기본 페이지 라우팅: `/home -> home.mustache`
- 현재는 구조 중심 스캐폴딩 단계이며, 본격적인 CRUD/인증 비즈니스 로직은 확장 필요

## 6. 개발 원칙 (프로젝트 규칙 반영)
- 도메인 기반 플랫 구조 유지
- Entity를 Controller로 직접 노출하지 않고 Service에서 DTO로 변환
- 연관관계 Fetch 전략은 LAZY 유지
- SSR Controller와 REST API Controller를 분리
- REST 응답은 `Resp<T>` 래퍼 사용

## 7. 다음 추천 작업
- `user`: 회원가입/로그인/로그아웃 구현 + 세션 사용자 관리
- `board`: 게시글 목록/상세/작성/수정/삭제 구현
- `reply`: 댓글 작성/삭제 구현 및 게시글 상세와 통합
- `ApiController` 계층 추가 (`/api` prefix) 및 `Resp<T>` 일관 적용
- 테스트 보강: 서비스/컨트롤러 단위 및 통합 테스트 추가
