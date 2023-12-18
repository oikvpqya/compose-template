package me.oikvpqya.playground.ui.greeting

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.oikvpqya.playground.ui.component.Greeting

@Composable
internal fun GreetingRoute(
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
) {
    GreetingScreen(
        onShowSnackbar = onShowSnackbar,
        modifier = modifier,
    )
}

@Composable
internal fun GreetingScreen(
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
) {
    Greeting()
}
