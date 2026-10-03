package ru.yandex.practicum.contacts.presentation.messengers

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import ru.yandex.practicum.contacts.R
import ru.yandex.practicum.contacts.presentation.ui.components.CommonBottomSheet

@Composable
fun MessengersBottomSheet(
    selectedApps: Set<MessagingApp>,
    onAppsSelected: (Set<MessagingApp>) -> Unit,
    onDismiss: () -> Unit
) {
    CommonBottomSheet(
        title = stringResource(R.string.filter_by_messaging_app),
        items = MessagingApp.entries,
        selectedItems = selectedApps,
        onItemsSelected = onAppsSelected,
        onDismiss = onDismiss
    ) { app, isSelected ->
        MessengerOption(
            isSelected = isSelected,
            app = app,
            selectedApps = selectedApps,
            onAppsSelected = onAppsSelected
        )
    }
}
