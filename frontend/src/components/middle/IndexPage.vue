<template>
    <div class="container">
        <div class="row">
            <!-- Content -->
            <div id="content" class="8u skel-cell-important">
                 <WelcomeText/>
            </div>
            <!-- Sidebar -->
            <div id="sidebar" class="4u">

                <section class="sidebar-section">
                    <header>
                        <h2>Recent posts</h2>
                    </header>

                    <ul class="style">
                        <SidebarPost  class="style" v-for="post in viewPosts" :post="post" :key="post.id"/>
                    </ul>
                </section>
            </div>
        </div>
    </div>
</template>

<script>
    import SidebarPost from './SidebarPost.vue'
    import WelcomeText from "./Texts/WelcomeText";

    export default {
        name: "Index",
        props: ['posts'],
        computed: {
            viewPosts: function () {
                return Object.values(this.posts).sort((a, b) => b.id - a.id).slice(0, 3);
            }
        },
        components: {
            WelcomeText,
            SidebarPost
        },
        methods: {
            goBack() {
                window.history.length > 1 ? this.$router.go(-1) : this.$router.push('/')
            }
        }
    }
</script>

<style scoped>

</style>
