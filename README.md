# Game Spring Basic Assignment

Spring Boot 기반 카드 게임 API 학습 과제입니다.

- **Repository**: https://github.com/pm2979/game-spring-basic-assignment
- **기술 스택**: Spring Boot, Spring MVC, Spring Data JPA, Validation, MySQL(Docker), Gradle

## 진행 현황

| Lv | 구분 | 내용 | 상태 |
|----|------|------|------|
| 1 | 필수 | Docker MySQL datasource 설정 | ✅ |
| 2 | 필수 | GameService `@Service` 빈 등록 수정 | ✅ |
| 3 | 필수 | 게임 목록 API 경로(`/games`) 수정 | ✅ |
| 4 | 필수 | 게임 생성 트랜잭션 읽기전용 → 쓰기 수정 | ✅ |
| 5 | 필수 | 게임 생성 요청/응답 DTO 구현 | ✅ |
| 6 | 필수 | 보상 카드 선택·진행 저장 API | ✅ |
| 7 | 필수 | 게임 목록/상세 조회 API | ✅ |
| 8 | 필수 | 플레이어 이름 변경(더티 체킹)·게임 삭제 | ✅ |
| 9 | 도전 | 종료된 게임 진행 저장 시 409 처리 | ✅ |
| 10 | 도전 | 전역 예외 처리 (404 / 409 message) | ✅ |
| 11 | 도전 | N+1 없는 카드 수 DTO projection | ✅ |
| 12 | 도전 | 랭킹 | ⬜ 미진행 |
