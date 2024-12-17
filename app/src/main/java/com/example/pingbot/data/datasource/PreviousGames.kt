package com.example.pingbot.data.datasource

data class PreviousGames(
    val previousGames: List<Game>
)

val previousGamesList = PreviousGames(
    previousGames = listOf(
        Game(
            id = 0,
            player1 = Users[1],
            player2 = Users[2],
            score1 = 21,
            score2 = 15
        ),

        Game(
            id = 1,
            player1 = Users[2],
            player2 = Users[0],
            score1 = 21,
            score2 = 15
        ),
    )
)

