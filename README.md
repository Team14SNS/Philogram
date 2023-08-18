# 💀필로그램(Pillogram)

**철학자(Philosopher)** 와 별스타그램(~stagram)의 합성어인 <span style="color:red">**Philogram**</span>

## 📘Notion 주소

<https://www.notion.so/Philogram-d1585db7ee4a4bc78c668be8e4602cb9>

## 🐵팀원소개

| 이 름 | 역할 | 개인 Github 주소           |
| ------ | --- | ---------------------------- |
| 김소현 | 팀장 | <https://github.com/sinw212> |
| 주찬영 | 팀원 | <https://github.com/dannyjoo7> |
| 김민우 | 팀원 | <https://github.com/mwkimm> |
| 남경화 | 팀원 | <https://github.com/KyungHwa0> |
| 김지견 | 팀원 | <https://github.com/Odin5din> |

## 📱프로젝트 소개

### 💻기술스택

* Language - kotlin
* IDE - Android Studio

### 📖구현페이지

#### 1. 메인 페이지 (MainActivity)

* (로그인 안되어있는 경우) user 아이콘 클릭 시, 로그인페이지로 이동
* (로그인 되어있는 경우) user 아이콘 클릭 시, 마이페이지로 이동
* 철학자 5인 개인 프로필 구현, 프로필 사진 클릭 시 디테일페이지로 이동
* 철학자 5인 게시물 리스트 표시 (업로드 날짜 기준 정렬)
* 게시물 아이콘 or 사용자명 클릭 시, 해당 인물 디테일페이지로 이동
* 게시물 별 '좋아요' 아이콘 클릭 기능
* 게시물 이미지 클릭 시, 전체 이미지 팝업 창 출력
* 1줄 이상의 게시물 펼치기 / 접기 기능
* 개인 프로필(가로), 게시물 리스트(세로) 스크롤 기능

#### 2. 로그인 페이지 (LoginActivity)

* 아이디, 비밀번호를 입력받는 EditText를 넣어야함. (미리보기 글씨 있어야함)
* 비밀번호 EditText는 입력 내용이 가려져야 함.
* 로그인 버튼을 누르면 MainActivity가 실행
* 아이디/비밀번호 모두 입력 되어야만 로그인 버튼이 실행
* 회원가입 버튼을 누르면 SignUpActivity가 실행
* "비밀번호를 잊으셨나요" 클릭시 LoginFindPwActivity 실행
* '가입하기' 클릭시 SignUpActivity 실행

#### 3. 회원가입 페이지 (SignUpActivity)

* 아이디, 비밀번호, 성명, 사용자이름 모두 입력 되었을 때만 회원가입 가능
* 비밀번호 EditText는 입력 내용이 가려져야 함
* 중복된 아이디가 있으면 회원가입 불가능
* 회원가입 버튼이 눌리면 SingleTone에 회원정보(id,pw,name,nickName,nation=null, intro=null)가 담긴후 SignInActivity로
  이동.

#### 4. 비밀번호 재설정 페이지 (LoginFindPwActivity)

* 아이디를 입력받는 EditText를 넣어야함. (미리보기 글씨 있어야함)
* 입력한 아이디가 저장된 아이디와 일치한 경우 "비밀번호 재설정" 버튼 클릭시 새비밀번호 입력할수 있는 EditText로 변경이 되고, EditText InputType 또한
  PASSWORD 로 변경.
* "비밀번호 변경" 버튼 클릭시 원래 저장되어있던 Pw가 재설정된 비밀번호로 저장.
* "로그인으로 돌아가기 " 클릭시 LoginActivity로 이동(finish)

#### 5. 디테일 페이지 (DetailActivity)

* 메인페이지에서 선택한 요소의 정보를 가져와 더욱더 자세한 정보 표시 페이지
* Posts로 게시물 숫자 표시
* Views로 방문 숫자 표시
* 3 x 3으로 피드 요소 간략히 표시
* 해당 피드 클릭 시 보다 자세한 정보가 담긴 페이지로 전환
* 만약 사용자가 로그인 후 자신의 디테일 페이지 방문 시 편집 기능과 로그 아웃 기능 제공

#### 6. 게시물 리스트 페이지 (FeedActivity)

* 사용자가 기존에 올린 피드들을 시간 순으로 정렬해 보여줌
* 좋아요 기능 및 피드 본문의 내용을 확인할 수 있음
* 만약 피드 본문의 길이가 1줄 이상 넘어 갔을 시 더보기 기능 사용 가능
* 스크롤을 통해 해당 사용자의 모든 피드를 확인 가능

#### 7. 편집 페이지 (MyPageEditActivity)

* 마이페이지에서 '편집' 아이콘을 클릭 시, 이동이 가능한 페이지
* 로그인페이지에서 닉네임 데이터가 편집페이지로 불러와집니다.
* 국적, 소개 텍스트에 텍스트 입력 후 저장버튼 수정된내용 저장 후 디테일페이지 이동

### 🔧 그 외 기능

* 앱 실행아이콘 변경
* icon 및 button 클릭 시 pressed 효과 추가
* 세로/가로 UI 분리
* 언어 변경 자동 대응 (영문)
* 다크모드 자동 대응
* Font 크기 자동 대응
* Singleton Pattern 사용
