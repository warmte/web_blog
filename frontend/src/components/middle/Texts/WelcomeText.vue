<template>
    <div class="multilanguage">
        <div class="post-section">
            <header>
                <h2 v-if="eng">Welcome!</h2>
                <h2 v-else>Добро пожаловать!</h2>

                <span v-if="eng" class="byline">Glad to see you on my personal page.</span>
                <span v-else class="byline">Рада видеть вас на моей страничке.</span>
            </header>

            <div class="image full"><img
                    src="https://lh3.googleusercontent.com/Gs78qLQ7BQqx7HMhDK7kgKYmkDLwAXoINYQrXhbXffXRV8Dt2xOcxqQfRYUDfUCyelTRYDx8kW73hO3c1Neq0UF-FTmApCjfBrFbY98znQkKxw1V2HffKBH1dswUQufKUBmaqMpLOQNkh-KMilMDn0J0ZXCMJEQ3sWqF7EaDCLqFSj_KGrJ13XR_PtgsWGvbCydQbI5CI-YYvW0D481aLneXYpGimUSa6Ddlh47PEwdEq1oenLwl0aLA5CbzsA7xTCwN7HI3HlkAA8Au3kNvfmbphu5WYAP4S86ku0l2I9GAO5xp3L2xwO498fcO2tGSCs0bjJ5BOzuPq_eTT6t6l5RILoSvD07ss7QMEI3mPOfWZSNkj52sJa63AFiu0xoYebzu-7pJ69TY7ymrtQH4O_hTDlL4xAEK8Ynq09N9d9eZwyDv2_z5rqGpjBsJCCyUEs1xbwEIZ6z5guzk1ow9EeHsG2gHPFuhaUhz0JgBe7UA5XhL9pu1sRjZVBvp5DywX85pYGp7MFiQeDjTg0h-sza-wIK4DW1Rmx5gybx7GLUCeEG6wN0pRwJ97OKpBfMMqs9wCYkPyy4TmbLwYBpdSdIuK0nQaGbxcjiRdkF4JFfn-At_lDDy_4gV-72_h9ZHZEYRE3ev9RYiUtRqHULWJ_dw1zdXU68pONC1TZ4tG67OxoEMyaj-UAZVOfjhsOIs1ftfJDkqHVhZmNGArfI0gcxQ1i6hyFSb6vMuUtCAvggjVTsrRpEr2Z8=w1109-h496-no"
                    alt=""/></div>

            <div class="post-text">
                <p v-if="eng">
                    My name is Ilona,
                    I'm Computer Science student in <a href="https://en.itmo.ru/en/" target="_blank"> ITMO
                    Univercity</a>,
                    ex-<a href="https://google.com" target="_blank">Google</a> <a href="https://youtube.com"
                                                                                  target="_blank">YouTube</a> intern,
                    big fan of dancing, self-taught artist and just a person who is trying to live in harmony with the
                    world
                    and with herself. </p>
                <p v-else>
                    Меня зовут Илона,
                    я студентка на Computer Science в <a href="https://itmo.ru/ru/" target="_blank">Университете
                    ИТМО</a>,
                    экс-стажёр <a href="https://google.com" target="_blank">Google</a> <a href="https://youtube.com"
                                                                                          target="_blank">YouTube</a>,
                    горячий фанат танцев, художник-самоучка и просто человек, который пытается жить в гармонии с миром и
                    с
                    самим собой.</p>

                <p v-if="eng">
                    I was born in <a href="https://goo.gl/maps/eQTcfTTfzTpS6MWL7" target="_blank"> Chelyabinsk</a> city
                    located in the Urals in the middle of Russia. My childhood was spent
                    there among local forests and lakes and I love this time so much.
                    Now I live in Saint Petersburg, walking around the streets and breathing the air full of people's
                    memories.
                </p>
                <p v-else>
                    Я родилась на Урале, в <a href="https://goo.gl/maps/eQTcfTTfzTpS6MWL7" target="_blank">
                    Челябинске</a>. Там, среди местных озёр и лесов, прошло моё детство, и я
                    вспоминаю это время с большой любовью.
                    Теперь я живу в городе на Неве, гуляю по петербуржским улицам и дышу воздухом, пропитанным чужими
                    воспоминаниями.
                </p>

                <p v-if="eng">
                    I like traveling. I always happy to explore new places and enjoy their unique atmosphere, learn
                    something new from people there.
                    No matter where exactly: I equally love searching cozy cafes in my city and climbing mountains far
                    from
                    civilization.
                    Sometimes I write notes about my life, because I like telling stories also. This page appeared
                    when I decided to systematize these notes somehow.
                </p>
                <p v-else>
                    Я люблю путешествовать. Мне всегда нравилось исследовать новые места и наслаждаться их особенной
                    атмосферой, узнавать что-то новое от людей, которых я встречаю.
                    Не важно, как далеко: я одинаково люблю открывать для себя уютные кофейни или взбираться на высокие
                    горы
                    вдали от цивилизации.
                    Ещё мне нравится рассказывать истории, поэтому иногда я пишу заметки о своей жизни. Собственно, эта
                    страничка появилась, когда я решила как-нибудь систематизировать то, что написала.
                </p>

                <p v-if="eng">
                    You can check my blog
                    <router-link to="/blog">here</router-link>
                    ,
                    in <a href="https://www.instagram.com/_warmte_/">Instagram</a> (@_warmte_) and
                    <a href="https://t.me/ilona_speaks">Telegram</a> (@ilona_speaks).
                </p>
                <p v-else>
                    На мой блог можно посмотреть
                    <router-link to="/blog">здесь</router-link>
                    ,
                    в <a href="https://www.instagram.com/_warmte_/">Instagram</a> (@_warmte_) и в
                    <a href="https://t.me/ilona_speaks">Telegram</a> (@ilona_speaks).
                </p>

                <p v-if="eng">Enjoy!</p>
                <p v-else>Удачи!</p>
            </div>
        </div>
        <div class="languages">
            <button v-on:click="eng = true"><img src="../../../../public/img/gb.png" alt="In English"
                                                 title="In English"/></button>
            <button v-on:click="eng = false"><img src="../../../../public/img/ru.png" alt="In Russian"
                                                  title="In Russian"/></button>
        </div>
    </div>
</template>

<script>
    export default {
        name: "WelcomeText",
        data: function () {
            return {
                eng: true
            }
        },

    }
</script>

<style scoped>

</style>