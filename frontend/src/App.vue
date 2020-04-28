<template>
    <!--suppress HtmlUnknownTag -->
    <body id="app">
    <Header/>
    <Middle :posts="posts"/>
    <Footer/>
    </body>
</template>

<script>
    import Header from './components/Header'
    import Middle from './components/Middle'
    import Footer from "./components/Footer"
    import axios from 'axios'

    export default {
        name: 'app',
        data: function () {
            // return this.$root.$data;
            return {
                posts: []
            }
        },
        components: {
            Footer,
            Header,
            Middle
        },
        computed: {
            username() {
                return this.$route.params.username
            }
        },
        methods: {
            goBack() {
                window.history.length > 1 ? this.$router.go(-1) : this.$router.push('/')
            }
        }, beforeCreate() {
            axios.get("/blog/posts").then(posts => this.posts = posts.data);
        }
    }
</script>

<style>
    @import "../public/css/style-text.css";
    @import "../public/css/style.css";
    @import "../public/css/style-blog.css";
</style>
