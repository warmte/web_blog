<template>
    <div id="post">
        <div class="row">
            <div class="container">
                <div class="8u skel-cell-important post-section">
                    <header>
                        <h2>{{post.title}}</h2>
                        <div class="date">
                            {{new Intl.DateTimeFormat('en-US', {year: 'numeric', month: 'long', day:
                            'numeric'}).format(new
                            Date(post.date))}}
                        </div>
                    </header>
                    <div class="post-text" v-html="post.text"></div>
                    <router-link :to="'/blog/'" class="button back"> Back to blog</router-link>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "TextPage",
        props: ['posts'],
        computed: {
            post: function () {
                return this.posts[this.findById(this.$route.params.id)]
            }
        },
        methods: {
            findById: function (id) {
                let counter = 0;
                for (const tmp of this.posts) {
                    if (tmp.id == id) {
                        return counter;
                    } else {
                        counter += 1;
                    }
                }
                return undefined;
            }
        }

    }
</script>

<style scoped>
</style>