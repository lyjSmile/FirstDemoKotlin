package com.example.lingyajun.firstapplication

sealed class ViewType {

    object TypeGreen : ViewType()

    object TypeBlue : ViewType()

}

fun getView(type: ViewType) = when (type) {
    ViewType.TypeGreen -> GreenView()
    ViewType.TypeBlue -> BlueView()
}