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
#### 1. 메인페이지(MainActivity)

#### 2. 로그인페이지(LoginActivity)
* 아이디, 비밀번호를 입력받는 EditText를 넣어야함. (미리보기 글씨 있어야함)
* 비밀번호 EditText는 입력 내용이 가려져야 함.
* 로그인 버튼을 누르면 MainActivity가 실행
* 아이디/비밀번호 모두 입력 되어야만 로그인 버튼이 실행
* 회원가입 버튼을 누르면 SignUpActivity가 실행
* "비밀번호를 잊으셨나요" 클릭시 LoginFindPwActivity 실행
* '가입하기' 클릭시 SignUpActivity 실행

#### 3. 회원가입페이지(SignUpActivity)
* 아이디, 비밀번호, 성명, 사용자이름 모두 입력 되었을 때만 회원가입 가능
* 비밀번호 EditText는 입력 내용이 가려져야 함
* 중복된 아이디가 있으면 회원가입 불가능
* 회원가입 버튼이 눌리면 SingleTone에 회원정보(id,pw,name,nickName,nation=null, intro=null)가 담긴후 SignInActivity로 이동.

#### 4. 비밀번호재설정페이지(LoginFindPwActivity)
* 아이디를 입력받는 EditText를 넣어야함. (미리보기 글씨 있어야함)
* 입력한 아이디가 저장된 아이디와 일치한 경우 "비밀번호 재설정" 버튼 클릭시 새비밀번호 입력할수 있는 EditText로 변경이 되고, EditText InputType 또한 PASSWORD 로 변경.
* "비밀번호 변경" 버튼 클릭시 원래 저장되어있던 Pw가 재설정된 비밀번호로 저장.
* "로그인으로 돌아가기 " 클릭시 LoginActivity로 이동(finish)

#### 5. 디테일페이지()

#### 6. 피드()

#### 7. 마이에디트페이지(MyPageEditActivity)
* 닉네임 데이터가 마이에디트페이지로 불러와집니다.
* 국적, 소개 텍스트에 텍스트 입력 후 저장버튼 수정된내용 저장 후 디테일페이지 이동
  

### 🔧 그 외 기능
* 앱 실행아이콘 변경
* 언어 변경(영문)
* 다크모드 추가
* pressed 옵션 기능 추가
* Font 크기 조절



