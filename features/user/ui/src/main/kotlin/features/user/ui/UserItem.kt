package features.user.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.EmphasisAmbient
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideEmphasis
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import features.user.fake.fakeUser

@Composable
fun UserItem(user: UserUI) {
    Column(Modifier.background(Color.White).padding(16.dp)) {
        Text(text = user.name, style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.preferredHeight(8.dp))
        ProvideEmphasis(EmphasisAmbient.current.medium) {
            Text(text = user.email, style = MaterialTheme.typography.caption)
        }
    }
}

@Preview
@Composable
fun PreviewUser() {
    UserItem(fakeUser.toUserUI())
}
