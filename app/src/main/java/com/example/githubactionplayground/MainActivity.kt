package com.example.githubactionplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//sealed class UiState {
//    object Idle : UiState()
//    object Loading : UiState()
//    data class Data(val items: List<Int>) : UiState()
//    data class Failed(val message: String) : UiState()
//}
//
//data class UiState2(
//    val items: List<Int>,
//    val isLoading: Boolean,
//    val errorMessage: String? = null
//)
//
//fun main() {
//
//    val initial = UiState2(emptyList(), false, 1)
//
//    val state = MutableStateFlow(initial)
//
//    state.value = initial.copy(isLoading = true, )
//
//    val newState = newState1.copy(items = listOf(1), isLoading = false)
//
//
//}






