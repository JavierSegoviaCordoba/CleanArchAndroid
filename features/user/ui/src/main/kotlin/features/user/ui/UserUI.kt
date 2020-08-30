package features.user.ui

import features.user.public.User

data class UserUI(val id: Long, val name: String, val email: String)

fun User.toUserUI() = UserUI(id = id, name = name, email = email)
