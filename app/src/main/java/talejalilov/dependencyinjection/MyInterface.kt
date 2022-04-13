package talejalilov.dependencyinjection

import android.app.Application
import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import java.net.InterfaceAddress
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String


}
//yani dış kütüphanelerde İnject koyamadımız için bu modul-leri kullanıyoruz
@InstallIn(ActivityComponent :: class)
@Module
abstract  class MyModule{

    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor : InterfaceImplementor) :MyInterface

    @Singleton
    @Provides
    fun gSonProvider() : Gson{
        return Gson()
    }
}