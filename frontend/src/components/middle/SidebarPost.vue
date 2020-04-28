<template>
    <li>
        <section>
            <div id="sidebar-post">
                <router-link :to="'/blog/' + post.id"><div class="img-wrap"><img :src="post.image" alt=""/></div></router-link>
                <div class="text">
                    <router-link :to="'/blog/' + post.id"><h2>{{post.title}}</h2></router-link>
                    <div class="date">
                        {{new Intl.DateTimeFormat('en-US', {year: 'numeric', month: 'long', day: 'numeric'}).format(new
                        Date(post.date))}}
                    </div>
                </div>
            </div>
        </section>
    </li>
</template>

<script>
    export default {
        props: ['post'],
        name: "SidebarPost",
    }
</script>

<style scoped>

</style>
