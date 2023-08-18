package com.example.philogram

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.philogram.main.MainPostItem
import java.time.LocalDateTime
import java.time.Month
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
object TestValues {

    var postItems = mutableListOf(
        MainPostItem(
            R.drawable.plato_profile,
            "Plato",
            R.drawable.plato1,
            "안녕? 난 플라톤 고대 철학자야! 고대 철학은 기하학에 영향을 받아 존재론에 대해서 유명론과 실재론으로 맞붙는 시기야. 나는 이 세계의 존재하는 모든 존재자의 근원과 본질을 밝히고, 그것을 보편적으로 규정지어 실재하는 세상을 현상계, 그리고 이 세상의 원형들이 모인 곳을 예지계로 두 가지 세계로 분류했어.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 15, 30),
        ),
        MainPostItem(
            R.drawable.plato_profile,
            "Plato",
            R.drawable.plato2,
            "세상엔 여러 모양의 도형들이 있어. 예를 들어 삼각형으로 들면, 옷걸이, 표지판등(현상계)이 있지 하지만, 이것이 완전한 삼각형이 아니어도 우리 마음 속에 삼각형에 대한 형태(예지계)가 심어져 있기 때문에 삼각형으로 인식하는 거라고 볼 수 있지.",
            LocalDateTime.of(2023, Month.JULY, 15, 20, 32),
        ),
        MainPostItem(
            R.drawable.plato_profile,
            "Plato",
            R.drawable.plato3,
            "예지계에 존재하는 이상적이고 완벽한 관념이 바로 이데아야. 이데아는 현상을 초월해 있는 비물질적인 정신적인 것으로 영원불변한 절대성을 지닌, 객관적이고 보편적으로 인식할 수 있는 실재야",
            LocalDateTime.of(2023, Month.JUNE, 8, 12, 31),
        ),
        MainPostItem(
            R.drawable.plato_profile,
            "Plato",
            R.drawable.plato4,
            "나의 제자 아리스토텔레스는 형이상학적인 이데아론에 반기를 들어 형이하학적인 자연탐구를 중시하는 현실적 입장을 취해. 그리고 난 중세 철학에 큰 영향을 미치고 나의 제자는 근대 철학에 큰 영향을 주었지.",
            LocalDateTime.of(2023, Month.MAY, 19, 16, 30),
        ),
        MainPostItem(
            R.drawable.plato_profile,
            "Plato",
            R.drawable.plato5,
            "중세 철학은 종교(신)와 철학의 융합으로 시작하지. 중세 초반에는 내가 우세하지만, 뒤늦게 나의 제자 아리스토텔레스가 재발견되어 나와 아리스토텔레스의 대결이라고 볼 수 있어. 중세에 천국의 세계를 이데아에 접목시켜 믿음과 이성의 균형을 중시하는 서양의 지적 전통이 생겨났지.",
            LocalDateTime.of(2023, Month.APRIL, 18, 15, 30),
        ),
        MainPostItem(
            R.drawable.descartes_profile,
            "Descartes",
            R.drawable.descartes1,
            "안녕? 난 데카르트 근대 철학자야! 근대 철학은 지식(근본)의 본성과 시작점에 대하여 경험인지, 선천적 관념인지에 대하여를 두고 맞붙는 시기야. 그리고 종교의 시대를 끝내고 과학의 시대가 열리는 시기가 바로 근대고 내가 바로 근대철학의 포문을 연 철학자야.",
            LocalDateTime.of(2023, Month.AUGUST, 20, 10, 30),
        ),
        MainPostItem(
            R.drawable.descartes_profile,
            "Descartes",
            R.drawable.descartes2,
            "나는 이전까지 쌓인 모든 지식과 심지어 \"1+1=2\" 같은 명제나 '내가 지금 필로그램을 하고 있다' 같은 당연해 보이는 모든 명제까지 철저하게 의심하고 의심하는 인식론을 제시했어. 그리고 모든 것을 의심해보고 내가 믿을 수 있는 단 한가지는 바로 Cogito, ergo sum. 철학의 출발점이 되는 명제야.",
            LocalDateTime.of(2023, Month.JULY, 7, 16, 27),
        ),
        MainPostItem(
            R.drawable.descartes_profile,
            "Descartes",
            R.drawable.descartes3,
            "이번 시간엔 Cogito, ergo sum.에 대해서 말해볼까해. 한국어로 말하면 \"나는 생각한다. 고로 존재한다.\"라는 뜻이야. 내가 모든 것을 의심하는 동안 믿을 수 있는 단 한가지 명제가 바로 이것이지. 내가 의심하고 있는 동안 만큼은 의심하고 있는 나의 존재를 의심할 여지가 없기 때문에 믿을 수 있는 단 한가지 명제야.",
            LocalDateTime.of(2023, Month.MAY, 27, 8, 10),
        ),
        MainPostItem(
            R.drawable.descartes_profile,
            "Descartes",
            R.drawable.descartes4,
            "이번 시간엔 Cogito, ergo sum.에 대해서 말해볼까해. 한국어로 말하면 \"나는 생각한다. 고로 존재한다.\"라는 뜻이야. 내가 모든 것을 의심하는 동안 믿을 수 있는 단 한가지 명제가 바로 이것이지. 내가 의심하고 있는 동안 만큼은 의심하고 있는 나의 존재를 의심할 여지가 없기 때문에 믿을 수 있는 단 한가지 명제야.",
            LocalDateTime.of(2023, Month.JULY, 17, 15, 29),
        ),
        MainPostItem(
            R.drawable.descartes_profile,
            "Descartes",
            R.drawable.descartes5,
            "근대의 마지막 철학은 경험과 관념을 통합시키는 철학이 등장하면서 근대 철학의 끝이 나려고 하지.",
            LocalDateTime.of(2023, Month.JUNE, 15, 5, 13),
        ),
        MainPostItem(
            R.drawable.nietzsche_profile,
            "Nietzsche",
            R.drawable.nietzsche1,
            "안녕? 난 니체 현대 철학자야! 근대 철학이 중세의 신 중심에서 인간 이성이 중심인 철학으로 변화 했듯이 현대철학은 이성이 중심인 시대에서 이성을 해체하는 철학으로 변화해갔어. 내가 '신은 죽었다.'(형이상학에 대한 거부)라고 선포한 이후부터, 서양 철학은 더 이상 신을 논하지 않게 되면서 현대 철학의 포문을 열었어.",
            LocalDateTime.of(2023, Month.AUGUST, 18, 3, 31),
        ),
        MainPostItem(
            R.drawable.nietzsche_profile,
            "Nietzsche",
            R.drawable.nietzsche2,
            "나의 허무주의는 \"모든 것은 허무하다\", \"덧없다\" 이런 것보다 깊은 의미를 가져. 감상적 느낌을 말하는 것이 아니라, 특정한 규범에 따른 진리, 가치, 의미, 도덕이 없는 상태라는 것을 말하는거야.",
            LocalDateTime.of(2023, Month.AUGUST, 21, 11, 30),
        ),
        MainPostItem(
            R.drawable.nietzsche_profile,
            "Nietzsche",
            R.drawable.nietzsche3,
            "나는 창조론을 벗어나 진화론인 관점에서 인간을 짐승들처럼 허무주의 속에 살아야한다고 생각했고, 살아남기 위해 \"힘에의 의지\"를 강조했고 삶의 생동성(힘에의 의지)이 다른 것들에 의해 조금도 훼손되지 않은 사람을 초인이라고 규정했어.",
            LocalDateTime.of(2023, Month.JULY, 10, 5, 27),
        ),
        MainPostItem(
            R.drawable.nietzsche_profile,
            "Nietzsche",
            R.drawable.nietzsche4,
            "현대 철학의 경향은 ‘데카르트 죽이기’와 ‘니체 살리기’가 서로 결합된 형태라 할 수 있어.\n그리고 분석 철학(낱낱히 해체하려는 철학)과 대륙 철학(종합하고자 하는 철학)이라고 볼 수 있지.",
            LocalDateTime.of(2023, Month.JUNE, 1, 13, 20),
        ),
        MainPostItem(
            R.drawable.nietzsche_profile,
            "Nietzsche",
            R.drawable.nietzsche5,
            "숲과 나무로 비유하면 분석 철학은 숲은 나무의 총합 그 이상도 그 이하도 아니야.\n숲을 이해하기 위해서는 나무들중에 나무 개체에 대해서 집중적으로 분석하는거라면, 대륙 철학은 숲을 올바르게 이해하기 위해서는 나무들의 관계, 나무는 거대한 숲 속에서 어떠한 역할을 담당하는지에 관심을 기울이지.",
            LocalDateTime.of(2023, Month.JUNE, 12, 3, 30),
        ),
        MainPostItem(
            R.drawable.buddha_profile,
            "Buddha",
            R.drawable.buddha1,
            "안녕? 난 4대 성인중 한명이고 인도의 사상가 붓다라고해. 대부분 불교가 종교인줄 알고 있을텐데, 불교는 학문이야. 종교가 불교라는 뜻은 부처님을 믿는다는 것이 아니라, 부처님의 가르침을 배우고 있다는 말이야.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 5, 27),
        ),
        MainPostItem(
            R.drawable.buddha_profile,
            "Buddha",
            R.drawable.buddha2,
            "나의 깨달음에 대해서 설명해줄게. 왕자로 태어나 좋은 것들만 보고 자라다 처음 생로병사를 접하고 괴로움을 없앨 방법을 찾고자 집을 나서게 되. 그리고 6년간 금욕, 단식을 하는 고행 수련을 했지. 쾌락도 수행의 장애가 되지만 고행도 수행의 장애가 된다는 사실을 깨닫게 됐지. 그리고 양극단을 떠나 자유로워지는 제3의 길 중도를 발견했어.",
            LocalDateTime.of(2023, Month.MAY, 8, 9, 18),
        ),
        MainPostItem(
            R.drawable.buddha_profile,
            "Buddha",
            R.drawable.buddha3,
            "자기 내면의 욕망과 성냄, 어리석음에서 벗어난 후 그대로의 세상을 보게 되는 깨달음을 얻었어. 그 깨달음은 만물은 서로 다 연관되어 존재하고 나라고 특정할 것도 없고, 천하 만물 중에 나 아닌 것이라고 할 것도 없는 것이야. 그리고 모든 것에는 원인이 있고 결과가 있음에 대해 사유했어. ",
            LocalDateTime.of(2023, Month.APRIL, 7, 13, 8),
        ),
        MainPostItem(
            R.drawable.buddha_profile,
            "Buddha",
            R.drawable.buddha4,
            "앞서 말한 깨달음으로 열반에 들어 모든 괴로움에서 벗어났지만, 수 많은 사람들이 스스로 괴로움을 만들고 고통 받으며 아우성치는 모습을 보면서 연민을 느끼고 이 깨닫는 방법을 알게 된다면 괴로움에서 벗어나 이 깨닫는 방법을 공유하기로 마음먹었어.",
            LocalDateTime.of(2023, Month.JULY, 12, 15, 30),
        ),
        MainPostItem(
            R.drawable.buddha_profile,
            "Buddha",
            R.drawable.buddha5,
            "시대가 발전됨에 따라, 동서양의 교류가 시작했고, 나의 가르침을 받아드리면서 플라톤의 철학에서 완전히 벗어나 현대철학으로 넘어가기 시작하지.",
            LocalDateTime.of(2023, Month.AUGUST, 3, 9, 30),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius1,
            "안녕? 난 4대 성인중 한명이고 중국의 사상가 공자라고해. 내 중심사상은 인이야. 인은 넓은 의미로 보면 인의예지의 덕목을 포괄하는 총칭이고, 좁은 의미로 보면 선의 근원이자 행의 기본이야.",
            LocalDateTime.of(2023, Month.AUGUST, 16, 15, 31),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius2,
            "지난 번엔 인에 대해서 알아봤으니 오늘은 나머지에 대해 알아보자. 인이 개인의 수양과 결부되어 마땅히 지켜야 할 인간적인 도리(道理)라면 의는 국가나 사회의 일원으로서 마땅히 지켜야 할 공적인 도리야.",
            LocalDateTime.of(2023, Month.JULY, 1, 7, 10),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius3,
            "이번엔 예에 대해서 알아볼게 의가 도덕적 실천에 있어 내면적이고 실질적인 측면이라면, 예는 외면적이고 형식적인 것이야. 예의 본질적인 의의는 인간생활에 있어서의 외부적 형식과 내면적 규범으로 나타나지.",
            LocalDateTime.of(2023, Month.APRIL, 13, 12, 15),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius4,
            "지는 옳고 그름을 구별할 수 있는 슬기, 즉 지적인 능력을 의미하지. 나의 제자 맹자는 지적인 능력있고 외형이 인간일지라도, 인의예지가 없다면 인간으로 생각하지 않고 예외처리를 했어. 그래서 성선설은 항상 참이 된다고 주장했지. 훗날 유교는 성선설과 성악설로 대립하기 시작해.",
            LocalDateTime.of(2023, Month.JUNE, 2, 7, 30),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius5,
            "맹자가 말하는 인성은 사람의 마음씨를 의미하고 선악은 도덕적 가치를 의미하고 순자가 말하는 인성은 욕망을 의미하고 선악은 사회적 치란을 의미해. 순자는 인성이 비록 악하지만, 그러나 인간의 후천적 노력에 의해 얼마든지 선한 방향으로 그것을 교정할 수가 있다고 보았어.",
            LocalDateTime.of(2023, Month.MAY, 12, 15, 30),
        ),
    )

    var mapUser = hashMapOf(
        0 to UserInfo(
            "Buddha",
            0,
            ArrayList(postItems.filter { it.txtPostUserName == "Buddha" }
                .sortedByDescending { it.postingDate }),
            "네팔",
            "공, 중도, 연기설, 열반(해탈)\n" +
                    "4대성인 (동서고금에 으뜸가는 네 성인)",
        ),
        1 to UserInfo(
            "Nietzsche",
            0,
            ArrayList(postItems.filter { it.txtPostUserName == "Nietzsche" }
                .sortedByDescending { it.postingDate }),
            "독일",
            " 허무주의, 초인, 힘에의 의지, 현대 철학의 경향은 ‘데카르트 죽이기’와 ‘니체 살리기’가 서로 결합된 형태라 할 수 있다."
        ),
        2 to UserInfo(
            "Plato",
            0,
            ArrayList(postItems.filter { it.txtPostUserName == "Plato" }
                .sortedByDescending { it.postingDate }),
            "그리스",
            "이데아 , 실재론, 서양 철학의 근본이자 서양 철학은 플라톤 철학의 주석이다. (형이상학의 창시자)"
        ),
        3 to UserInfo(
            "Descartes",
            0,
            ArrayList(postItems.filter { it.txtPostUserName == "Descartes" }
                .sortedByDescending { it.postingDate }),
            "프랑스",
            "관념론, 이원론(사유, 연장(존재)) , 근대 철학의 아버지 (데카르트를 기점으로 중세 철학에서 근대 철학으로 넘어왔다.)"
        ),
        4 to UserInfo(
            "Confucius",
            0,
            ArrayList(postItems.filter { it.txtPostUserName == "Confucius" }
                .sortedByDescending { it.postingDate }),
            "중국",
            "인, 의, 예, 지, 성선설" +
                    "\n" +
                    "4대성인 (동서고금에 으뜸가는 네 성인)"
        ),
    )

    fun findUserInfo(index: Int): UserInfo {
        return mapUser[index]!!
    }

    fun findUserFeed(index: Int): ArrayList<MainPostItem> {
        return mapUser[index]!!.feed
    }

    fun findNameByIndex(index: Int): String {
        return mapUser[index]!!.name
    }

    fun getViewByIndex(index: Int): Int {
        return mapUser[index]!!.view
    }

    fun addView(index: Int) {
        mapUser[index]!!.view++
    }

    fun getPostingDate(feed: MainPostItem): String {
        val customFormat = "yyyy년 MM월 dd일 HH시 mm분"
        val formatter = DateTimeFormatter.ofPattern(customFormat)

        return feed.postingDate.format(formatter)
    }

    fun sortByDate() {
        postItems = postItems.sortedByDescending { it.postingDate }.toMutableList()
    }
}

data class UserInfo(
    val name: String,
    var view: Int,
    var feed: ArrayList<MainPostItem>,
    val nation: String,
    val intro: String
)