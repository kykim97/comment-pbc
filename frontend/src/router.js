
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CommentCommentaryManager from "./components/listers/CommentCommentaryCards"
import CommentCommentaryDetail from "./components/listers/CommentCommentaryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/comments/commentaries',
                name: 'CommentCommentaryManager',
                component: CommentCommentaryManager
            },
            {
                path: '/comments/commentaries/:id',
                name: 'CommentCommentaryDetail',
                component: CommentCommentaryDetail
            },



    ]
})
