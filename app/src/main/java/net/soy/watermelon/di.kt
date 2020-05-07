package net.soy.watermelon

import net.soy.watermelon.viewmodel.AllListViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

var viewModelPart = module {
    viewModel {
        AllListViewModel(get())
    }
}