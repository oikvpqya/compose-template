package me.oikvpqya.playground.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import me.oikvpqya.playground.ui.greeting.GreetingRoute

const val GREETING_ROUTE = "greeting_route"

fun NavController.navigateToGreeting(navOptions: NavOptions? = null) {
    this.navigate(GREETING_ROUTE, navOptions)
}

fun NavGraphBuilder.greetingScreen(
    onShowSnackbar: suspend (String, String?) -> Boolean,
) {
    composable(route = GREETING_ROUTE) {
        GreetingRoute(onShowSnackbar = onShowSnackbar)
    }
}
