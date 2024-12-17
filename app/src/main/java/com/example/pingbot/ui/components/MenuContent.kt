package com.example.pingbot.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun MenuContent(navController: NavHostController, drawerState: DrawerState, scope: CoroutineScope) {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(380.dp)
            .padding(end = 20.dp)
            .background(Color(0XFF478FCC)),
        color = Color(0XFF3D66CC),
        shape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp),
        shadowElevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Menu",
                style = MaterialTheme.typography.headlineLarge.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .padding(bottom = 32.dp)
            )


            MenuItem(
                text = "Home",
                icon = Icons.Default.Home,
                onClick = {
                    scope.launch {
                        navController.navigate("home")
                        drawerState.close()
                    }
                }
            )

            MenuItem(
                text = "Analytics",
                icon = Icons.Default.Build,
                onClick = {
                    scope.launch {
                        navController.navigate("analytics")
                        drawerState.close()
                    }
                }
            )

            MenuItem(
                text = "Perfil",
                icon = Icons.Default.Person,
                onClick = {
                    scope.launch {
                        navController.navigate("profile")
                        drawerState.close()
                    }
                }
            )

            MenuItem(
                text = "Suporte",
                icon = Icons.Default.Build,
                onClick = {
                    scope.launch {
                        navController.navigate("faq")
                        drawerState.close()
                    }
                }
            )
        }
    }
}