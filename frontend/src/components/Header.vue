<!--suppress HtmlUnknownAnchorTarget -->
<template>
        <div id="header">
            <div class="container">
                <!-- Logo -->
                <div id="logo">
                    <h1><a href="/">Ilona Bozhe</a></h1>
                    <span>Following my inner moonlight</span>
                </div>

                <!-- Nav -->
                <nav id="nav">
                    <ul>
                        <li><router-link to="/">About me</router-link></li>
                        <li><router-link to="/blog">Blog</router-link></li>
                    </ul>
                </nav>
            </div>
        </div>
</template>

<script>
    export default {
        name: "Header",
        methods: {
            changePage: function (page) {
                this.$root.$emit("onChangePage", page);
            },
            goBack() {
                window.history.length > 1 ? this.$router.go(-1) : this.$router.push('/')
            }
        },
        computed: {
            username() {
                return this.$route.params.username
            }
        }
    }
</script>

<style scoped>
    header .languages a {
        margin-left: 0.25rem;
    }
</style>
