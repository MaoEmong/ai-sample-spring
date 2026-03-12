<!-- Parent: ../AI-CONTEXT.md -->

# src/main/resources

## 목적
애플리케이션 설정, 데이터베이스 초기화 스크립트, 그리고 뷰 템플릿 등을 관리한다.

## 주요 파일
| 파일명 | 설명 |
| --- | --- |
| application.properties | Spring Boot 애플리케이션 환경 설정 |

## 하위 디렉토리
- `db/` - 데이터베이스 초기화 및 더미 데이터 스크립트
- `templates/` - 화면 렌더링을 위한 템플릿 파일

## AI 작업 지침
- 환경별(dev, prod 등) 속성은 `application.properties`로 관리한다.

## 테스트
- 해당 없음

## 의존성
- 해당 없음
