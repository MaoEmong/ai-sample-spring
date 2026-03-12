<!-- Parent: ../AI-CONTEXT.md -->

# src/main/resources/templates/layout

## 목적
모든 화면에서 공통으로 사용되는 레이아웃 파일 조각들을 포함한다.

## 주요 파일
| 파일명 | 설명 |
| --- | --- |
| footer.mustache | 공통 하단 영역 템플릿 |
| header.mustache | 공통 상단 영역 및 내비게이션 템플릿 |

## 하위 디렉토리
- 없음

## AI 작업 지침
- 각 템플릿에 `{{> layout/header}}` 방식으로 포함되도록 설계한다.

## 테스트
- 해당 없음

## 의존성
- 해당 없음
