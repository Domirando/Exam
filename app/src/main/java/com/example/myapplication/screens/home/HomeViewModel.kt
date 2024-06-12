package com.example.myapplication.screens.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.database.Item

class HomeViewModel(val model: HomeModel) : ViewModel() {
    private var _items = MutableLiveData(mutableListOf<Item>())
    val items: LiveData<MutableList<Item>> = _items

    val database = listOf(
        Item(name = "Gravitatsiya qonuni?!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
                "\n" +
                "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Ishqalanish kuchi!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
                "\n" +
                "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Energiya bu nima?!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
                "\n" +
                "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Kinetik energiya va potensial energiyalar farqi!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
                "\n" +
                "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Gravitatsiya qonuni???!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
                "\n" +
                "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Ishqalanish kuchi!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
                "\n" +
                "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Gravitatsiya qonuni?!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
        "\n" +
        "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Ishqalanish kuchi!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
        "\n" +
        "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Energiya bu nima?!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
        "\n" +
        "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
        Item(name = "Kinetik energiya va potensial energiyalar farqi!", description = "Gravitatsiya tufayli Yer va boshqa sayyoralar Quyosh atrofida, Oy Yer atrofida aylanadi; sayyora va yulduzlar ichi qiziydi; tabiatda konveksiya sodir boʻladi va hk.\n" +
        "\n" +
        "Gravitatsiya toʻrt fundamental oʻzaro taʼsirdan biridir (boshqalari — elektromagnetizm, kuchli oʻzaro taʼsir va kuchsiz oʻzaro taʼsir)."+"\n"+"Savol!\n Nima Nyutonning Gravitatsiya qonuniga asoslangan?"),
    )
    init {
        if (model.isFirstRun()) addItems()
        getItems()
    }

    private fun getItems() {
        _items.value = model.getItems()
    }

    private fun addItems() {
        for (item in database) {
            model.addItem(item)
        }
    }
}