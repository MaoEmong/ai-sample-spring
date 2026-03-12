<!-- Parent: ../AI-CONTEXT.md -->

# src/main/resources/templates

## 목적
화면을 구성하는 Mustache 뷰 템플릿 파일들을 포함한다.

## 주요 파일
| 파일명 | 설명 |
| --- | --- |
| home.mustache | 메인 홈 화면 템플릿 |

## 하위 디렉토리
- `layout/` - 공통 레이아웃 (헤더, 푸터 등) 템플릿

## AI 작업 지침
- Mustache 문법을 준수하여 작성한다.
- 재사용 가능한 레이아웃은 `layout/` 디렉토리로 분리한다.

## 테스트
- 화면 렌더링 테스트

## 의존성
- 내부: Mustache 템플릿 엔진
