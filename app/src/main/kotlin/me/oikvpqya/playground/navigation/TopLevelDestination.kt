package me.oikvpqya.playground.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.ui.graphics.vector.ImageVector
import me.oikvpqya.playground.R

enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    GREETING(
        selectedIcon = Icons.Rounded.Add,
        unselectedIcon = Icons.Rounded.Add,
        iconTextId = R.string.greeting,
        titleTextId = R.string.greeting,
    )
}
