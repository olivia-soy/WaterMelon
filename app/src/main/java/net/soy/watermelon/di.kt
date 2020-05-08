package net.soy.watermelon

import net.soy.watermelon.api.SearchServiceApi
import net.soy.watermelon.model.NetworkRepositoryImpl
import net.soy.watermelon.model.Repository
import net.soy.watermelon.model.RetrofitFactory
import net.soy.watermelon.viewmodel.AllListViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

var viewModelPart = module {
    viewModel {
        AllListViewModel(get())
    }
}


val retrofitPart = module {
    single<SearchServiceApi> {
        RetrofitFactory.build().create(SearchServiceApi::class.java)
    }
}
//
//var adapterPart = module {
//    factory {
//        MainSearchRecyclerViewAdapter()
//    }
//}

//factory{} -> DataModelImpl() 를 만들어줌
var modelPart = module {
    factory<Repository> {
        NetworkRepositoryImpl(get())
    }
}

var myDiModule = listOf(retrofitPart, modelPart, viewModelPart)
