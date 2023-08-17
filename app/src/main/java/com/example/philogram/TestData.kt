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
            R.drawable.buddha_profile,
            "Buddha",
            R.drawable.buddha1,
            "석가모니는 불교의 교조이자 창시자이며, 여러 붓다(부처) 중 하나다. 본명은 고타마 싯타르타. 고타마가 성씨이며 싯타르타가 이름이다.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 15, 30),
        ),
        MainPostItem(
            R.drawable.plato_profile,
            "Plato",
            R.drawable.plato1,
            "플라톤의 연구 분야는 형이상학, 정치학, 윤리학, 인식론 등 서양 철학의 온갖 영역에 걸쳐있으며, 플라톤 이후의 유럽 철학은 \"플라톤에 대한 일련의 각주들\"(화이트헤드)라는 평가까지 있을 정도로 매우 중요한 학자이다",
            LocalDateTime.of(2023, Month.AUGUST, 17, 15, 32),
        ),
        MainPostItem(
            R.drawable.nietzsche_profile,
            "Nietzsche",
            R.drawable.nietzsche1,
            "특유의 급진적인 사상으로 생철학, 실존주의, 포스트모더니즘 등의 철학에 가장 많은 영향을 미쳤으며, 현대 대륙 철학의 근간을 마련했다.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 15, 31),
        ),
        MainPostItem(
            R.drawable.descartes_profile,
            "Descartes",
            R.drawable.descartes1,
            "근대 철학의 포문을 연 프랑스의 철학자, 수학자, 과학자. 그는 방법적 회의를 통해 \"나는 생각한다. 고로 존재한다\"는 것이야말로 모든 것을 의심하더라도 더 이상 의심할 수 없는 진리라 확신하고는, 이를 모든 학문의 제1 원리로 정립하였다.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 16, 30),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius1,
            "30대부터 제자 양성을 시작했고, 50대에 이르러 노나라의 중도재(中都宰)를 지냈는데 잘 다스렸다.",
            LocalDateTime.of(2023, Month.AUGUST, 18, 15, 30),
        ),
        MainPostItem(
            R.drawable.descartes_profile,
            "Descartes",
            R.drawable.descartes2,
            "데카르트의 이러한 철학적 방법론은 이후 근대의 수많은 학자들을 자극시켜 자연과학과 수학에 있어서 급격한 발전을 이끌어낸다.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 10, 30),
        ),
        MainPostItem(
            R.drawable.nietzsche_profile,
            "Nietzsche",
            R.drawable.nietzsche2,
            "특유의 공격적 비판으로 인해 오인되기도 하지만, 어떤 철학자보다 넓은 사상의 스펙트럼을 가지고 있는 철학자이며 그의 저서는 보는 사람의 시각에 따라 극단적일 정도로 다양하게 해석되고 있다.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 12, 30),
        ),
        MainPostItem(
            R.drawable.plato_profile,
            "Plato",
            R.drawable.plato2,
            "소크라테스의 제자이자 아카데메이아의 창설자로, 제자인 아리스토텔레스와 함께 고전기 헬라스 철학을 대표하는 학자이다.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 15, 10),
        ),
        MainPostItem(
            R.drawable.buddha_profile,
            "Buddha",
            R.drawable.buddha2,
            "정반왕과 마야부인 사이에서 왕자로 태어났으나, 인간의 삶이 늙고 병들고 죽는 고통으로 이루어져 있다는 것을 인식하고 이를 벗어나고자, 이후 왕세자의 지위를 버리고 출가하여 많은 수행 끝에 '감정이라는 악마'의 유혹을 견뎌내고 보리수 나무 아래에서 깨달음을 얻었다.",
            LocalDateTime.of(2023, Month.AUGUST, 17, 15, 29),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius2,
            "공자는 춘추시대 유학(儒學)자이다. 주나라의 예(禮)와 악(樂)을 정리하여 유학의 기초 경전을 정립하였으며,이 예악을 바탕으로 하는 정치 실현을 목표로 수많은 제자들을 가르쳤다. 사실상 유학의 창시자라 볼 수 있다. 노(魯)나라에서 태어나 자랐고, 어려서부터 예(禮)에 밝았다.",
            LocalDateTime.of(2023, Month.AUGUST, 16, 15, 32),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius2,
            "공자는 춘추시대 유학(儒學)자이다. 주나라의 예(禮)와 악(樂)을 정리하여 유학의 기초 경전을 정립하였으며,이 예악을 바탕으로 하는 정치 실현을 목표로 수많은 제자들을 가르쳤다. 사실상 유학의 창시자라 볼 수 있다. 노(魯)나라에서 태어나 자랐고, 어려서부터 예(禮)에 밝았다.",
            LocalDateTime.of(2023, Month.AUGUST, 16, 15, 31),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius2,
            "공자는 춘추시대 유학(儒學)자이다. 주나라의 예(禮)와 악(樂)을 정리하여 유학의 기초 경전을 정립하였으며,이 예악을 바탕으로 하는 정치 실현을 목표로 수많은 제자들을 가르쳤다. 사실상 유학의 창시자라 볼 수 있다. 노(魯)나라에서 태어나 자랐고, 어려서부터 예(禮)에 밝았다.",
            LocalDateTime.of(2023, Month.APRIL, 17, 15, 30),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius2,
            "공자는 춘추시대 유학(儒學)자이다. 주나라의 예(禮)와 악(樂)을 정리하여 유학의 기초 경전을 정립하였으며,이 예악을 바탕으로 하는 정치 실현을 목표로 수많은 제자들을 가르쳤다. 사실상 유학의 창시자라 볼 수 있다. 노(魯)나라에서 태어나 자랐고, 어려서부터 예(禮)에 밝았다.",
            LocalDateTime.of(2023, Month.FEBRUARY, 17, 15, 30),
        ),
        MainPostItem(
            R.drawable.confucius_profile,
            "Confucius",
            R.drawable.confucius2,
            "공자는 춘추시대 유학(儒學)자이다. 주나라의 예(禮)와 악(樂)을 정리하여 유학의 기초 경전을 정립하였으며,이 예악을 바탕으로 하는 정치 실현을 목표로 수많은 제자들을 가르쳤다. 사실상 유학의 창시자라 볼 수 있다. 노(魯)나라에서 태어나 자랐고, 어려서부터 예(禮)에 밝았다.",
            LocalDateTime.of(2023, Month.MAY, 12, 15, 30),
        ),
    )

    var mapUser = hashMapOf(
        0 to UserInfo(
            "Buddha",
            5,
            ArrayList(postItems.filter { it.txtPostUserName == "Buddha" }
                .sortedByDescending { it.postingDate }),
            "네팔",
            "공, 중도, 연기설, 열반(해탈)\n" +
                    "4대성인 (동서고금에 으뜸가는 네 성인)",
        ),
        1 to UserInfo(
            "Nietzsche",
            4,
            ArrayList(postItems.filter { it.txtPostUserName == "Nietzsche" }
                .sortedByDescending { it.postingDate }),
            "독일",
            " 허무주의, 초인, 힘에의 의지, 현대 철학의 경향은 ‘데카르트 죽이기’와 ‘니체 살리기’가 서로 결합된 형태라 할 수 있다."
        ),
        2 to UserInfo(
            "Plato",
            3,
            ArrayList(postItems.filter { it.txtPostUserName == "Plato" }
                .sortedByDescending { it.postingDate }),
            "그리스",
            "이데아 , 실재론, 서양 철학의 근본이자 서양 철학은 플라톤 철학의 주석이다. (형이상학의 창시자)"
        ),
        3 to UserInfo(
            "Descartes",
            2,
            ArrayList(postItems.filter { it.txtPostUserName == "Descartes" }
                .sortedByDescending { it.postingDate }),
            "프랑스",
            "관념론, 이원론(사유, 연장(존재)) , 근대 철학의 아버지 (데카르트를 기점으로 중세 철학에서 근대 철학으로 넘어왔다.)"
        ),
        4 to UserInfo(
            "Confucius",
            1,
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